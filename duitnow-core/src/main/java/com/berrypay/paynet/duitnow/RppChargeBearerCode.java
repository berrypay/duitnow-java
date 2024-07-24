/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:51
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppChargeBearerCode {
    private RppChargeBearerCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#charge-bearer-code
    public static final String DEBTOR = "DEBT";
    public static final String CREDITOR = "CRED";
    public static final String SHARED = "SHAR";
    public static final String SERVICE_LEVEL = "SLEV";
}
