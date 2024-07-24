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

public class RppChannelCode {
    private RppChannelCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#channel-code
    public static final String RETAIL_INTERNET_BANKING = "RB";
    public static final String CORPORATE_BANKING = "CB";
    public static final String RETAIL_MOBILE_BANKING = "RM";
    public static final String CORPORATE_MOBILE_BANKING = "CM";
    public static final String OTHER = "OT";
    public static final String BUSINESS_WEB = "BW";
    public static final String BUSINESS_APP = "BA";
}
