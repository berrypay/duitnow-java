/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-core/src/main/java/com/berrypay/paynet/duitnow/payload/V1DuitNowRequestBody.java
 * Created Date: Thursday July 18th 2024 15:33:37 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:35:56 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class V1DuitNowRequestBody {
    private String clientId;

    private String messageId;

    private String transactionId;

    private String productId;
}
