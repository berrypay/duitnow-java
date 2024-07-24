/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/main/java/com/berrypay/paynet/duitnow/autodebit/DuitNowAutoDebitV1Connector.java
 * Created Date: Wednesday July 17th 2024 14:17:32 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:00:26 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */



package com.berrypay.paynet.duitnow.autodebit;

public class DuitNowAutoDebitV1Connector implements DuitNowAutoDebitConnector {

    @Override
    public String getVersion() {
        return "1";
    }

    @Override
    public String getInitiateConsentUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_INITIATE_CONSENT_URI;
    }
    
    @Override
    public String getConsentEnquiryUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_CONSENT_ENQUIRY_URI;
    }

    @Override
    public String getCancelConsentUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_CANCEL_CONSENT_URI;
    }

    @Override
    public String getStatusInquiryUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_STATUS_INQUIRY_URI;
    }

    @Override
    public String getTerminateConsentUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_TERMINATE_CONSENT_URI;
    }

    @Override
    public String getRealTimeDebitUri() {
        return DuitNowAutoDebitV1Constant.MERCHANT_REALTIME_DEBIT_URI;
    }

    @Override
    public String getConsentRegistrationStatusWebhookUri() {
        return DuitNowAutoDebitV1Constant.CONSENT_REGISTRATION_STATUS_WEBHOOK_URI;
    }

    @Override
    public String getConsentModificationStatusWebhookUri() {
        return DuitNowAutoDebitV1Constant.CONSENT_MODIFICATION_STATUS_WEBHOOK_URI;
    }

}
