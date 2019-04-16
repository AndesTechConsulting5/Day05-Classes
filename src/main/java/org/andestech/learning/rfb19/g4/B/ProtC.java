package org.andestech.learning.rfb19.g4.B;

import org.andestech.learning.rfb19.g4.ProtA;

public class ProtC {

    ProtA pa;
    public void testProt(){

        pa = new ProtA();
       /// pa.a  .. не разрешается! В другом пакете!



    }

}


class ProtD extends ProtA{


    public void testProt(){

       a = 123123;



    }

}
