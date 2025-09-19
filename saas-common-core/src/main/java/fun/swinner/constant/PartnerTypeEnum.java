package fun.swinner.constant;

public enum PartnerTypeEnum {
    CUSTOMER("customer", "客户"),
    SUPPLIER("supplier", "供应商");


    private final String code;
    private final String description;

    PartnerTypeEnum(String code, String description) {
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
