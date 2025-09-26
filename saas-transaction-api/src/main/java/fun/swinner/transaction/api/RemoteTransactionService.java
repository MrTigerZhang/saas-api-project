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
     * @param transaction
     * @return
     */
    Boolean createTransaction(RemoteTransaction transaction);

}
