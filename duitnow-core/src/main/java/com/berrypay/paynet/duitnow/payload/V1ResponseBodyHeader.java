/*
 * Project: PayNet DuitNow SDK
 * Filename: /duitnow-core/src/main/java/com/berrypay/paynet/duitnow/payload/V1ResponseBodyHeader.java
 * Created Date: Wednesday July 17th 2024 18:03:22 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Last Modified: Thursday July 18th 2024 15:14:49 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.payload;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

public class V1ResponseBodyHeader {
    @Getter
    @Setter
    private String messageId;

    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    private LocalDateTime date;

    @Getter
    @Setter
    private V1ResponseBodyHeaderStatus status;

}
