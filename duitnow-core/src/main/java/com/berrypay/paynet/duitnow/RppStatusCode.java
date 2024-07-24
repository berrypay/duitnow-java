/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:40
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppStatusCode {
    private RppStatusCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/response-codes#status-codes
    public static final String ACCEPTED_SETTLEMENT_IN_PROCESS = "ACSP";
    public static final String ACCEPTED_TECHNICAL_VALIDATION = "ACTC";
    public static final String REJECTED = "RJCT";
}
