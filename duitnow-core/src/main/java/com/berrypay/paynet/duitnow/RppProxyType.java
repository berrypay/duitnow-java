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

public class RppProxyType {
    private RppProxyType() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#proxy-type
    public static final String NRIC_NUMBER = "NRIC";
    public static final String PASSPORT_NUMBER = "PSPT";
    public static final String BUSINESS_REGISTRATION_NUMBER = "BREG";
    public static final String MOBILE_NUMBER = "MBNO";
    public static final String ARMY_NUMBER = "ARMN";
}
