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

public class RppSubstateCode {
    private RppSubstateCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#substate-code
    public static final String CLEARED = "CLEARED";
    public static final String RECEIVED = "RETRIEVED";
    public static final String PENDING_AUTHORISATION = "PENDING AUTHORISATION";
    public static final String CANCELLED = "CANCELLED";
    public static final String REJECTED = "REJECT";

}
