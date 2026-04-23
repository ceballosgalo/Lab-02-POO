public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Juan", "12345", 0.02, 1000);
        Cuenta cuenta2 = new Cuenta("Ana", "67890", 0.02, 500);

        // Ingreso
        cuenta1.ingreso(200);

        // Extracción
        cuenta1.extraccion(150);

        // Transferencia
        boolean ok = cuenta1.transferencia(cuenta2, 300);

        System.out.println("Transferencia realizada: " + ok);

        System.out.println("Saldo cuenta1: " + cuenta1.getSaldo());
        System.out.println("Saldo cuenta2: " + cuenta2.getSaldo());
    }
}