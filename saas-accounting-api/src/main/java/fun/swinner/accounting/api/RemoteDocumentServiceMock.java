package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteDocument;
import lombok.extern.slf4j.Slf4j;

/**
 * 通用单据接口
 */
@Slf4j
public class RemoteDocumentServiceMock implements RemoteDocumentService {


    /**
     * 创建单据
     *
     * @param document
     * @return
     */
    @Override
    public String addDocument(RemoteDocument document) {
        log.warn("dubbo服务不可用--->服务降级");
        return "";
    }
}
