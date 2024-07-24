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

public class RppProxyRegistrationStatusCode {
    private RppProxyRegistrationStatusCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#proxy-type
    public static final String ACTIVE = "ACTV";
    public static final String SUSPENDED = "SUSP";
    public static final String INACTIVE = "ICTV";
    public static final String SUSPENDED_BY_BANK = "SUSB";
}
