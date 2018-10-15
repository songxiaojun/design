package com.sj.design.singleton.case02;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            Singleton instance = Singleton.getInstance();
            instance.hello();
        }
    }
}
