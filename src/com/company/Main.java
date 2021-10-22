package com.company;

import com.company.UBER.ConductorUberBlack;
import com.company.UBER.UberDriver;
import com.company.animales.Animal;
import com.company.animales.Ave;
import com.company.animales.Perro;

public class Main {

    public static void main(String[] args) {
	   // Ave ave = new  Ave( "pettitojo", 14 );
		  //  System.out.println(ave.getNombre());
	    //ave.comunicarse();
	    //ave.hacerNIdo();
	    //ave.comer();

		System.out.println("----------------------------------------");

	   /* Perro lomito = new Perro("Alford", 33);*/

	   // lomito.comunicarse();
	    //lomito.jugar();
	    //lomito.comer();

		/*Animal animal = new Animal()(){
			animal.comer();
			animal.comunicarse();*/
            System.out.println("-------------------------------------");
        //Ejercicio uber
           UberDriver driverNormal = new UberDriver();
           ConductorUberBlack driverBlack = new ConductorUberBlack();
           driverBlack.setMinimum(15);
        System.out.println("uber nomal");
        System.out.println(driverNormal.calculatePrice(6));

        System.out.println("Uber black");
        System.out.println(driverBlack.calculatePrice(6));


    }
}
