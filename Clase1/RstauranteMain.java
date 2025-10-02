package Clase1;

public class RestauranteMain {
    public static void main(String[] args) {

        Restaurante restaurante1 = new Restaurante();
        restaurante1.nombre = "el horno";
        restaurante1.especialidad = "Pollo";
        restaurante1.Cliente = 4;
        restaurante1.atencion();

        Restaurante Restaurante2 = new Restaurante();
        Restaurante2.nombre = "el carbon";
        Restaurante2.especialidad = " la parrilla";
        Restaurante2.Cliente = 6;
        Restaurante2.atencion();

        Restaurante Restaurante3 = new Restaurante();
        Restaurante3.nombre = "el raya";
        Restaurante3.especialidad = "pescado";
        Restaurante3.Cliente = 8;
        Restaurante3.atencion();

        System.out.println("el Restaurante " + Restaurante3.nombre + " tiene la especialidad de: " + Restaurante3.especialidad);

    }
}
