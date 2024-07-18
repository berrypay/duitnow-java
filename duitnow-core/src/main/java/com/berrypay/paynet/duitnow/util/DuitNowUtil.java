/*
 * Project: BerryPay PayNet DuitNow SDK
 * Filename: /core/src/main/java/com/berrypay/paynet/duitnow/util/DuitNowUtil.java
 * Created Date: Monday July 15th 2024 15:01:44 +0800
 * Author: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * Company: BerryPay (M) Sdn. Bhd.
 * --------------------------------------
 * Last Modified: Tuesday July 16th 2024 15:16:45 +0800
 * Modified By: Sallehuddin Abdul Latif (sallehuddin@berrypay.com)
 * --------------------------------------
 * Copyright (c) 2024 BerryPay (M) Sdn. Bhd.
 */

package com.berrypay.paynet.duitnow.util;

import com.berrypay.paynet.duitnow.exception.DuitNowConfigException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DuitNowUtil {
    private static Logger logger = LoggerFactory.getLogger(DuitNowUtil.class);
    private static DuitNowUtil instance = new DuitNowUtil();
    private static Map<String, String> properties = new HashMap<>();

    private DuitNowUtil() {
    }

    public static synchronized DuitNowUtil getInstance() {
        if (instance == null) {
            logger.info("No DuitNowUtil instance found, creating new instance");
            instance = new DuitNowUtil();
        }

        return instance;
    }

    public static Map<String, String> loadProp() {
        if (properties.size() == 0) {
            ClassLoader loader = DuitNowUtil.class.getClassLoader();
            try (InputStream input = loader.getResourceAsStream("duitnow.properties")) {
                properties = readPropertiesFromInputStream(input);
            } catch (NullPointerException ex) {
                logger.error("Error reading duitnow properties file: {}", ex.toString());
                logger.warn("DuitNow component are not properly initialized for use!!!");
            } catch (IOException ex) {
                logger.warn("Error closing the input stream: {}", ex.toString());
            } catch (DuitNowConfigException ex) {
                logger.error("Error processing duitnow properties file: {}", ex.toString());
            }
        }

        return properties;
    }

    private static Map<String, String> readPropertiesFromInputStream(InputStream inputStream)
            throws DuitNowConfigException {
        try {
            Properties prop = new Properties();
            if (inputStream == null) {
                throw new DuitNowConfigException("Null input stream passed");
            }

            prop.load(inputStream);
            for (Map.Entry<Object, Object> entry : prop.entrySet()) {
                properties.put((String) entry.getKey(), (String) entry.getValue());
            }

            return properties;
        } catch (Exception ex) {
            throw new DuitNowConfigException(ex.getMessage());
        }
    }
}
