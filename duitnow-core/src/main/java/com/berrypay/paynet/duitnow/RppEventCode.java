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

public class RppEventCode {
    private RppEventCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#event-code
    public static final String BANK_AVAILABILITY_STATUS = "2001";
    public static final String LIQUIDITY_POSITION_LIMIT_BREACHED = "2003";
    public static final String SETTLEMENT_NOTIFICATION = "2004";
    public static final String CONSENT_UPDATE = "CMN001";
    public static final String CONSENT_TERMINATION = "CMN002";
    public static final String PAYMENT_STATUS = "PMT001";
    public static final String CONSENT_UPDATE_STATUS = "CRN001";
    public static final String RTP_REDIRECT = "RED001";
    public static final String CONSENT_REGISTRATION_REDIRECT = "RED002";
}
