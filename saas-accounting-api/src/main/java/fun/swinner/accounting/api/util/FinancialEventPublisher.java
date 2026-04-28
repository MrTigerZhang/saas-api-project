package fun.swinner.accounting.api.util;

import com.taigod.common.mq.core.StreamEventPublisher;
import fun.swinner.accounting.api.event.FinancialEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 业务系统调用入口
 * 财务代理事件发布器
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class FinancialEventPublisher {

    @Autowired
    private StreamEventPublisher publisher;

    /**
     * 发布财务事件
     * （异步或同步取决于 Spring 事件监听器的 @Async 配置，为了保证在当前事务内发生异常降级，建议当前阶段默认同步）
     * 
     * @param event 组装好的标准业务快照
     */
    public void publish(FinancialEvent event) {
        log.info("【Financial Proxy】开始发布财务事件，场景码：{}, 来源单号：{}", event.getBusinessCode(), event.getSourceNo());
        // 使用 spring cloud stream 发送事件
        // 1. 确定 Binding 名称（通常与配置文件中的 output 绑定名一致，这里假设为 financial_event）
        String bindingName = "saas-accounting_financial_topic";
        // 2. 确定消息 Key（通常用于分区，建议使用业务单号或租户ID）
        String messageKey = "create_voucher";
        // 3. 发送
        publisher.publish(bindingName, event, messageKey);
    }
}
