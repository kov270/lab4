package com.example.lab4.rest;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class Session {
    private static final Set<String> sessionKeys = new HashSet<String>();

    public static Boolean isValidUser(String secKey) {
        return sessionKeys.contains(secKey);
    }

    public static String getNewKey() {
        String secKey = new BigInteger(130, new SecureRandom()).toString(32);
        sessionKeys.add(secKey);
        return secKey;
    }

    public static void deleteKey(String key) {
        sessionKeys.remove(key);
    }

}
