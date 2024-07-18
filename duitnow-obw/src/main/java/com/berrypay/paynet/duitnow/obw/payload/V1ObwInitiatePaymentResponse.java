/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1ObwInitiatePaymentResponse.java
 * Created Date: Wednesday July 17th 2024 18:35:36 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:56:47 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import com.berrypay.paynet.duitnow.payload.V1DuitNowResponseBody;
import lombok.Getter;
import lombok.Setter;

public class V1ObwInitiatePaymentResponse extends V1DuitNowResponseBody {
    @Getter
    @Setter
    private String endToEndId;

    @Getter
    @Setter
    private String endToEndIdSignature;
}
