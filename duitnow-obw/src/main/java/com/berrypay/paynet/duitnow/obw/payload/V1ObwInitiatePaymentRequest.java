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

public class V1ObwInitiatePaymentRequest {
    @Getter
    @Setter
    private String clientId;

    @Getter
    @Setter
    private String messageId;

    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime date;

    @Getter
    @Setter
    private String transactionId;

    @Getter
    @Setter
    private String endToEndId;

    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime expiryDate;

    @Getter
    @Setter
    private String currency;

    @Getter
    @Setter
    private BigDecimal amount;

    @Getter
    @Setter
    private String productId;

    @Getter
    @Setter
    private V1CustomerDetail customer;

    @Getter
    @Setter
    private V1MerchantDetail merchant;

    @Getter
    @Setter
    private String[] sourceOfFunds;

    @Getter
    @Setter
    private String recipientReference;

    @Getter
    @Setter
    private String paymentDescription;

    @Getter
    @Setter
    private V1ConsentDetail consent;
}
