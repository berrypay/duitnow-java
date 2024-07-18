/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-core/src/main/java/com/berrypay/paynet/duitnow/exception/DuitNowMessageSigningException.java
 * Created Date: Tuesday July 16th 2024 15:20:04 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:57:00 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.exception;

public class DuitNowMessageSigningException extends Exception {
    private static final long serialVersionUID = 1L;

    public DuitNowMessageSigningException(String message) {
        super(message);
    }
}
