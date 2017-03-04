package com.sdajava.figury;

public class Main {

    public static void main(String[] args) {

        Pola kwadrat = new Pola (2, 5);
        System.out.println(kwadrat.polekwadratu());

        Pola prostokat = new Pola (1, 2);
        System.out.println(prostokat.poleprostokata());
        Pola polekwadratu = new Pola(6,7);

        System.out.println(kwadrat.getA());

        System.out.println(prostokat.getA());

        System.out.println(kwadrat.getB());

        System.out.println(prostokat.getB());

        kwadrat.setA(3);

        System.out.println(kwadrat.polekwadratu());



        kwadrat.czytajDane();
        System.out.println(kwadrat.polekwadratu());









    }
}
