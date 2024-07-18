/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/main/java/com/berrypay/paynet/duitnow/autodebit/payload/V1AutoDebitConsentEnquiryRequest.java
 * Created Date: Thursday July 18th 2024 15:17:08 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:51:37 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.autodebit.payload;

import com.berrypay.paynet.duitnow.payload.V1DuitNowRequestQueryParam;
import lombok.Getter;
import lombok.Setter;

public class V1AutoDebitConsentEnquiryRequest extends V1DuitNowRequestQueryParam {
    @Getter
    @Setter
    private String consentId;

    @Getter
    @Setter
    private String productId;
}
