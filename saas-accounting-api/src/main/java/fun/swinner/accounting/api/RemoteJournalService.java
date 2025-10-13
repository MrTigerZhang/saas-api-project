package fun.swinner.accounting.api;

import fun.swinner.accounting.api.domain.RemoteDocument;

import java.util.List;
import java.util.Map;

/**
 * 手动记账单据查询接口。
 * 用于凭证抓取和回调
 * 约定，每个业务模块的都必须有getData 和completeData
 */
public interface RemoteJournalService {

    /**
     * 拉取  手动记账 生成的通用单据数据
     *
     * @return  单据数据。
     */
    List<RemoteDocument> getData(String business, String documentType, String tenantId);

    /**
     * 生成完凭证后，回调，用于标记数据已经创建
     *
     * @param datas key:Vouncher_no,vouncher_date,id,
     */
    void completeData(List<Map<String, Object>> datas, String tenantId);
}
