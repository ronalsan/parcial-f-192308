import java.util.Scanner;

public class ReMal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String a = s.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int p = s.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double x1 = s.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double x2 = s.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double x3 = s.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double x4 = s.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double x5 = s.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double x6 = s.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double x7 = s.nextDouble();

        double s1 = 0;

        if (x1 >= 100000) {
            s1 = s1 + (x1 * 0.10);
        } else {
            s1 = s1 + (x1 * 0.05);
        }

        if (x2 >= 100000) {
            s1 = s1 + (x2 * 0.10);
        } else {
            s1 = s1 + (x2 * 0.05);
        }

        if (x3 >= 100000) {
            s1 = s1 + (x3 * 0.10);
        } else {
            s1 = s1 + (x3 * 0.05);
        }

        if (x4 >= 100000) {
            s1 = s1 + (x4 * 0.10);
        } else {
            s1 = s1 + (x4 * 0.05);
        }

        if (x5 >= 100000) {
            s1 = s1 + (x5 * 0.10);
        } else {
            s1 = s1 + (x5 * 0.05);
        }

        if (x6 >= 100000) {
            s1 = s1 + (x6 * 0.10);
        } else {
            s1 = s1 + (x6 * 0.05);
        }

        if (x7 >= 100000) {
            s1 = s1 + (x7 * 0.10);
        } else {
            s1 = s1 + (x7 * 0.05);
        }

        double tt = x1 + x2 + x3 + x4 + x5 + x6 + x7;
        double ss = (double) (s1 + 1000000);

        System.out.println("Vendedor: " + a);
        System.out.println("Total ventas: " + (int) tt);
        System.out.println("Comisiones: " + (int) s1);
        System.out.println("Salario total: " + (int) ss);
    }
}
