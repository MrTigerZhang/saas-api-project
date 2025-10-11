package fun.swinner.constant;

/**
 * 项目类型枚举
 * 数据库字段：item_type VARCHAR(20)
 * 含义：product 商品 / service 服务 / fee 费用 / other 其它
 */
public enum ItemTypeEnum {
    PRODUCT_IN("product_in", "商品_借"),
    PRODUCT_OUT("product_out", "商品_贷"),
    SERVICE_IN("service_in", "服务_借"),
    SERVICE_OUT("service_out", "服务_贷"),
    FEE_IN("fee_in", "费用_借"),
    FEE_OUT("fee_out", "费用_贷"),
    INNER_IN("inner-in", "内部转入"),
    INNER_OUT("inner-out", "内部转出"),

    MANUAL_IN("manual-in", "手工记账_借"),
    MANUAL_OUT("manual-out", "手工记账_贷"),
    OTHER_IN("other_in", "其它_借"),
    OTHER_OUT("other_out", "其它_贷");

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