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

public class RppFunctionCode {
    private RppFunctionCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#event-code
    public static final String SIGN_ON_REQUEST = "1001";
    public static final String SIGN_OFF_REQUEST = "1002";
    public static final String ECHO = "1003";
}
