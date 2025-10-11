package fun.swinner.constant;

/**
 * 事务状态枚举
 * 0-待处理,1-处理中,2-成功,3-失败
 */
public enum TransactionStatus {
    PENDING(0L, "待处理"),
    PROCESSING(1L, "处理中"),
    SUCCESS(2L, "成功"),
    FAILED(3L, "失败");

    private final long code;
    private final String desc;

    TransactionStatus(long code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public long getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}