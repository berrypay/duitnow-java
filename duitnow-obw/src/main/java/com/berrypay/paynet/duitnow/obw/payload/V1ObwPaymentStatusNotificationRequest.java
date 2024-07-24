/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:27
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.obw.payload;

public class V1ObwPaymentStatusNotificationRequest {
    enum PaymentStatusCode {
        ACSP, // Accepted
        ACTC, // Accepted with Completion of Technical Validation
        RJCT // Rejected
    }
}
