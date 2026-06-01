
package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.VoucherReceipt;
import fun.swinner.accounting.api.domain.VoucherReceiptQueryVo;

import java.util.List;

/**
 * 远程凭证日记账服务接口
 */
public interface RemoteAccountingJournalService {

    void recall(String businessKey, String transactionId);


}
