package fun.swinner.accounting.api.domain;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 通用单据详情表数据
 *
 * @author zhangtai
 * @date 2025年9月26日
 */
@Data
public class RemoteDocumentDetail implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 行号（从1开始顺序编号）
     */
    private Long lineNo;

    /**
     * 项目/商品/服务ID
     */
    private Long itemId;

    /**
     * 项目/商品编码
     */
    private String itemCode;

    /**
     * 项目/商品名称
     */
    private String itemName;

    /**
     * 项目类型（product/service/fee/other）
     */
    private String itemType;

    /**
     * 数量
     */
    private Long quantity;

    /**
     * 单价
     */
    private BigDecimal price;

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


}
