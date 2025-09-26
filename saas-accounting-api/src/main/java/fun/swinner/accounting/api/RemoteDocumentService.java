package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteDocument;

/**
 * 通用单据接口
 */
public interface RemoteDocumentService {

    /**
     * 创建单据
     *
     * @param document
     * @return
     */
    String addDocument(RemoteDocument document);
}
