package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteAccTransfer;
import fun.swinner.accounting.api.domain.RemoteDocument;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * 内部转账 查询数据
 * 实现类要添加group 和version group DUBBO_GROUP v1.0.0
 */
@Slf4j
public class RemoteTransferServiceMock implements RemoteTransferService {


    /**
     * 拉取 内部转账的单据数据
     *
     * @return 内部转账类型的单据数据。
     */
    @Override
    public List<RemoteDocument> getData(String business, String documentType, String tenantId) {
        log.warn("拉取 内部转账的单据数据 服务降级");
        return null;
    }

    /**
     * 生成完凭证后，回调，用于标记数据已经创建
     *
     * @param documents
     */
    @Override
    public void completeData(List<Map<String,Object>> documents, String tenantId) {
        log.warn("回调接口服务降级");
    }
}
