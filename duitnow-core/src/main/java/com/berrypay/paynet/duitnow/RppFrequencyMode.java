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

public class RppFrequencyMode {
    private RppFrequencyMode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#frequency-mode
    public static final String UNLIMITED = "01";
    public static final String DAILY = "02";
    public static final String WEEKLY = "03";
    public static final String MONTHLY = "04";
    public static final String QUARTERLY = "05";
    public static final String YEARLY = "06";
}
