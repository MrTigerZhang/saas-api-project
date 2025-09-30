package fun.swinner.accounting.api.domain;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 内部转账数据
 */
@Data
public class RemoteAccTransfer implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 转账单号
     */
    private String transferNo;

    /**
     * 转账日期
     */
    private Date transferDate;

    /**
     * 转出账户ID
     */
    private Long fromAccountId;

    /**
     * 转出账户名字
     */
    private String fromAccountName;

    /**
     * 转入账户ID
     */
    private Long toAccountId;

    /**
     * 转入账户名字
     */
    private String toAccountName;

    /**
     * 转账金额
     */
    private BigDecimal amount;

    /**
     * 交易方式
     */
    private String paymentMethod;

    /**
     * 交易流水号
     */
    private String paymentNo;

    /**
     * 状态
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 附件
     */
    private String attachment;

}
