
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
public class EstadisticasDoWhile {

    public static void main(String[] args) {
        int[] numeros = {11, 2, 3, 20, 3};
        System.out.println("La media es: " + media(numeros));
        System.out.println("La mediana es: " + mediana(numeros));
        System.out.println("La moda es: " + moda(numeros));
    }

//METODOS PARA MEDIA, MEDIANA Y MODA 
    
//Calcula la media de los elementos en el arreglo "numeros"
    public static double media(int[] numeros) {
        int i = 0;
        double suma = 0;
//Ciclo que recorre todos los elementos en el arreglo y los suma
        do {
            suma += numeros[i];
            i++;
        } while (i < numeros.length);
//Retorna el resultado de la suma dividido entre la cantidad de elementos en el arreglo
        return suma / numeros.length;
    }

//Calcula la mediana de los elementos en el arreglo "numeros"
    public static double mediana(int[] numeros) {
//Ordena los elementos en el arreglo en orden creciente
        Arrays.sort(numeros);
        double mediana;
//Dependiendo de si el arreglo tiene una cantidad par o impar de elementos, se calcula la mediana de manera diferente
        if (numeros.length % 2 == 0) {
            mediana = (numeros[numeros.length / 2 - 1] + numeros[numeros.length / 2]) / 2.0;
        } else {
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }

//Calcula la moda de los elementos en el arreglo "numeros"
    public static int moda(int[] numeros) {
        int maxValor = 0;
        int maxConteo = 0;
        int i = 0;
//Ciclo que recorre todos los elementos en el arreglo
        do {
            int conteo = 0;
            int j = 0;
//Ciclo interno que cuenta cuantas veces aparece el elemento actual en el arreglo
            do {
                if (numeros[j] == numeros[i]) {
                    conteo++;
                }
                j++;
            } while (j < numeros.length);
//Si el conteo actual es mayor al conteo máximo, actualiza el conteo máximo y el valor máximo
            if (conteo > maxConteo) {
                maxConteo = conteo;
                maxValor = numeros[i];
            }
            i++;
        } while (i < numeros.length);
//Retorna el valor máximo
        return maxValor;
    }
}
