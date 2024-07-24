/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-autodebit/src/main/java/com/berrypay/paynet/duitnow/autodebit/payload/V1AutoDebitInitiateConsentResponse.java
 * Created Date: Thursday July 18th 2024 15:17:08 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:50:50 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.autodebit.payload;

import com.berrypay.paynet.duitnow.payload.V1DuitNowResponseBody;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class V1AutoDebitInitiateConsentResponse extends V1DuitNowResponseBody {

    private String mandateId;

    private String consentId;

    private String endToEndIdSignature;
}
