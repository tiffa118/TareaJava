package Clase2;

public class ProfesorMain {
    public static void main(String[] args) {
        Profesor Profesor1 = new Profesor();
        Profesor1.nombre = "Carlos";
        Profesor1.curso = "ingles";
        Profesor1.experiencia = 10;
        Profesor1.capacita();

        Profesor Profesor2 = new Profesor();
        Profesor2.nombre = "marcos";
        Profesor2.curso = "algebra";
        Profesor2.experiencia = 7;
        Profesor2.capacita();

        Profesor Profesor3 = new Profesor();
        Profesor3.nombre = "juan";
        Profesor3.curso = "computacion";
        Profesor3.experiencia = 4;
        Profesor3.capacita();

        System.out.println(" el profesor " + Profesor3.nombre + " tiene experiencia en: " + Profesor3.curso);
    }
}
