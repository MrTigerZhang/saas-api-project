package fun.swinner.accounting.api.domain;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 通用单据主表
 *
 * @author zhangtai
 * @date 2025年9月26日
 */
@Data
public class RemoteDocument implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 单据编号
     */
    private String documentNo;

    /**
     * 单据日期
     */
    private Date documentDate;

    /**
     * 单据类型（1应收2实收3应付4实付5预收6预付7冲销8退款）
     */
    private String documentType;

    /**
     * 资金账户ID
     */
    private Long accountId;

    /**
     * 资金账户名称
     */
    private String accountName;

    /**
     * 往来单位ID（客户或供应商）
     */
    private Long partnerId;

    /**
     * 单位类型 customer/supplier
     */
    private String partnerType;

    /**
     * 往来单位名称
     */
    private String partnerName;

    /**
     * 关联业务单据ID
     */
    private Long businessId;

    /**
     * 关联业务单据编号
     */
    private String businessNo;

    /**
     * 关联业务单据类型（销售单/客户订单/客户充值/供应商存款/采购单/手账/其它 等）
     */
    private String businessType;

    /**
     * 原始金额（业务单据金额）
     */
    private BigDecimal originalAmount;

    /**
     * 实收/实付金额
     */
    private BigDecimal actualAmount;

    /**
     * 优惠金额（含折扣、积分折算）
     */
    private BigDecimal discountAmount;

    /**
     * 冲销金额
     */
    private BigDecimal adjustmentAmount;

    /**
     * 未收/未付余额
     */
    private BigDecimal balanceAmount;

    /**
     * 赠送金额（预存时使用）
     */
    private BigDecimal giftAmount;

    /**
     * 本单使用积分数量
     */
    private Long pointsUsed;

    /**
     * 积分折算金额
     */
    private BigDecimal pointsAmount;

    /**
     * 收付款方式（银行转账/现金/微信/支付宝/其他）
     */
    private String paymentMethod;

    /**
     * 交易流水号
     */
    private String transactionNo;

    /**
     * 币种
     */
    private String currency;

    /**
     * 汇率
     */
    private BigDecimal exchangeRate;

    /**
     * 状态（草稿/已提交/已审核/已完成/作废）
     */
    private String status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否有子表（0存在 2不存在）
     */
    private String hasChild;

    /**
     * 凭证id（生成凭证后填写）
     */
    private Long voucherId;

    /**
     * 凭证编号（生成凭证后填写）
     */
    private String voucherNo;

    /**
     * 凭证状态（0未生成/1已生成/2已作废）
     */
    private String voucherStatus;

    /**
     * 凭证日期（生成凭证时记录）
     */
    private Date voucherDate;

    /**
     * 附件
     */
    private String attachment;

    private List<RemoteDocumentDetail> details;

    //因为是job回调，所以要手动从业务表获取这些字段传过来。
    private String tenantId;
    private Long updateBy;
    private Date updateTime;
    private Date createTime;
    private Long createBy;
    private Long createDept;
}
