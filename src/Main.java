import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a mi programa");
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        Gato g1 = new Gato();
        g1.nombre = nombre;
        System.out.println("el nombre del gato es: " + g1.nombre);

        int ww = 1;
        System.out.println(ww++);
        System.out.println(++ww);

        Gato gato = new Gato();



        int t = 60;
        int u = 50;
        System.out.println("t=" + t + ",u=" + u + " == " + (t + u));

        Perro pp = new Perro();
        pp.nombre = "felix";
        pp.saludaAlVecino("Stuardo");

        pp.numeroDePatas = 4;
        System.out.println(pp.obtenerNumeroDePatas());

        pp.numeroDePatas = 3;
        System.out.println(pp.obtenerNumeroDePatas());

        int suma = pp.sumar(5, 6);
        System.out.println("el resultado es: " + pp.sumar(5, 6));

        Perro pp2 = new Perro();
        System.out.println("perro pp: " + pp.raza);
        System.out.println("perro pp2: " + pp2.raza);

        String texto = "hola Mundo";

        pp2.raza = "chihuahua";
        System.out.println("perro pp2: " + pp2.raza);

        Perro p1 = new Perro();
        p1.nombre = "firulais";
        System.out.println(p1.nombre);

        System.out.println(p1.edad);

        Perro p3;
        System.out.println("hola");

        p3 = new Perro();

        int x = 5;
        boolean y = false;
        int w;
    }

    public void arrancaPorAca() {

    }

}