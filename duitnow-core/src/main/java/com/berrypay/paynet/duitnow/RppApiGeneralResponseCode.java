/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:36
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppApiGeneralResponseCode {
    private RppApiGeneralResponseCode() {
    }

    // Source: https://docs.developer.paynet.my/docs/dobw/response-codes#api-gateway-general-response-code
    public static final String INVALID_URL = "API.001";
    public static final String INVALID_FORMAT = "API.002";
    public static final String INVALID_LENGTH = "API.003";
    public static final String INVALID_VALUE = "API.004";
    public static final String MISSING_MANDATORY_FIELD = "API.005";
    // Note: There's no API.006 defined based on PayNet Online Documentation as at 24/7/2024
    public static final String UNAUTHORIZED_REQUEST = "API.007";
    public static final String REQUEST_TIMEOUT = "API.008";
}
