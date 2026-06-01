/*
 * Copyright (c) 2026. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package fun.swinner.accounting.api.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 业务模块获取凭证的回执
 */
@Data
public class VoucherReceipt implements Serializable {
    private Long voucherId;
    private String voucherNo;
}
