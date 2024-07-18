/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/DuitNowObwV1Connector.java
 * Created Date: Wednesday July 17th 2024 14:17:32 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:55:58 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw;

public class DuitNowObwV1Connector implements DuitNowObwConnector {

    @Override
    public String getVersion() {
        return "1";
    }

    @Override
    public String getRetrieveBankListUri() {
        return DuitNowObwV1Constant.MERCHANT_RETRIEVE_BANK_LIST_URI;
    }

    @Override
    public String getInitiatePaymentUri() {
        return DuitNowObwV1Constant.MERCHANT_INITIATE_PAYMENT_URI;
    }

    @Override
    public String getCancelPaymentStatusUri() {
        return DuitNowObwV1Constant.MERCHANT_CANCEL_PAYMENT_URI;
    }

    @Override
    public String getStatusInquiryUri() {
        return DuitNowObwV1Constant.MERCHANT_STATUS_INQUIRY;
    }

    @Override
    public String getWebhookUri() {
        return DuitNowObwV1Constant.WEBHOOK_URI;
    }

}
