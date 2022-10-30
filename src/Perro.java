public class Perro {
    String nombre;
    String raza = "pitbull";
    int edad;
    boolean tieneCola;
    int numeroDePatas;

    void saludaAlVecino(String nombre){
        System.out.println("hola soy: " + this.nombre + " wau wau: " + nombre);
    }

    void irAlParque() {
        System.out.println("estoy feliz!!!");
    }

    int obtenerNumeroDePatas() {
        return numeroDePatas;
    }

    int sumar(int x, int y) {
        return x + y;
    }

    int sumarForma2(int x, int y) {
        int suma = x + y;
        return suma;
    }

}

