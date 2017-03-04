package com.sdajava.figury;

import java.util.Scanner;

public class Pola {

    public int a;
    public int b;


    public Pola(int a, int b)
    {
        this.a = a;
        this.b = b;
    }


    public int polekwadratu()
    {
        return a*a;
    }

    public int poleprostokata()
    {
        return a*b;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getA ()
    {
        return a;
    }


    public int getB ()
    {
        return b;
    }

    public void czytajDane()
    {
        Scanner wejscie = new Scanner(System.in);

        this.a = wejscie.nextInt();
        this.b = wejscie.nextInt();
    }


}


