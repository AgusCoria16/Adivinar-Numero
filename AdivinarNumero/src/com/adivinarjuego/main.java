package com.adivinarjuego;

import java.util.Random;
import java.util.Scanner;

/**
 * Esta clase representa el juego de adivinar un número.
 * El usuario intenta adivinar un número aleatorio generado por el programa
 * dentro de un rango específico en un número determinado de intentos.
 */

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        // Bucle principal del juego
        while (playAgain) {
            System.out.println("Bienvenido al juego de adivinar el número.");
            System.out.print("Ingrese el rango máximo para el número aleatorio: ");
            int maxRange = scanner.nextInt();
            int randomNumber = random.nextInt(maxRange) + 1;
            int attempts = 5;
            boolean hasWon = false;

            System.out.println("He generado un número entre 1 y " + maxRange + ". Tienes " + attempts + " intentos para adivinarlo.");
            
         // Bucle para los intentos del usuario
            for (int i = 0; i < attempts; i++) {
                System.out.print("Intento " + (i + 1) + ": ");
                int guess = scanner.nextInt();
                
                if (guess == randomNumber) {
                    hasWon = true;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Demasiado bajo.");
                } else {
                    System.out.println("Demasiado alto.");
                }
            }
            
            // Mensaje de resultado
            if (hasWon) {
                System.out.println("¡¡¡Felicidades!!! Has adivinado el número correctamente.");
            } else {
                System.out.println("Lo siento, has agotado tus intentos. El número era " + randomNumber);
            }
            // Pregunta si el usuario quiere jugar de nuevo
            System.out.print("¿Quieres jugar de nuevo? (sí/no): ");
            scanner.nextLine();
            playAgain = scanner.next().trim().equalsIgnoreCase("si");

        }

        System.out.println("Gracias por jugar. ¡¡¡Hasta la próxima!!!");
        scanner.close();
    }
}