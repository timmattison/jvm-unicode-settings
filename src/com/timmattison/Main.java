package com.timmattison;

import java.nio.charset.Charset;

public class Main {
    public static final String REGISTERED_TRADEMARK = "®";

    public static void main(String[] args) {
        System.out.println("Your default charset is " + Charset.defaultCharset());
        System.out.println("There should be a registered trademark here in double-quotes -> \"" + REGISTERED_TRADEMARK + "\"");
    }
}
