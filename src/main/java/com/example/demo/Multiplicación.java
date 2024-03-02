public class Multiplicador {
    private int numero1;
    private int numero2;

    public Multiplicador(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 3;
        Multiplicador multiplicador = new Multiplicador(numero1, numero2);
        int resultado = multiplicador.multiplicar();
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}