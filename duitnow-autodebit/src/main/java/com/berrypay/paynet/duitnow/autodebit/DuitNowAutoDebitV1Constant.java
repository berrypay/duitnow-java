/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/main/java/com/berrypay/paynet/duitnow/autodebit/DuitNowAutoDebitV1Constant.java
 * Created Date: Thursday July 18th 2024 13:43:40 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 16:35:32 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.autodebit;

public final class DuitNowAutoDebitV1Constant {
    // Endpoints definition
    public static final String OBW_MERCHANT_BASE = "/merchants/v1";
    public static final String MERCHANT_INITIATE_CONSENT_URI = OBW_MERCHANT_BASE + "/consents/redirect";
    public static final String MERCHANT_CONSENT_ENQUIRY_URI = OBW_MERCHANT_BASE + "/consents/consent";
    public static final String MERCHANT_CANCEL_CONSENT_URI = OBW_MERCHANT_BASE + "/consents/consent/cancel";
    public static final String MERCHANT_STATUS_INQUIRY_URI = OBW_MERCHANT_BASE + "/consents/consent/status";
    public static final String MERCHANT_TERMINATE_CONSENT_URI = OBW_MERCHANT_BASE + "/consents/consent/terminate";
    public static final String MERCHANT_REALTIME_DEBIT_URI = OBW_MERCHANT_BASE + "/consents/consent/directdebit";

    // Webhook
    public static final String CONSENT_REGISTRATION_STATUS_WEBHOOK_URI = "/RPP/MY/Notification/Consent/Status";
    public static final String CONSENT_MODIFICATION_STATUS_WEBHOOK_URI = "/RPP/MY/Notification/Consent/Update";
    

    private DuitNowAutoDebitV1Constant() {}
}
