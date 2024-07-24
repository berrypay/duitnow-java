/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 13:00
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppPaymentTransactionStatusCode {
    private RppPaymentTransactionStatusCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#payment-transaction-status-code
    public static final String ACCEPTED_CUSTOMER_PROFILE = "ACCP";
    public static final String ACCEPTED_SETTLEMENT_COMPLETED = "ACSC";
    public static final String ACCEPTED_SETTLEMENT_IN_PROCESS = "ACSP";
    public static final String ACCEPTED_TECHNICAL_VALIDATION = "ACTC";
    public static final String ACCEPTED_WITH_CHANGE = "ACWC";
    public static final String PENDING = "PNDG";
    public static final String REJECTED = "RJCT";
}
