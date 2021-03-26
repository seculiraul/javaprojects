package com.company;

import javax.swing.plaf.metal.MetalIconFactory;

public interface Pack {

    String packing();
}

class Wrapperr implements Pack {


    @Override
    public String packing() {
        return "Wrapp";
    }
}


class Bottle implements Pack {


    @Override
    public String packing() {
        return "Bottle";
    }
}
