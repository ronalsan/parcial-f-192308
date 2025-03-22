import java.util.Scanner;

public class Logica {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sueldoequilibrio = 0;
        int sueldoVIP = 0;
        double totalsueldo = 0;
        

        for (int i = 1; i <= 10; i++) {
            double sueldo = -1; 
            while (sueldo <= 0) {
                System.out.print("Introduce el sueldo del empleado " + i + ": ");
                sueldo = input.nextDouble();
                if (sueldo <= 0) {
                    System.out.println("error al copiar el sueldo,Debe ser mayor que 0.");
                }
            }
           totalsueldo += sueldo;
            if (sueldo >= 100 && sueldo <= 300) {
                sueldoequilibrio++;
            } else if (sueldo > 300) {
                sueldoVIP++;
            }
        }
        
        System.out.println("Reporte final:");
        System.out.println("Número de sueldos en el rango de la justicia  " + sueldoequilibrio);
        System.out.println("Número de sueldos VIP  " + sueldoVIP);
        System.out.printf("Total acumulado de sueldos: ", (float) totalsueldo);
       
        input.close();
}}
