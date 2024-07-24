/*
 * Project: PayNet DuitNow SDK
 * Filename: null.java
 * Created Date: Wednesday July 24 2024 12:43
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay Group of Companies
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow;

public class RppReasonCode {
    private RppReasonCode() {
    }

    // TODO: list all from source
    // Source: https://docs.developer.paynet.my/docs/dobw/response-codes#reason-codes
    public static final String TRANSACTION_ACCEPTED = "U000";
    public static final String TRANSACTION_SAF = "U002";
    public static final String PRODUCT_NOT_FOUND = "U100";
    public static final String TENANT_NOT_FOUND = "U101";
    public static final String TENANT_INACTIVE = "U102";
    public static final String TENANT_UNDEFINED = "U103";
    public static final String INBOUND_SCHEME_NOT_FOUND = "U104";
    public static final String INBOUND_SCHEME_INACTIVE = "U105";
    public static final String ORIGINAL_PAYMENT_NOT_FOUND = "U106";
    public static final String ORIGINAL_PAYMENT_REJECTED = "U107";
    public static final String ORIGINAL_PAYMENT_NOT_RESPONDED = "U108";
    public static final String PAYMENT_NOT_ACCEPTED = "U110";
    public static final String MIN_AMOUNT_CHECK_FAILURE = "U111";
    public static final String MAX_AMOUNT_CHECK_FAILURE = "U112";
    public static final String MOD_10_CHECK_FAILURE = "U114";
    public static final String DATA_SENT_TOLERANCE_CHECK_FAILURE = "U115";
    public static final String DATE_SETTLEMENT_TOLERANCE_CHECK_FAILURE = "U116";
    public static final String ORIGINAL_DATE_TOLERANCE_CONFIGURATION_ERROR = "U117";
    public static final String ORIGINAL_DATE_TOLERANCE_CHECK_FAILURE = "U118";
    public static final String SESSION_VALIDATION_FAILURE = "U119";
    public static final String INBOUND_BANK_NOT_FOUND = "U121";
    public static final String INBOUND_BANK_INACTIVE = "U122";
    public static final String UNDEFINED_PRODUCT = "U123";
    public static final String BANK_CODE_NOT_FOUND = "U124";
    public static final String INBOUND_BANK_CLASSIFIER_NOT_FOUND = "U125"; //Inbound Bank ID Cannot be Determined
    public static final String OUTBOUND_BANK_CLASSIFIER_NOT_FOUND = "U126"; //Outbound Bank ID Cannot be Determined
    public static final String OUTBOUND_BANK_INACTIVE = "U128";
    public static final String PAYEE_BANK_UNAVAILABLE = "U129";
    public static final String INBOUND_SETTLEMENT_BANK_NOT_FOUND = "U130";
    public static final String OUTBOUND_SETTLEMENT_BANK_NOT_FOUND = "U131";
    public static final String INBOUND_SETTLEMENT_BANK_INACTIVE = "U132";
    public static final String OUTBOUND_SETTLEMENT_BANK_INACTIVE = "U134";
    public static final String PRE_AUTHORISATION_MATCH_NOT_FOUND = "U135";
    public static final String PRE_AUTHORISATION_BANK_ACCOUNT_CHECK_FAILURE = "U136";
    public static final String PRE_AUTHORISATION_TIMEOUT = "U137";
    public static final String PRE_AUTHORISATION_CONFIG_NOT_FOUND = "U138";
    public static final String PRE_AUTHORISATION_ENDPOINT_NOT_CONFIGURED = "U139";
    public static final String PRE_AUTHORISATION_NO_RESPONSE_EXCEPTION = "U140";
    public static final String PRE_AUTHORISATION_EXCEPTION = "U141";
    public static final String PRE_AUTHORISATION_STAND_IN_LIMIT_EXCEEDED = "U142";
    public static final String PRE_AUTHORISATION_STAND_IN_ACCOUNT_NOT_FOUND = "U143";
    public static final String PRE_AUTHORISATION_STAND_IN_ACCOUNT_INACTIVE = "U144";
    public static final String PRE_AUTHORISATION_STAND_IN_INSUFFICIENT_FUNDS = "U145";
    public static final String PRE_AUTHORISATION_STAND_IN_NOT_PERMITTED = "U146";
    public static final String PRE_AUTHORISATION_NO_STAND_IN_RESPONSE = "U147";
    public static final String DUPLICATE_TRANSACTION = "U149";
    public static final String NOTIFICATION_CONFIG_NOT_FOUND = "U150";
    public static final String NOTIFICATION_ENDPOINT_NOT_CONFIGURED = "U151";
    public static final String FRAUD_CHECK_FAILURE = "U155";
    public static final String SANCTION_CHECK_FAILURE = "U156";
    public static final String AML_CHECK_FAILURE = "U157";
    public static final String PRE_AUTHORISATION_STAND_IN_REJECTED_WITH_DEFAULT = "U159";
    public static final String SETTLEMENT_RULES_NOT_FOUND = "U160";
    public static final String SETTLEMENT_ENDPOINT_NOT_CONFIGURED = "U161";
    public static final String SETTLEMENT_CONFIRMATION_NOT_RECEIVED = "U162";
    public static final String FORWARDED_SETTLEMENT_CONFIRMATION_RESPONSE_NOT_RECEIVED = "U163";
    public static final String SETTLEMENT_TOTAL_MANAGEMENT_NOT_CONFIGURED = "U164";
    public static final String ONLINE_ROUTE_NOT_FOUND = "U170";
    public static final String ONLINE_AUTHORISATION_EXCEPTION = "U171";
    public static final String ONLINE_AUTHORISATION_NO_RESPONSE_EXCEPTION = "U172";
    public static final String ONLINE_AUTHORISATION_TIMEOUT_EXCEPTION = "U173";
    public static final String AUTHORISATION_SERVICE_NOT_CONFIGURED = "U180";
    public static final String STAND_IN_LIMIT_EXCEEDED = "U181";
    public static final String STAND_IN_ACCOUNT_NOT_FOUND = "U182";
    public static final String STAND_IN_ACCOUNT_INACTIVE = "U183";
    public static final String STAND_IN_INSUFFICIENT_FUNDS = "U184";
    public static final String STAND_IN_NOT_PERMITTED = "U185";
    public static final String STAND_IN_NO_RESPONSE = "U186";
    public static final String STAND_IN_CANT_DELIVER_FORWARDING_ADVICE = "U187";
    public static final String STAND_IN_REJECTED_WITH_DEFAULT = "U189";
    public static final String LIQUIDITY_MANAGEMENT_NOT_CONFIGURED = "U190";
    public static final String LIQUIDITY_RULES_NOT_FOUND = "U191";
    public static final String LIQUIDITY_POSITION_VALIDATION_RULE_NOT_FOUND = "U192";
    public static final String LIQUIDITY_POSITION_VALIDATION_FAILURE = "U193";
    public static final String INSUFFICIENT_LIQUIDITY = "U194";
    public static final String LIQUIDITY_FORCED_PAYMENT_REJECTION = "U195";
    public static final String LIQUIDITY_PARAMETER_INVALID = "U196"; // invalid or null
    public static final String LIQUIDITY_PARAMETER_NOT_FOUND = "U197";
    public static final String LIQUIDITY_VALIDATION_NOT_FOUND = "U198";
    public static final String LIQUIDITY_POSITION_DEFINITION_NOT_FOUND = "U199";
    public static final String LQM_MAX_AMOUNT_NOT_FOUND = "U200";
    public static final String LQM_MAX_AMOUNT_EXCEEDED = "U201";
    public static final String LQM_NET_SENDER_THRESHOLD_LIMIT_NOT_FOUND = "U202";
    public static final String LQM_INSUFFICIENT_NET_SENDER_FUNDS = "U203";
    public static final String SCHEME_SETTLEMENT_BODY_UNAVAILABLE = "U205";
    public static final String SETTLEMENT_REJECTION = "U206";
    public static final String DEFAULT_SETTLEMENT_BODY_NOT_DEFINED = "U207";
    public static final String SETTLEMENT_FORWARD_CONFIRMATION_SEND_FAILURE = "U208";
    public static final String SETTLEMENT_FORWARD_CONFIRMATION_RECEIVE_FAILURE = "U209";
    public static final String OUTBOUND_SCHEME_NOT_FOUND = "U210";
    public static final String OUTBOUND_SCHEME_INACTIVE = "U211";
    public static final String CONNECTOR_NOT_FOUND = "U212";
    public static final String CONNECTOR_CONFIG_ERROR = "U213";
    public static final String CLEARING_REJECTION = "U214";
    public static final String MESSAGE_REJECTED_WITH_ADMI_002 = "U215";
    public static final String MANDATE_RULES_NOT_FOUND = "U221";
    public static final String MANDATE_MASTER_UPDATE_ERROR = "U222";
    public static final String MANDATE_RECORD_NOT_FOUND = "U223";
    public static final String MANDATE_START_DATE_EARLIER_THAN_CURRENT = "U224";
    public static final String MANDATE_START_DATE_FORMAT_ERROR = "U225";
    public static final String MANDATE_END_DATE_EARLIER_THAN_CURRENT = "U226";
    public static final String MANDATE_END_DATE_FORMAT_ERROR = "U227";
    public static final String MANDATE_FREQUENCY_TYPE_VALIDATION_ERROR = "U228";
    public static final String MANDATE_UNKNOWN_UPDATER = "U229";
    public static final String MANDATE_SENDER_NOT_ALLOWED_TO_UPDATE = "U230";
    public static final String MANDATE_STATUS_VALIDATION_ERROR = "U231";
    public static final String AMOUNT_EXCEED_MAX_LIMIT = "U232";
    public static final String MANDATE_AMOUNT_MISSING = "U233";
    public static final String REQUEST_EARLIER_THAN_MANDATE_START_DATE = "U234";
    public static final String CANNOT_UPDATE_FUTURE_MANDATE = "U235";
    public static final String CANNOT_UPDATE_EXPIRED_MANDATE = "U236";
    public static final String CANNOT_UPDATE_CANCELED_MANDATE = "U237";
    public static final String REQUEST_LATER_THAN_MANDATE_END_DATE = "U238";
    public static final String HOLD_DATE_EXCEED_EXPIRY_DATE = "U239";
    public static final String ADJUSTMENT_TYPE_ERROR = "U240";
    public static final String ADJUSTMENT_ACTION_ERROR = "U241";
    public static final String ADJUSTMENT_MISSING_MANDATORY_FIELD = "U242";
    public static final String BALANCE_TRANSFER_BALANCE_NOT_ENOUGH = "U243";
    public static final String SPONSOR_ADJUSTMENT_PROCESSING_RULE_NOT_FOUND = "U244";
    public static final String SPONSOR_ADJUSTMENT_AUTH_TIMEOUT = "U245";
    public static final String SPONSOR_ADJUSTMENT_AUTH_REJECTED = "U246";
    public static final String ADJUSTMENT_NOT_PERFORMED = "U247";
    public static final String ADJUSTMENT_PERFORMED_BUT_FAILED = "U248";
    public static final String AUTO_ADJUSTMENT_BALANCE_CONFIRMATION_FAILED = "U249";
    public static final String ALIAS_TYPE_NOT_SUPPORTED = "U250";
    public static final String SPONSOR_ADJUSTMENT_AUTH_COMM_ERROR = "U251";
    public static final String SPONSOR_ADJUSTMENT_INSUFFICIENT_BALANCE = "U252";
    public static final String INBOUND_BANK_SUSPENDED = "U253";
    public static final String OUTBOUND_BANK_SUSPENDED = "U254";
    public static final String INBOUND_SETTLEMENT_BANK_SUSPENDED = "U255";
    public static final String OUTBOUND_SETTLEMENT_BANK_SUSPENDED = "U256";
    public static final String ADJUSTMENT_AT_NONE_BUSINESS_DAY = "U257";
    public static final String PRM_CHECK_FAILED = "U258";
    public static final String PRM_INVALID_STATUS = "U259";
    public static final String PRM_CHECK_DENIED = "U260";
    public static final String PRM_CHECK_REFERRED = "U261";
    public static final String ACCOUNT_ALIAS_UNMATCHED = "U262";
    public static final String SENDER_NOT_ELIGIBLE_FOR_REQUEST = "U263";
    public static final String MANDATE_NOT_PENDING_AUTHORISATION = "U264";
    public static final String ACCEPTABLE_SOURCE_OF_FUND_NOT_ALLOWED = "U265";
    public static final String CRYPTO_AES_ALIAS_NOT_FOUND = "U266";
    public static final String CRYPTO_AES_KEY_FORMAT_ERROR = "U267";
    public static final String MERCHANT_ID_NOT_ALLOWED = "U268";
    public static final String RTP_TXN_NOT_MATCHED = "U269";
    public static final String SUBSTATE_NOT_MATCHED = "U270";
    public static final String MANDATE_INIT_TXN_NOT_MATCHED = "U271";
    public static final String MANDATE_END_DATE_LESS_EQUAL_CURRENT = "U272";
    public static final String RTP_RECORD_NOT_FOUND = "U273";
    public static final String CA_NOT_MATCHED = "U274";
    public static final String DA_NOT_MATCHED = "U275";
    public static final String CONSENT_TYPE_NOT_ALLOWED = "U276";
    public static final String CRYPTO_DEC_FAILED = "U277";
    public static final String CRYPTO_ENC_FAILED = "U278";
    public static final String CRYPTO_SIGN_FAILED = "U279";
    public static final String CERT_PATH_NOT_CONFIGURED = "U280";
    public static final String CRYPTO_VERIFY_FAILED = "U281";
    public static final String CRYPTO_RULE_NOT_FOUND = "U282";
    public static final String MANDATE_BRN_VALUE_CHECK_FAILURE = "U283";
    public static final String MANDATE_UPDATE_NOT_ALLOWED = "U284";
    public static final String MANDATE_EXPIRED = "U285";
    public static final String MANDATE_INACTIVE = "U286";
    public static final String EXCEED_MANDATE_MAX_AMOUNT = "U287";
    public static final String MANDATE_STATUS_NOT_ALLOWED = "U288";
    public static final String MANDATE_EXPIRY_EXCEED_MAX = "U289";
    public static final String MANDATE_INIT_REQUEST_EXPIRED = "U290";
    public static final String NP_QR_ENQUIRY_PRE_QR_PAYMENT = "U300";
    
}
