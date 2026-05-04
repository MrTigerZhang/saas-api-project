
package fun.swinner.accounting.api;

/**
 * 远程凭证日记账服务接口
 */
public interface RemoteAccountingJournalService {

    void recall(String businessKey, String transactionId);
}
