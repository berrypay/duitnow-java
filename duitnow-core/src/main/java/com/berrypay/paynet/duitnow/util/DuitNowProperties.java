/*
 * Project: BerryPay PayNet DuitNow SDK
 * Filename: /core/src/main/java/com/berrypay/paynet/duitnow/util/DuitNowProperties.java
 * Created Date: Monday July 15th 2024 14:28:28 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay (M) Sdn. Bhd.
 * --------------------------------------
 * Last Modified: Tuesday July 16th 2024 15:32:53 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */
package com.berrypay.paynet.duitnow.util;

import com.berrypay.paynet.duitnow.DuitNowConstant;
import java.util.Map;

public class DuitNowProperties {
    private String duitnowVersion;
    private String duitNowV2CertDir;
    private String duitNowV2PrivateKey;
    private String duitNowV2HeaderSignatureKey;
    private String duitNowV2HeaderIP;
    private String duitNowV2HeaderGPS;
    private String duitNowIDRetrieveBankListOriginator;
    private String duitNowIDRetrieveBankListChannel;
    private String duitNowIDRetrieveBankListTrxType;
    private String duitNowIDRPPBIC;
    private String duitNowIDClientBIC;
    private String tokenURI;
    private String tokenClientId;
    private String tokenClientSecret;
    private String httpIP;
    private int httpPort;
    private boolean ssl;
    private String duitNowV2APIURIRetrieveBankList;

    private Map<String, String> prop = DuitNowUtil.loadProp();

    public Map<String, String> getProp() {
        return this.prop;
    }

    public DuitNowProperties() {
        this.duitnowVersion = this.prop.get(DuitNowConstant.DUITNOW_VERSION);
        this.duitNowV2CertDir = this.prop.get(DuitNowConstant.DUITNOW_V2_CERT_DIR);
        this.duitNowV2PrivateKey = this.prop.get(DuitNowConstant.DUITNOW_V2_PRIVATE_KEY);
        this.duitNowV2HeaderSignatureKey = this.prop.get(DuitNowConstant.DUITNOW_V2_HEADER_SIGNATURE_KEY);
        this.duitNowV2HeaderIP = this.prop.get(DuitNowConstant.DUITNOW_V2_HEADER_IP_ADDRESS);
        this.duitNowV2HeaderGPS = this.prop.get(DuitNowConstant.DUITNOW_V2_HEADER_GPS_COORDINATES);
        this.duitNowV2APIURIRetrieveBankList = this.prop.get(DuitNowConstant.DUITNOW_V2_API_URI_RETRIEVE_BANK_LIST);
        this.duitNowIDRetrieveBankListOriginator = this.prop
                .get(DuitNowConstant.DUITNOW_ID_RETRIEVE_BANK_LIST_ORIGINATOR);
        this.duitNowIDRetrieveBankListChannel = this.prop.get(DuitNowConstant.DUITNOW_ID_RETRIEVE_BANK_LIST_CHANNEL);
        this.duitNowIDRetrieveBankListTrxType = this.prop.get(DuitNowConstant.DUITNOW_ID_RETRIEVE_BANK_LIST_TRX_TYPE);
        this.duitNowIDRPPBIC = this.prop.get(DuitNowConstant.DUITNOW_ID_RPP_BIC);
        this.duitNowIDClientBIC = this.prop.get(DuitNowConstant.DUITNOW_ID_CLIENT_BIC);
        this.httpIP = this.prop.get(DuitNowConstant.HTTP_IP);
        this.tokenURI = this.prop.get(DuitNowConstant.DUITNOW_TOKEN_URI);
        this.tokenClientId = this.prop.get(DuitNowConstant.DUITNOW_TOKEN_CLIENT_ID);
        this.tokenClientSecret = this.prop.get(DuitNowConstant.DUITNOW_TOKEN_CLIENT_SECRET);
    }

    public void setDuitnowVersion(String duitnowVersion) {
        this.duitnowVersion = duitnowVersion;
    }

    public void setDuitNowV2CertDir(String duitNowV2CertDir) {
        this.duitNowV2CertDir = duitNowV2CertDir;
    }

    public void setDuitNowV2PrivateKey(String duitNowV2PrivateKey) {
        this.duitNowV2PrivateKey = duitNowV2PrivateKey;
    }

    public void setDuitNowV2HeaderSignatureKey(String duitNowV2HeaderSignatureKey) {
        this.duitNowV2HeaderSignatureKey = duitNowV2HeaderSignatureKey;
    }

    public void setDuitNowV2HeaderIP(String duitNowV2HeaderIP) {
        this.duitNowV2HeaderIP = duitNowV2HeaderIP;
    }

    public void setDuitNowV2HeaderGPS(String duitNowV2HeaderGPS) {
        this.duitNowV2HeaderGPS = duitNowV2HeaderGPS;
    }

    public void setDuitNowIDRetrieveBankListOriginator(String duitNowIDRetrieveBankListOriginator) {
        this.duitNowIDRetrieveBankListOriginator = duitNowIDRetrieveBankListOriginator;
    }

    public void setDuitNowIDRetrieveBankListChannel(String duitNowIDRetrieveBankListChannel) {
        this.duitNowIDRetrieveBankListChannel = duitNowIDRetrieveBankListChannel;
    }

    public void setDuitNowIDRetrieveBankListTrxType(String duitNowIDRetrieveBankListTrxType) {
        this.duitNowIDRetrieveBankListTrxType = duitNowIDRetrieveBankListTrxType;
    }

    public void setDuitNowIDRPPBIC(String duitNowIDRPPBIC) {
        this.duitNowIDRPPBIC = duitNowIDRPPBIC;
    }

    public void setDuitNowIDClientBIC(String duitNowIDClientBIC) {
        this.duitNowIDClientBIC = duitNowIDClientBIC;
    }

    public void setTokenURI(String tokenURI) {
        this.tokenURI = tokenURI;
    }

    public void setTokenClientId(String tokenClientId) {
        this.tokenClientId = tokenClientId;
    }

    public void setTokenClientSecret(String tokenClientSecret) {
        this.tokenClientSecret = tokenClientSecret;
    }

    public void setHttpIP(String httpIP) {
        this.httpIP = httpIP;
    }

    public void setHttpPort(int httpPort) {
        this.httpPort = httpPort;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }

    public void setDuitNowV2APIURIRetrieveBankList(String duitNowV2APIURIRetrieveBankList) {
        this.duitNowV2APIURIRetrieveBankList = duitNowV2APIURIRetrieveBankList;
    }

    public void setProp(Map<String, String> prop) {
        this.prop = prop;
    }

    public String getDuitnowVersion() {
        return this.duitnowVersion;
    }

    public String getDuitNowV2CertDir() {
        return this.duitNowV2CertDir;
    }

    public String getDuitNowV2PrivateKey() {
        return this.duitNowV2PrivateKey;
    }

    public String getDuitNowV2HeaderSignatureKey() {
        return this.duitNowV2HeaderSignatureKey;
    }

    public String getDuitNowV2HeaderIP() {
        return this.duitNowV2HeaderIP;
    }

    public String getDuitNowV2HeaderGPS() {
        return this.duitNowV2HeaderGPS;
    }

    public String getDuitNowIDRetrieveBankListOriginator() {
        return this.duitNowIDRetrieveBankListOriginator;
    }

    public String getDuitNowIDRetrieveBankListChannel() {
        return this.duitNowIDRetrieveBankListChannel;
    }

    public String getDuitNowIDRetrieveBankListTrxType() {
        return this.duitNowIDRetrieveBankListTrxType;
    }

    public String getDuitNowIDRPPBIC() {
        return this.duitNowIDRPPBIC;
    }

    public String getDuitNowIDClientBIC() {
        return this.duitNowIDClientBIC;
    }

    public String getTokenURI() {
        return this.tokenURI;
    }

    public String getTokenClientId() {
        return this.tokenClientId;
    }

    public String getTokenClientSecret() {
        return this.tokenClientSecret;
    }

    public String getHttpIP() {
        return this.httpIP;
    }

    public int getHttpPort() {
        return this.httpPort;
    }

    public boolean isSsl() {
        return this.ssl;
    }

    public String getDuitNowV2APIURIRetrieveBankList() {
        return this.duitNowV2APIURIRetrieveBankList;
    }
}
