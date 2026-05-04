package fun.swinner.transaction.api;

import fun.swinner.transaction.api.domain.RemoteTransaction;
import lombok.extern.slf4j.Slf4j;


/**
 * 通用最终一致性服务框架dubbo接口
 * zhangtai
 *
 * @date 2025年9月23日
 */
@Slf4j
public class RemoteTransactionServiceMock implements RemoteTransactionService {



    /**
     * 创建新事务
     *
     * @param businessType 业务类型
     * @param businessKey  业务标识
     * @return
     */
    @Override
    public Boolean createTransaction(String businessType, String businessKey) {
        log.info("createTransaction mock, businessType: {}, businessKey: {}", businessType, businessKey);
        return null;
    }
}
