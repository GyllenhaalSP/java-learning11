package ProgramasPruebas;

import java.util.Arrays;

import static ProgramasPruebas.metodos.cargarArray;
import static ProgramasPruebas.metodos.mostrarArray;

public class QuickChecking {
    public static void main(String[] args) {
        Object[] array = new Object[10];
        Object[][] multiArray = new Object[10][10];
        Object[] arrayChars = new Object[10];

        cargarArray(array, 10, "int");
        cargarArray(multiArray, 10, "int");
        cargarArray(arrayChars, 10, "double");


        mostrarArray("Array: ", array);
        mostrarArray("MultiArray: ", multiArray);
        mostrarArray("ArrayChars: ", arrayChars);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(multiArray));
    }
}
