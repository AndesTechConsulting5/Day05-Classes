package org.andestech.learning.rfb19.g4;

public class ProtA {

    protected int a = 1;
}

class ProtB {

    ProtA pa;
    public void testProt(){

        pa = new ProtA();



    }
}