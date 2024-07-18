/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/test/java/com/berrypay/paynet/duitnow/autodebit/DuitNowAutoDebitV1ConnectorTest.java
 * Created Date: Wednesday July 17th 2024 15:03:10 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:03:31 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.autodebit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DuitNowAutoDebitV1ConnectorTest {
    @Test
    void testConnectorVersionIsV1() {
        assertEquals("1", new DuitNowAutoDebitV1Connector().getVersion());
    }

    @Test
    void testEndPointIsV1() {
        DuitNowAutoDebitConnector testConnector = new DuitNowAutoDebitV1Connector();
        assertEquals("/merchants/v1/consents/redirect", testConnector.getInitiateConsentUri());
        assertEquals("/merchants/v1/consents/consent", testConnector.getConsentEnquiryUri());
        assertEquals("/merchants/v1/consents/consent/cancel", testConnector.getCancelConsentUri());
        assertEquals("/merchants/v1/consents/consent/status", testConnector.getStatusInquiryUri());
        assertEquals("/merchants/v1/consents/consent/terminate", testConnector.getTerminateConsentUri());
        assertEquals("/merchants/v1/consents/consent/directdebit", testConnector.getRealTimeDebitUri());
        assertEquals("/RPP/MY/Notification/Consent/Status", testConnector.getConsentRegistrationStatusWebhookUri());
        assertEquals("/RPP/MY/Notification/Consent/Update", testConnector.getConsentModificationStatusWebhookUri());
    }
}
