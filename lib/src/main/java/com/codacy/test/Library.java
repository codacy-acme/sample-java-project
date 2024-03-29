/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.codacy.test;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Nonnull;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NullCipher;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    @Nonnull
    public Object testObject(Object o, byte[] plainText) throws IllegalBlockSizeException, BadPaddingException {
        Cipher doNothingCihper = new NullCipher();
        byte[] cipherText = doNothingCihper.doFinal(plainText);

        return o;
    }

    public void testIL_CONTAINER_ADDED_TO_ITSELF() {
        Set<Object> l = new HashSet<>();
        l.add("test");
        l.add(l);
    }

    public String tostring() {
        return "this is an issue";
    }
    
    public void getAccessKey() {
        byte[] iv = "secret key in here".getBytes();
        byte[] iv2 = new byte[] { 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, };
        byte[] iv3 = "secret iv in here".getBytes();

    }
}
