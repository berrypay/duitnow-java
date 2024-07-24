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

public class RppSourceOfFunds {
    private RppSourceOfFunds() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#source-of-funds
    public static final String CASA = "01";
    public static final String CREDIT_CARD = "02";
    public static final String WALLET = "03";
}
