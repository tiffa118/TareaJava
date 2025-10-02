package Clase4;

public class Animal {
    String especie;
    int edad;
    String tipo;

    public Animal() {
    }
    // constructor
    public Animal(String especie, int edad, String tipo) {
        this.especie = especie;
        this.edad = edad;
        this.tipo = tipo;
    }
    // creando los metodos de la clase
    void saludar(){
        System.out.println("Hola, soy un perro");
    }
    public void comer(String comio) {
        System.out.println("el " + especie + "esta comiendo.");
    }
}


