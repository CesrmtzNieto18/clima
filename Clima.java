/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clima;

import java.util.Scanner;

public class Clima {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la temperatura actual en grados Celsius: ");
            double temperature = scanner.nextDouble();
            
           
            if (temperature <= 19) {
                System.out.println("El clima es muy frío tapate no manches.");
            } else if (temperature >= 20) {
                System.out.println("El clima es muy caliente lleva una sombrilla.");
            } 
        }
    }
}