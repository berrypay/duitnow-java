/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-core/src/main/java/com/berrypay/paynet/duitnow/payload/V1ResponseBodyHeaderStatus.java
 * Created Date: Wednesday July 17th 2024 18:08:50 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:08:42 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.payload;

import lombok.Getter;
import lombok.Setter;

public class V1ResponseBodyHeaderStatus {
    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String reason;

    @Getter
    @Setter
    private String description;
}
