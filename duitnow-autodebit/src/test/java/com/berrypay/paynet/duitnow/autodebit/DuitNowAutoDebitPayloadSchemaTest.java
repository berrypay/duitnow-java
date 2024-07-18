/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/test/java/com/berrypay/paynet/duitnow/autodebit/DuitNowAutoDebitPayloadSchemaTest.java
 * Created Date: Wednesday July 17th 2024 15:03:10 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:57:59 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.autodebit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.berrypay.paynet.duitnow.autodebit.payload.V1AutoDebitInitiateConsentResponse;
import com.berrypay.paynet.duitnow.payload.V1ResponseBodyHeader;

class DuitNowAutoDebitPayloadSchemaTest {
    @Test
    void testSchemaInheritance() {
        V1AutoDebitInitiateConsentResponse response = new V1AutoDebitInitiateConsentResponse();
        response.setHeader(new V1ResponseBodyHeader());
        response.getHeader().setMessageId("message123");
        response.setTransactionId("test123");
        assertEquals("test123", response.getTransactionId());
        assertEquals("message123", response.getHeader().getMessageId());
    }
}
