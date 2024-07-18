/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/DuitNowObwV1Constant.java
 * Created Date: Thursday July 18th 2024 13:43:40 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 14:57:24 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.obw;

public final class DuitNowObwV1Constant {
    // Endpoints definition
    public static final String OBW_MERCHANT_BASE = "/merchants/v1";
    public static final String MERCHANT_RETRIEVE_BANK_LIST_URI = OBW_MERCHANT_BASE + "/payments/lists/bank";
    public static final String MERCHANT_INITIATE_PAYMENT_URI = OBW_MERCHANT_BASE + "/payments/redirect";
    public static final String MERCHANT_CANCEL_PAYMENT_URI = OBW_MERCHANT_BASE + "/payments/payment/cancel";
    public static final String MERCHANT_STATUS_INQUIRY = OBW_MERCHANT_BASE + "/payments/payment/status";

    // Webhook
    public static final String WEBHOOK_URI = "/RPP/MY/Notification/PaymentStatus";

    private DuitNowObwV1Constant() {}
}
