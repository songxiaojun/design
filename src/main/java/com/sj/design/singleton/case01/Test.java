package com.sj.design.singleton.case01;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Singleton singletion = Singleton.getInstance();
            singletion.hello();
        }
    }
}
