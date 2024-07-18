/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/DuitNowObwConnector.java
 * Created Date: Wednesday July 17th 2024 14:16:29 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:55:48 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw;

public interface DuitNowObwConnector {
    public String getVersion();
    public String getRetrieveBankListUri();
    public String getInitiatePaymentUri();
    public String getCancelPaymentStatusUri();
    public String getStatusInquiryUri();
    public String getWebhookUri();
}
