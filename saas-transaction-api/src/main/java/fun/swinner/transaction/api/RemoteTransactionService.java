package fun.swinner.transaction.api;

import fun.swinner.transaction.api.domain.RemoteTransaction;

/**
 * 通用最终一致性服务框架dubbo接口
 * zhangtai
 *
 * @date 2025年9月23日
 */

public interface RemoteTransactionService {

    /**
     * 创建新事务
     *
     * @param businessType 业务类型
     * @param businessKey 业务标识
     * @return
     */
    Boolean createTransaction(String businessType, String businessKey);
}
