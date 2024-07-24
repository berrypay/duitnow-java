/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1MerchantDetail.java
 * Created Date: Wednesday July 17th 2024 18:46:24 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:16:36 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class V1MerchantDetail {
    private String name;

    private String accountType;

    private String identificationType;

    private String identification;
}
