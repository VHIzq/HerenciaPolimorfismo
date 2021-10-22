package com.company.animales;
//ave
public class Ave extends  Animal {
    private  int alas;
    private  int patas;
    private  boolean vuela;

    public  Ave(){
        super();
    }

    public  Ave( String nombre, int edad ){
        super(nombre, edad);
        System.out.println("Constructor hijo");
    }
    public void  hacerNIdo(){
        System.out.println("Anidando");
    }
    public  void  ponerHuevo(){
        System.out.println("Empollando");
    }
    @Override
    public  void  comer(){
        System.out.println("Alpiste rico");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por el pico");
    }


}
