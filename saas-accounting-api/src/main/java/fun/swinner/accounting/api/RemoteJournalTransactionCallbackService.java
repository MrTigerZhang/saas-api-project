package fun.swinner.accounting.api;

/**
 * Dubbo 记账事务回调接口
 * transaction->this
 *
 * @author zhangtai
 * @date 2025年10月10日
 */
public interface RemoteJournalTransactionCallbackService {

    /**
     * 由定时任务事务框架回调，查询出对应的未记账的数据，进行记账操作（记录到单据表）
     *
     * @param businessKey json 数据，
     * @param transactionId json 数据，
     * @return return msg
     */
    String journalCall(String businessKey,String transactionId);
}
