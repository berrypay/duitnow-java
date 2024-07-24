/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1BankDetail.java
 * Created Date: Wednesday July 17th 2024 18:26:47 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:16:12 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class V1BankDetail {
    private String code;

    private String name;

    private Boolean active;

    private String browser;

    private String androidApplicationId;

    private String iosApplicationId;

    private V1BankRedirectDetail[] redirectUrls;
}
