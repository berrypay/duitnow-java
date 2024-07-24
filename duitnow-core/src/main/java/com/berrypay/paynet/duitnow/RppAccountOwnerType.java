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

public class RppAccountOwnerType {
    private RppAccountOwnerType() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#account-owner-type
    public static final String SINGLE = "1";
    public static final String JOINT = "2";
    public static final String GOVERNMENT = "3";
    public static final String CORPORATE = "4";
    public static final String NGO = "5";
}
