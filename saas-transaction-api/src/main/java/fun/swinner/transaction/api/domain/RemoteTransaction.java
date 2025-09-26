package fun.swinner.transaction.api.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * 请求创建事务对象
 *
 * @date 2025年9月23日
 */
@Data
@NoArgsConstructor
public class RemoteTransaction implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    /**
     * 事务唯一标识
     */
    private String transactionId;

    /**
     * 业务类型
     */
    private String businessType;

    /**
     * 业务标识
     */
    private String businessKey;

}
