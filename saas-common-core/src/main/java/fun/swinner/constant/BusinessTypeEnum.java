package fun.swinner.constant;

/**
 * 业务类型枚举
 */
public enum BusinessTypeEnum {
    MANUAL_ENTRY("0", "手工录入"),
    SALES_ORDER("1", "销售订单"),
    CUSTOMER_ORDER("2", "客户订单"),
    CUSTOMER_RECHARGE("3", "客户充值"),
    INTERNAL_TRANSFER("4", "内部转账"),
    PURCHASE_ORDER("5", "采购订单"),
    SUPPLIER_DEPOSIT("6", "供应商存款"),
    MANUAL_ACCOUNTING("7", "手动记账"),
    SALES_COMMISSION("8", "销售提成"),
    OTHER("20", "其它");

    private final String code;
    private final String description;

    BusinessTypeEnum(String code, String description) {
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