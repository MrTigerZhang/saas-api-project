package fun.swinner.accounting.api;

import lombok.extern.slf4j.Slf4j;

/**
 * Dubbo 记账事务回调接口
 * transaction->this
 *
 * @author zhangtai
 * @date 2025年10月10日
 */
@Slf4j
public class RemoteJournalTransactionCallbackServiceMock implements RemoteJournalTransactionCallbackService {

    /**
     * 由定时任务事务框架回调，查询出对应的未记账的数据，进行记账操作（记录到单据表）
     *
     * @param data json 数据，
     * @return return msg
     */
    @Override
    public String journalCall(String data) {
        log.warn("服务降级");
        return null;
    }
}
