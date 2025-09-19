package fun.swinner.constant;

/**
 * 单据类型枚举
 *
 */
public enum DocumentTypeEnum {
    RECEIVABLE("1", "应收"),
    ACTUAL_RECEIVED("2", "实收"),
    PAYABLE("3", "应付"),
    ACTUAL_PAID("4", "实付"),
    ADVANCE_RECEIVED("5", "预收"),
    ADVANCE_PAID("6", "预付"),
    WRITE_OFF("7", "冲销"),
    REFUND("8", "退款");

    private final String code;
    private final String description;

    DocumentTypeEnum(String code, String description) {
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
