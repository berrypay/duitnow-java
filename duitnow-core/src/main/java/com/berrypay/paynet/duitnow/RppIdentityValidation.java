/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 13:14
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppIdentityValidation {

    private RppIdentityValidation() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/mapping-tables#identity-validation

    public static final String NO_VALIDATION = "00";
    public static final String DEBTOR_NAME_CHECK = "01";
    public static final String DEBTOR_IDENTIFICATION_CHECK = "02";
    public static final String DEBTOR_NAME_AND_IDENTIFICATION_CHECK = "03";
}
