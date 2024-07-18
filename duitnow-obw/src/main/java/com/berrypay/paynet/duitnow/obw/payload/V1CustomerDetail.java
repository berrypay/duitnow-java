/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1CustomerDetail.java
 * Created Date: Wednesday July 17th 2024 18:43:49 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:16:25 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import lombok.Getter;
import lombok.Setter;

public class V1CustomerDetail {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String bankType;

    @Getter
    @Setter
    private String identificationType;

    @Getter
    @Setter
    private String identification;

    @Getter
    @Setter
    private String identityValidation;
}
