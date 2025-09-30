package fun.swinner.constant;

/**
 * 项目类型枚举
 * 数据库字段：item_type VARCHAR(20)
 * 含义：product 商品 / service 服务 / fee 费用 / other 其它
 */
public enum ItemTypeEnum {
    PRODUCT("product", "商品"),
    SERVICE("service", "服务"),
    FEE("fee", "费用"),
    INNER_IN("inner-in", "内部转入"),
    INNER_OUT("inner-out", "内部转出"),
    OTHER("other", "其它");

    private final String code;
    private final String description;

    ItemTypeEnum(String code, String description) {
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