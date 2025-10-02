package persona;

import casaEjemplo.casa;

public class personaMain {
    public static void main(String[] args) {
        //llamamos al objeto
        persona Persona1 = new persona();
        Persona1.nombre = "stefany";
        Persona1.edad = 15;
        Persona1.profesion = "Diseñador";

        persona Persona2 = new persona();
        Persona2.nombre = "alicia";
        Persona2.edad = 17;
        Persona2.profesion = "Cosmetologa";
        Persona2.saludar();

        System.out.println("Mi nombre es: "+ Persona2.nombre + " soy " + Persona2.profesion);
        
    }
}
