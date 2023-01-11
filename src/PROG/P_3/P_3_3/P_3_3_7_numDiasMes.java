package PROG.P_3.P_3_3;

import java.util.Scanner;

public class P_3_3_7_numDiasMes {
//    Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que
//    tiene el mes correspondiente.
    public static void main(String[] args) {
        int num;
        char ch;
        Scanner sc = new Scanner(System.in);
        do {
            do {
                System.out.print("Introduce un número del 1 al 12: ");
                num = sc.nextInt();
            } while (0 < num & num > 12);
            switch (num) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes tiene 31 días.\n");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes tiene 30 días.\n");
                    break;
                default:
                    System.out.println("El mes tiene 28 días o 29 días si el año es bisiesto.\n");
                    break;
            }
            System.out.print("'S' para salir, 'C' para continuar: ");
            ch = sc.next().charAt(0);
            System.out.println();
        }while(!"s".equalsIgnoreCase(Character.toString(ch)));
        System.out.println("Ciao!");
    }
}
