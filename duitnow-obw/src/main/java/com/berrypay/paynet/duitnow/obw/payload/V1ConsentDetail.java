/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1ConsentDetail.java
 * Created Date: Wednesday July 17th 2024 18:48:14 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 13:16:20 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class V1ConsentDetail {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate effectiveDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate expiryDate;

    private String frequency;

    private String maximumPaymentCurrency;

    private BigDecimal maximumPaymentAmount;
}
