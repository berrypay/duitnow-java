/*
 * Project: BerryPay PayNet DuitNow SDK
 * Filename: /core/src/main/java/com/berrypay/paynet/duitnow/util/DuitNowSigner.java
 * Created Date: Tuesday July 16th 2024 17:20:05 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay (M) Sdn. Bhd.
 * --------------------------------------
 * Last Modified: Tuesday July 16th 2024 17:27:31 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.stream.Collectors;

public class DuitNowSigner {
    private static Logger logger = LoggerFactory.getLogger(DuitNowSigner.class);
    private static DuitNowSigner instance;

    private static final String KEY_ALGORITHM = "RSA";
    private static final String SIGNATURE_ALGORITHM = "SHA256withRSA";

    private DuitNowSigner() {
    }

    public static DuitNowSigner getInstance() {
        if (instance == null) {
            logger.info("No DuitNowSigner instance found, creating new instance");
            instance = new DuitNowSigner();
        }

        return instance;
    }

    public static String genSignature(String privateKeyPath, String stringToSign) throws NoSuchAlgorithmException,
            InvalidKeyException, InvalidKeySpecException, IOException, SignatureException {
        Signature signature = Signature.getInstance(SIGNATURE_ALGORITHM);
        signature.initSign(createPrivateKeyInstance(privateKeyPath));
        signature.update(stringToSign.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(signature.sign());
    }

    public static boolean verifySignature(String publicKeyPath, String stringToVerify, String responseSignature)
            throws NoSuchAlgorithmException, InvalidKeyException, IOException,
            SignatureException, CertificateException {
        // Response Verification (Use to verify Response Message X-Signature)
        PublicKey publicKey = createPublicKeyInstance(publicKeyPath);
        Signature signatureResponse = Signature.getInstance(SIGNATURE_ALGORITHM);
        signatureResponse.initVerify(publicKey);
        signatureResponse.update(stringToVerify.getBytes(StandardCharsets.UTF_8));
        return signatureResponse.verify(Base64.getDecoder().decode(responseSignature));
    }

    public static PrivateKey createPrivateKeyInstance(String pathToKey)
            throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(pathToKey)))) {
            String content = reader.lines().filter(line -> !line.startsWith("-----")).collect(Collectors.joining());
            KeyFactory factory = KeyFactory.getInstance(KEY_ALGORITHM);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(content));
            return factory.generatePrivate(keySpec);
        }
    }

    public static PublicKey createPublicKeyInstance(String pathToKey)
            throws IOException, CertificateException {
        try (FileInputStream reader = new FileInputStream(pathToKey)) {
            CertificateFactory f = CertificateFactory.getInstance("X.509");
            X509Certificate certificate = (X509Certificate) f.generateCertificate(reader);
            return certificate.getPublicKey();
        }
    }

}
