/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/main/java/com/berrypay/paynet/duitnow/autodebit/DuitNowAutoDebitConnector.java
 * Created Date: Wednesday July 17th 2024 14:16:29 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 14:03:24 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.autodebit;

public interface DuitNowAutoDebitConnector {
    public String getVersion();
    public String getInitiateConsentUri();
    public String getConsentEnquiryUri();
    public String getCancelConsentUri();
    public String getStatusInquiryUri();
    public String getTerminateConsentUri();
    public String getRealTimeDebitUri();
    public String getConsentRegistrationStatusWebhookUri();
    public String getConsentModificationStatusWebhookUri();
}
