package juegoderol;

import java.util.Scanner;

public class JuegoDeRol {

    public static void main(String[] args) {

        Metodos obj = new Metodos();
        Scanner entrada = new Scanner(System.in);
        
        // Combate Guerrero vs. Mago
        Personaje personaje1 = new Guerrero(10);
        Personaje personaje2 = new Mago(5);
        Personaje ganador;
        int n;
        obj.inicializarPersonaje(personaje1);
        
        /*
        El combate esta pensado para que el personaje 1 sea el principal y el
        personaje 2 sea a quien hay que vencer. Cuando se derrote a personaje 2
        da la opcion de continuar y el personaje 1 se reinicializa con los puntos
        de experiencia aumentados y el personaje 2 se reinicializa con sus valores
        por defecto.
        */
        
        do {
            obj.inicializarPersonaje(personaje2);
            obj.empezarCombate(personaje1, personaje2);
            while (personaje1.puntosVida > 0 && personaje2.puntosVida > 0) {
                obj.turnoPersonajes();
            }
            ganador = obj.obtenerGanador();
            ganador = obj.ganarExperiencia(ganador);
            ganador = obj.subirNivel(ganador);
            personaje1 = ganador;
            System.out.println("¿Desea continuar jugando?");
            System.out.println("[1] Sí");
            System.out.println("[2] No");
            n = entrada.nextInt();
        } while (n == 1);

    }

}
