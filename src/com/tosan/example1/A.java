package com.tosan.example1;

public class A implements X, Z{
    private X x = new Xs();
    private Z z = new Zs();

    @Override
    public void M1() {
        x.M1();
    }

    @Override
    public void M2() {
        x.M2();
    }

    @Override
    public void M4() {
        z.M4();
    }
}
