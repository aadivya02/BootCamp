package com.company;

public class Main {

    public static void main(String[] args) {

        bank b = new bank();
        b.getmethod();

        b = new Sbi();
        b.getmethod();

        b = new Boi();
        b.getmethod();


        b = new Icici();
        b.getmethod();


    }
}

class bank{

    public void   getmethod() {


System.out.println("Bank ROI");
    }
}

class Sbi extends bank{

    @Override
    public void getmethod() {
        System.out.println(" SBI ROI IS "+ 12.5);
    }
}
class Boi extends bank{
    @Override
    public void getmethod() {
        System.out.println(" BOI ROI IS "+7.8);
    }
}

class Icici extends bank{

    @Override
    public void getmethod() {
        System.out.println(" ICICI ROI IS "+9.5);
    }
}