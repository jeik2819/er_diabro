import java.util.Scanner;
    public static boolean er_diabro(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (er_diabro(numero)) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }

        scanner.close();
    }
    
    // commit epico