package fun.swinner.accounting.api;

/**
 * 抓取凭证
 *
 * @author zhangtai
 * @date 2025年10月13日
 */
public interface RemoteFetchVouchersTransCallbackService {

    /**
     * 触发凭证抓取任务。 通过transsctionId获取事务记录，businessKey为TenantId:
     *
     * @param businessKey   tenantId
     * @param transactionId json 数据，
     * @return return msg
     */
    String call(String businessKey, String transactionId);
}
