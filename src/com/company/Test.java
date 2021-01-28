package com.company;

public class Test {
    private  int a;
    private  int b;

    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void meth(int a, int b) {
        a *= 2;
        b /= 2;
    }

    public void metha(Test test) {
        test.a *= 2;
        test.b /= 2;
    }
}
