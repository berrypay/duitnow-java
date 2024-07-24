/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-obw/src/main/java/com/berrypay/paynet/duitnow/obw/payload/V1ObwInitiatePaymentRequest.java
 * Created Date: Wednesday July 17th 2024 18:39:49 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:55:33 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.obw.payload;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class V1ObwInitiatePaymentRequest {
    private String clientId;

    private String messageId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime date;

    private String transactionId;

    private String endToEndId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime expiryDate;

    private String currency;

    private BigDecimal amount;

    private String productId;

    private V1CustomerDetail customer;

    private V1MerchantDetail merchant;

    private String[] sourceOfFunds;

    private String recipientReference;

    private String paymentDescription;

    private V1ConsentDetail consent;
}
