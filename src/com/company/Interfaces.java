package com.company;

interface Cars {
    public int SerialNumber();
    public String ModelName();
}

class Tesla implements Cars {
    public int SerialNumber() {
        return 500324;
    }

    public String ModelName() {
        return "Model X";
    }
}

class Samsung implements Monitoare {

    @Override
    public int SerialNumber() {
        return 45678;
    }

    @Override
    public String ModelName() {
        return "Samsung A-143";
    }

    @Override
    public int getHeight() {
        return 720;
    }

    @Override
    public int getWidth() {
        return 1366;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Tesla T = new Tesla();
        System.out.println(T.SerialNumber());
        System.out.println(T.ModelName());

        Samsung S = new Samsung();
        System.out.println(S.getHeight() + " " + S.getWidth() + " " + S.SerialNumber() + " " + S.ModelName());


    }
}
