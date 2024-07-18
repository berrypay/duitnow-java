/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/test/java/com/berrypay/paynet/duitnow/obw/DuitNowObwV1ConnectorTest.java
 * Created Date: Wednesday July 17th 2024 15:03:10 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 14:57:32 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DuitNowObwV1ConnectorTest {
    @Test
    void testConnectorVersionIsV1() {
        assertEquals("1", new DuitNowObwV1Connector().getVersion());
    }

    @Test
    void testEndPointIsV1() {
        DuitNowObwConnector testConnector = new DuitNowObwV1Connector();
        assertEquals("/merchants/v1/payments/lists/bank", testConnector.getRetrieveBankListUri());
        assertEquals("/merchants/v1/payments/redirect", testConnector.getInitiatePaymentUri());
        assertEquals("/merchants/v1/payments/payment/cancel", testConnector.getCancelPaymentStatusUri());
        assertEquals("/merchants/v1/payments/payment/status", testConnector.getStatusInquiryUri());
    }
}
