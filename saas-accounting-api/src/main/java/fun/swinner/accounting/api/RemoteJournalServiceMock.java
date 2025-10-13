package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteDocument;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

/**
 * 手动记账单据查询接口。
 * 用于凭证抓取和回调
 * 约定，每个业务模块的都必须有getData 和completeData
 */
@Slf4j
public class RemoteJournalServiceMock implements RemoteJournalService {


    /**
     * 拉取  手动记账 生成的通用单据数据
     *
     * @param business
     * @param documentType
     * @param tenantId
     * @return 单据数据。
     */
    @Override
    public List<RemoteDocument> getData(String business, String documentType, String tenantId) {
        log.warn("fun.swinner.accounting.api.RemoteJournalServiceMock#getData -->服务降级");
        return null;
    }

    /**
     * 生成完凭证后，回调，用于标记数据已经创建
     *
     * @param datas    key:Vouncher_no,vouncher_date,id,
     * @param tenantId
     */
    @Override
    public void completeData(List<Map<String, Object>> datas, String tenantId) {
        log.info("fun.swinner.accounting.api.RemoteJournalServiceMock#completeData————>服务降级");

    }
}
