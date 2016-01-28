package com.ajoshi.epi.arraysAndStrings;

/**
 * Created by ajoshi on 11/17/15.
 */
public class Test {
    public static void main(String args[]) {
        Parent p = new Parent();
        Child c = new Child();
        func(c);
    }

    public static void func(Parent p) {
        if (p.getClass() == Parent.class) {
            System.out.println("I am parent");
        } else if(p.getClass() == Child.class) {
            System.out.println("I am Child = " + ((Child)p).getI2());
        } else {
            System.out.println("I am Mr.nobody");
        }
    }

    public static class Parent {
        int i1;

    }

    public static class Child extends Parent {
        int i2 = 5;

        public int getI2(){
            return i2;
        }
    }
}
