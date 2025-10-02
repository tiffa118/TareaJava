package Clase4;

public class AnimalMain {
    public static void main(String[] args) {

        Animal animal1 = new Animal("perro", 5,"domestico");
        Animal animal2 = new Animal("leon",8,"salvaje");
        Animal animal3 = new Animal("gato",8,"domestico");
        //animal1.especie = " perro "
        animal1.saludar();

        System.out.println(" el " + animal1.especie + " es un animal " + animal1.tipo);
        System.out.println("===========");

        animal2.saludar();
        System.out.println("mi " + animal2.especie + " es " + animal2.tipo);
        animal2.comer(":croquetas");


    }
}
