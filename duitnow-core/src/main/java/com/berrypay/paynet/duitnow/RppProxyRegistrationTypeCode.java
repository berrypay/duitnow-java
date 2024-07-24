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

public class RppProxyRegistrationTypeCode {
    private RppProxyRegistrationTypeCode() {
    }

    // https://docs.developer.paynet.my/docs/dobw/mapping-tables#proxy-registration-type-code
    public static final String ACTIVATE = "ACTV";
    public static final String AMEND = "AMND";
    public static final String DEREGISTER = "DEAC";
    public static final String NEW_REGISTRATION = "NEWR";
    public static final String PORT = "PORT";
    public static final String SUSPEND = "SUSP";
}
