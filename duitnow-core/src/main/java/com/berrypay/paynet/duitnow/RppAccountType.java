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

public class RppAccountType {
    private RppAccountType() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#account-type
    public static final String CURRENT = "CACC";
    public static final String SAVINGS = "SVGS";
    public static final String CREDIT_CARD = "CCRD";
    public static final String EWALLET = "WALL";
}
