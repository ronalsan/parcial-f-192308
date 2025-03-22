import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String nombre = scanner.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int productos = scanner.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double valor1 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double valor2 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double valor3 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double valor4 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double valor5 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double valor6 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double valor7 = scanner.nextDouble();

        double valor = 0;

        if (valor1 >= 100000) {
            valor = valor + (valor1 * 0.10);
        } else {
            valor = valor + (valor1 * 0.05);
        }

        if (valor2 >= 100000) {
            valor = valor1 + (valor2 * 0.10);
        } else {
            valor = valor1 + (valor2 * 0.05);
        }

        if (valor3 >= 100000) {
            valor = valor + (valor3 * 0.10);
        } else {
            valor = valor + (valor3 * 0.05);
        }

        if (valor4 >= 100000) {
            valor = valor + (valor4 * 0.10);
        } else {
            valor = valor + (valor4 * 0.05);
        }

        if (valor5 >= 100000) {
            valor = valor + (valor5 * 0.10);
        } else {
            valor = valor + (valor5 * 0.05);
        }

        if (valor6 >= 100000) {
            valor = valor + (valor6 * 0.10);
        } else {
            valor = valor + (valor6 * 0.05);
        }

        if (valor7 >= 100000) {
            valor = valor + (valor7 * 0.10);
        } else {
            valor = valor + (valor7 * 0.05);
        }

        double totalventas = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7;
        double salariototal = (double) (valor + 1000000);

        System.out.println("Vendedor: " + nombre);
        System.out.println("Total ventas: " + (int) totalventas);
        System.out.println("Comisiones: " + (int) valor);
        System.out.println("Salario total: " + (int) salariototal);
    }
    
}
