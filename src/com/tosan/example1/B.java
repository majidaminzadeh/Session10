package com.tosan.example1;

public class B implements X, Y{
    private Y y;
    private X x = new Xs();

    @Override
    public void M1() {
        x.M1();
    }

    @Override
    public void M2() {
        x.M2();
    }

    @Override
    public void M3() {

    }
}
