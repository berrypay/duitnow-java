/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-core/src/main/java/com/berrypay/paynet/duitnow/exception/DuitNowConfigException.java
 * Created Date: Monday July 15th 2024 14:44:34 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:15:29 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.exception;

public class DuitNowConfigException extends Exception {
    private static final long serialVersionUID = 1L;
    
    public DuitNowConfigException(String message) {
        super(message);
    }
}
