package Clase3;

public class LibroMain {
    public static void main(String[] args) {
        Libro Libro1 = new Libro();
        Libro1.titulo = "sigue mi voz";
        Libro1.autor = "ariana godoy";
        Libro1.paginas = 400;
        Libro1.revisar();

        Libro Libro2 = new Libro();
        Libro2.titulo = "fabricante de lagrimas";
        Libro2.autor = "erin doom";
        Libro2.paginas = 300;
        Libro2.revisar();

        Libro Libro3 = new Libro();
        Libro3.titulo = "el despertar";
        Libro3.autor = "miguel mestal";
        Libro3.paginas = 200;
        Libro3.revisar();

        System.out.println(" el libro " + Libro3.titulo + " tiene " + Libro3.paginas + " paginas ");

    }
}
