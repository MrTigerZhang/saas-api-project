package fun.swinner.accounting.api;

import lombok.extern.slf4j.Slf4j;

/**
 * 抓取凭证
 *
 * @author zhangtai
 * @date 2025年10月13日
 */
@Slf4j
public class RemoteFetchVouchersTransCallbackServiceMock implements RemoteFetchVouchersTransCallbackService {


    /**
     * 触发凭证抓取任务。 通过transsctionId获取事务记录，businessKey为TenantId:
     *
     * @param businessKey   tenantId
     * @param transactionId json 数据，
     * @return return msg
     */
    @Override
    public String call(String businessKey, String transactionId) {
        log.warn("fun.swinner.accounting.api.RemoteFetchVouchersTransCallbackServiceMock#call ————>服务降级！");
        return "";
    }
}
