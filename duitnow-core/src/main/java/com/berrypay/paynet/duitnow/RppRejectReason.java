/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:45
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppRejectReason {
    private RppRejectReason() {
    }
    
    // Source:https://docs.developer.paynet.my/docs/dobw/response-codes#reject-reasons
    public static final String MISSING_MANDATORY_FIELD = "0001";
    public static final String INVALID_ATTRIBUTE_TYPE = "0002";
    public static final String ENDPOINT_HAS_NO_DEFINITION = "0003";
    public static final String INVALID_CHAR_DURING_BCD_DECODING = "0004";
    public static final String UNSUPPORTED_LENGTH_ENCODING = "0005";
    public static final String UNRECOGNISED_SIGN_BYTE_FOR_BCD = "0006"; // sign byte should be 'C' or 'D'
    public static final String INVALID_SIGN_NIBBLE = "0007";
    public static final String EXTRA_CONTENT_FOR_ARRAY_FIELD = "0008";
    public static final String NOT_ENOUGH_CONTENT_FOR_ARRAY_FIELD = "0009";
    public static final String ARRAY_FIELD_TOO_LONG = "0010";
    public static final String ARRAY_FIELD_TOO_SHORT = "0011";
    public static final String LENGTH_VALUE_TOO_LONG = "0012";
    public static final String BER_TLV_FIELD_DECODING_END_PREMATURELY = "0013";
    public static final String ENCODING_CONTENT_TOO_LONG = "0014";
    public static final String FAILED_INBOUND_FIELD_VALIDATION = "0015";
    public static final String FAILED_OUTBOUND_FIELD_VALIDATION = "0016";
    public static final String FAILED_INBOUND_RULE_VALIDATION = "0017";
    public static final String FAILED_OUTBOUND_RULE_VALIDATION = "0018";
    public static final String SCRIPT_EXECUTION_ERROR = "0019";
    public static final String INBOUND_ASSIGNMENT_ERROR = "0020";
    public static final String OUTBOUND_ASSIGNMENT_ERROR = "0021";
    public static final String CONFIGURATION_ERROR = "0022";
    public static final String UNKNOWN_FIELD = "0023";
    public static final String NO_EFT_CONTEXTS_FOUND = "0024";
    public static final String NO_EFT_CONTEXT_FOUND = "0025";
    public static final String NO_CARD_TYPE_FOUND = "0026";
    public static final String NO_CARD_SERVICE_FOUND = "0027";
    public static final String DUPLICATE_MESSAGE = "0028";
    public static final String DECODE_INVALID_DATA_FOUND = "0029";
    public static final String ENCODE_INVALID_DATA_FOUND = "0030";
    public static final String ENCODING_CONTENT_TOO_SHORT = "0031";
    public static final String INVALID_TAG_DELIMITER = "0032";
    public static final String INVALID_ATTRIBUTE_DELIMITER = "0033";
    public static final String NO_MATCHING_END_TAG = "0034";
    public static final String NOT_WELL_FORMED_XML_DATA = "0035";
    public static final String INVALID_DECODED_LENGTH = "0036";
    public static final String UNSUPPORTED_MESSAGE_COMPOSITION = "0037";
    public static final String UNSUPPORTED_MESSAGE_TYPE = "0038";
    public static final String FIELD_NOT_ENABLED = "0039";
    public static final String NO_MATCHING_SESSION = "0040";
    public static final String NO_MESSAGE_TYPE = "0041";
    public static final String RUNTIME_ERROR = "0042";
    public static final String NO_SESSION_DEFINITION = "0043";
    public static final String MESSAGE_CORRELATION_ERROR = "0044";
    public static final String NO_ALIAS_PRODUCED = "0045";
    public static final String DECODE_VALUE_TOO_SHORT = "0046";
    public static final String DECODE_VALUE_TOO_LONG = "0047";
    public static final String INVALID_XML_PCDATA = "0048";
    public static final String SESSION_INACTIVE = "0049";
    public static final String NO_OUTBOUND_HANDLER = "0050";
    public static final String FILE_LOAD_PROCESSING_ERROR = "0051";
    public static final String MISSING_TERMINAL_MERCHANT = "0052";
    public static final String INVALID_BSI_ENUM_VALUE = "0053";
    public static final String ENCODED_PAYLOAD_TOO_LARGE = "0054";
    public static final String ENCODED_HEADER_TOO_LARGE = "0055";
    public static final String ENCODED_TRAILER_TOO_LARGE = "0056";
    public static final String FAILED_MAC_VALIDATION = "0057";
    public static final String FAILED_MAC_GENERATION = "0058";
    public static final String FAILED_DATA_ENCRYPTION = "0059";
    public static final String FAILED_DATA_DECRYPTION = "0060";
    public static final String FAILED_PIN_TRANSLATION = "0061";
    public static final String FAILED_PIN_VERIFICATION = "0062";


}
