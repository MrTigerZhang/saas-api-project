package fun.swinner.constant;

/**
 * 凭证状态枚举
 * 数据库字段：voucher_status tinyint(1)
 * 含义：0 未生成 / 1 已生成 / 2 已作废
 */
public enum VoucherStatusEnum {
    NOT_GENERATED("0", "未生成"),
    GENERATED("1", "已生成"),
    VOIDED("2", "已作废");

    private final String code;
    private final String description;

    VoucherStatusEnum(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}