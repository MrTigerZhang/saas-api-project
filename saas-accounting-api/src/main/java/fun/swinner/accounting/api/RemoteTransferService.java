package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteDocument;

import java.util.List;

/**
 * 内部转账 查询数据
 * 约定，每个业务模块的都必须有getData 和completeData
 */
public interface RemoteTransferService {

    /**
     * 拉取 内部转账的单据数据
     *
     * @return 内部转账类型的单据数据。
     */
    List<RemoteDocument> getData();

    /**
     * 生成完凭证后，回调，用于标记数据已经创建
     *
     * @param documents
     */
    void completeData(List<RemoteDocument> documents);
}
