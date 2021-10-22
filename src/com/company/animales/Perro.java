package com.company.animales;

public class Perro extends  Animal implements  Mascota,  Mamiferos {
    private int patas;
    private  boolean cola;
    private  String raza;

    public  Perro(String nombre, int edad){
        super(nombre, edad);
    }


    @Override
    public void jugar() {
        System.out.println("Me divierto en el parque");
    }

    @Override
    public void dormir() {
        System.out.println("Zzzz Zzzzz Zzzzzz");
    }

    @Override
    public void hablar() {
        System.out.println("Wuuuuaof wuuaof");
    }

    public  void  ladrar(){
        System.out.println("Wuaauf wuuauf");
    }
    //por buena práctica se escribe el override


    @Override
    public void respirar() {
        System.out.println("Respirando por la nariz");
    }


    @Override
    public void gestar() {
        System.out.println("Nazco en dos meses");
    }

    @Override
    public void ingestaLeche() {
        System.out.println("Nutriéndome con leche");
    }

    @Override
    public void movilidad() {
        System.out.println("Camino en cuatro patas");
    }
}
