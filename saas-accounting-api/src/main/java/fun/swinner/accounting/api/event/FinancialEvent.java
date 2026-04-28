package fun.swinner.accounting.api.event;

import lombok.Data;
import org.dromara.common.satoken.utils.LoginHelper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 财务统一业务事件驱动快照
 * 用于向凭证引擎抛出标准化业务事件，进行路由、翻译和记账。
 */
@Data
public class FinancialEvent {

    public FinancialEvent() {
        tenantId = LoginHelper.getTenantId();
        createBy = LoginHelper.getUserId();
        updateBy = LoginHelper.getUserId();
        createDept = LoginHelper.getDeptId();

    }


    /**
     * 业务场景/特征码（如 SALES_CONFIRM, PAYMENT_RECEIVE），用于精准路由到凭证模板
     */
    private String businessCode;

    /**
     * 业务单号（来源防重用）
     */
    private String sourceNo;

    /**
     * 业务主键ID（来源防重用）
     */
    private Long sourceId;

    /**
     * 业务大类类型（映射 gl_voucher.source_type）
     */
    private Long sourceType;

    /**
     * 业务发生日期，将决定凭证的日期和匹配所在的会计期间
     */
    private Date businessDate;

    /**
     * 总金额（含税等），计算公式的默认基数
     */
    private BigDecimal totalAmount;

    /**
     * 税额（用于进项、销项税的计算）
     */
    private BigDecimal taxAmount;

    /**
     * 净额（无税金额）
     */
    private BigDecimal netAmount;
    /**
     * 币种
     */
    private String currency;

    /**
     * 核心多维快照数据：包含客户(actor)、商品(target)、所属部门等，
     * 用于组装并固化为凭证辅助核算的 JSON `aux_data`
     */
    private Map<String, Object> snapshotData;

    /**
     * 自定义扩展参数，提供给规则引擎和 SpEL 公式进行极其复杂的校验或计算使用
     */
    private Map<String, Object> extParams;

    /**
     * 建议凭证摘要（可空，若提供可覆盖默认模板摘要）
     */
    private String summary;

    private String tenantId;

    private Long createDept;

    private Long createBy;

    private Long updateBy;

    public void setAuxData(AuxData data) {
        snapshotData = new HashMap<>();
        snapshotData.put("id", data.getId());
        snapshotData.put("type", data.getType());
        snapshotData.put("name", data.getName());
    }
}
