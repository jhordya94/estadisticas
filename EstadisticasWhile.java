
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author usuario
 */
/**
*Bibliografia
*https://www.varsitytutors.com/hotmath/hotmath_help/spanish/topics/mean-median-mode#:~:text=La%20mediana%20de%20un%20conjunto%20de%20n%C3%BAmeros%20es%20el%20n%C3%BAmero,de%20los%20dos%20n%C3%BAmeros%20medios.
*/
public class EstadisticasWhile {

    public static void main(String[] args) {
        int[] numeros = {11, 2, 3, 3};
        System.out.println("La media es: " + media(numeros));
        System.out.println("La mediana es: " + mediana(numeros));
        System.out.println("La moda es: " + moda(numeros));
    }

//METODOS PARA MEDIA, MEDIANA Y MODA 
    
//Calcula la media de los elementos en el arreglo "numeros"
    public static double media(int[] numeros) {
        double suma = 0;
        int i = 0;
        while (i < numeros.length) {
            suma += numeros[i];
            i++;
        }
        return suma / numeros.length;
    }

//Calcula la mediana de los elementos en el arreglo "numeros"
    public static double mediana(int[] numeros) {
        Arrays.sort(numeros);
        double mediana;
        if (numeros.length % 2 == 0) {
//Si el tamaño del arreglo es par, la mediana es la media de los dos números centrales
            mediana = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
        } else {
//Si el tamaño del arreglo es impar, la mediana es el número central
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }

//Calcula la moda de los elementos en el arreglo "numeros"
    public static int moda(int[] numeros) {
        int maxValor = 0;
        int maxConteo = 0;
        int i = 0;
        while (i < numeros.length) {
            int conteo = 0;
            int j = 0;
            while (j < numeros.length) {
                if (numeros[j] == numeros[i]) {
//Si encontramos un número igual, aumentamos el conteo
                    conteo++;
                }
                j++;
            }
            if (conteo > maxConteo) {
//Actualizamos el valor máximo y el conteo máximo si encontramos una moda más alta
                maxConteo = conteo;
                maxValor = numeros[i];
            }
            i++;
        }
        return maxValor;
    }
}
