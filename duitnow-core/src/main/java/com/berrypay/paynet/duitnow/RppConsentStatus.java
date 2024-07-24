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

public class RppConsentStatus {
    private RppConsentStatus() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#consent-status
    public static final String CONSENT_ACTIVE = "ACTV";
    public static final String CONSENT_INACTIVE = "ICTV";
    public static final String SUSPENDED_BY_CUSTOMER = "SUSP";
    public static final String SUSPENDED_BY_BANK = "SUSB";
    public static final String ACTIVATED_BY_BANK = "ACTB";
    public static final String PENDING = "PNDG";
    public static final String PENDING_AUTHORISATION = "PDAU";
    public static final String CANCELLED = "CANC";

}
