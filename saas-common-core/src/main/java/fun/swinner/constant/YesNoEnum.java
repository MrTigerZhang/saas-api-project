package fun.swinner.constant;

/**
 * 是否枚举
 * 含义：0 否 / 1 是
 */
public enum YesNoEnum {
    NO("0", "否"),
    YES("1", "是");

    private final String code;
    private final String description;

    YesNoEnum(String code, String description) {
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