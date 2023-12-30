package com.star;

public class Main {
    public static void main(String[] args) {
        p("Hello world!");
        p(String.valueOf(getNumber()));

        try {
            p("trying");
            throw new RuntimeException("ahhhhhh!");
        } catch (RuntimeException re) {
            p("caught");
            System.exit(1);
        } finally {
            p("finally");
        }
    }

    private static int getNumber() {
        int number = 0;

        try {
            p("getNumber - trying");
            throw new RuntimeException("AaaaaaH!");
            //compiler error - unreachable
            //return 1;
        } catch (RuntimeException re) {
            p("getNumber = caught");
            return 2;
        } finally {
            p("getNumber - finally");
            return 3; //finally always run.  this method will always return 3
        }
    }

    private static void p(String s) { System.out.println(s);}
}