package com.company;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
        public int InnerMethod() {
            return x;
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass I = o.new InnerClass();
        System.out.println(I.y + o.x);
        System.out.println(I.InnerMethod());
    }
}
