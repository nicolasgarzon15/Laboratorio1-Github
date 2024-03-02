public class Divisor {
    private double numero1;
    private double numero2;

    public Divisor(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double dividir() {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }
    public static void main(String[] args) {
        double numero1 = 10;
        double numero2 = 2;
        Divisor divisor = new Divisor(numero1, numero2);
        double resultado = divisor.dividir();
        System.out.println("El resultado de la división es: " + resultado);
    }
}