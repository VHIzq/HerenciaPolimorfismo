package com.company.animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public  Animal(){
    }
    public  Animal( String nombre, int edad ){
        this.nombre = nombre;
        this.edad = edad;
        System.out.println("Constructor padre");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public  void comunicarse(){
        System.out.println("Uuuuggg  aooooq");
    }
    public  void  comer(){
        System.out.println("Yam yam yam");
    }
    public abstract   void respirar(  );



}
