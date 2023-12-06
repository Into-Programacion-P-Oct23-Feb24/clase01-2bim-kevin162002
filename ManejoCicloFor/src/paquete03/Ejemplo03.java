/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite = entrada.nextInt();
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String mensajeFinal = "";
        
        
        for (int i = 1; i < 10; i++) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            mensajeFinal = String.format("%s%s%s%s edad%s estatura %.2f"
                    ,mensajeFinal,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
        }
        System.out.printf("%s\n", mensajeFinal);
    }
}
