package com.oops4u.dataStructure.ex3;

public class tryCatch {
    private int a=10, b=0, c;

    public tryCatch() {
        System.out.println("### start : " + getClass());
        try {
            c = a/b;
            System.out.println("### c : " + c);
        } catch (ArithmeticException e) {
            System.out.println("### catch : " + e);
            System.out.println("### error : 나누기 불가");
        } finally {
            System.out.println("### end");
        }
    }
}
