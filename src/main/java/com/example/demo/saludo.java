public class Saludo {
    private String nombreUsuario;

    public Saludo(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void saludar() {
        System.out.println("Hola, " + nombreUsuario + "! Bienvenido.");
    }

    public static void main(String[] args) {
        Saludo saludo = new Saludo("Usuario");
        saludo.saludar();
    }
}