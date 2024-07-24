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

public class RppConsentTerminationReasonCode {
    private RppConsentTerminationReasonCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#reason-codes-for-consent-termination
    public static final String NOT_USING_SERVICE_ANYMORE = "01";
    public static final String DISPUTE_ON_PAYMENT_DETAILS = "02";
    public static final String NOT_INTERESTED = "03";
    public static final String FRAUD = "04";
    public static final String EARLY_SETTLEMENT = "05";
    public static final String OTHER = "99";
}
