


package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.VoucherReceipt;
import fun.swinner.accounting.api.domain.VoucherReceiptQueryVo;

import java.util.List;

/**
 * 远程凭证服务接口
 */
public interface RemoteVoucherService {


    /**
     * 通过业务id和业务编号 查询生成的凭证
     * @return
     */
    List<VoucherReceipt> queryVoucher(List<VoucherReceiptQueryVo> params);
}
