package fun.swinner.constant;

/**
 * 交易方向枚举
 */
public enum TransactionDirectionEnum {
    IN("in", "流入"),
    OUT("out", "流出");

    private final String code;
    private final String description;

    TransactionDirectionEnum(String code, String description) {
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