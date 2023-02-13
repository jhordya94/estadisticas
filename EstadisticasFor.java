
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
 * Bibliografia
 * https://www.varsitytutors.com/hotmath/hotmath_help/spanish/topics/mean-median-mode#:~:text=La%20mediana%20de%20un%20conjunto%20de%20n%C3%BAmeros%20es%20el%20n%C3%BAmero,de%20los%20dos%20n%C3%BAmeros%20medios.
 */
public class EstadisticasFor {

    public static void main(String[] args) {
        int[] numeros = {11, 4, 4, 4, 4};
        System.out.println("La media es: " + media(numeros));
        System.out.println("La mediana es: " + mediana(numeros));
        System.out.println("La moda es: " + moda(numeros));
    }

    //Calcula la media de los elementos en el arreglo "numeros"
    public static double media(int[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    //METODOS PARA MEDIA, MEDIANA Y MODA 
    
    //Calcula la mediana de los elementos en el arreglo "numeros"
    public static double mediana(int[] numeros) {
        Arrays.sort(numeros);
        double mediana;
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
        for (int i = 0; i < numeros.length; ++i) {
            int conteo = 0;
            for (int j = 0; j < numeros.length; ++j) {
                if (numeros[j] == numeros[i]) {
                    ++conteo;
                }
            }
            if (conteo > maxConteo) {
                maxConteo = conteo;
                maxValor = numeros[i];
            }
        }
        return maxValor;
    }
}
