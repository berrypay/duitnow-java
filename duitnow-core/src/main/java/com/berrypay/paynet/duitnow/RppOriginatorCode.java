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

public class RppOriginatorCode {
    private RppOriginatorCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#originator-code
    public static final String ORIGINATING_FINANCIAL_INSTITUTION = "O";
    public static final String RETAIL_PAYMENT_PLATFORM = "H";
    public static final String RECEIVING_FINANCIAL_INSTITUTION = "R";
}
