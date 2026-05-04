/*
 * Copyright (c) 2026. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package fun.swinner.accounting.api;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemoteAccountingJournalServiceImpl implements RemoteAccountingJournalService {
    /**
     * @param businessKey
     */
    @Override
    public void recall(String businessKey,String transactionId) {
        log.info("recall, businessKey: {}", businessKey);
    }
}
