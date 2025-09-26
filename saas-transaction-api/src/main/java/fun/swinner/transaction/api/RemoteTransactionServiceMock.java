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


    @Override
    public Boolean createTransaction(RemoteTransaction transaction) {
        log.warn("服务降级");
        return null;
    }
}
