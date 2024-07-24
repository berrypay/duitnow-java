/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:56
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppIdentificationType {
    private RppIdentificationType() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#identification-type
    public static final String NEW_IC_NUMBER = "01";
    public static final String ARMY_NUMBER = "02";
    public static final String PASSPORT_NUMBER = "03";
    public static final String REGISTRATION_NUMBER = "04";
    public static final String MOBILE_NUMBER = "05";
}
