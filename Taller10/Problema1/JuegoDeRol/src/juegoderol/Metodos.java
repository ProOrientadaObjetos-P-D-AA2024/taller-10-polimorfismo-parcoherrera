package juegoderol;

import java.util.Scanner;

public class Metodos {

    public Personaje pActual;

    public int n;
    Scanner entrada = new Scanner(System.in);

    public void inicializarPersonaje(Personaje p) {
        p.calcularPuntosVidaIniciales();
        p.calcularPuntosExperienciaIniciales();
        p.calcularPuntosAtaque1();
        p.calcularPuntosAtaque2();
        p.calcularPuntosDefensa1();
        p.calcularPuntosDefensa2();
    }

    public void empezarCombate(Personaje p1, Personaje p2) {
        pActual = p1;
        pActual.oponente = p2;
        pActual.oponente.oponente = p1;
        System.out.println("-------------------COMBATE-------------------");
        System.out.println(pActual.nombre + " Nivel " + pActual.nivel + " vs. " + pActual.oponente.nombre + " Nivel " + pActual.oponente.nivel);
        System.out.println("[Enter] Continuar");
        entrada.nextLine();
        //verificarPersonajes();
        //turnoPersonaje();
    }

    public void turnoPersonajes() {
        System.out.println("TURNO: " + pActual.nombre + " Nivel " + pActual.nivel);
        System.out.println("Puntos de vida: " + pActual.puntosVida + "/" + pActual.puntosVidaMax);
        System.out.println("Seleccione una opción:");
        System.out.println("[1] Atacar");
        System.out.println("[2] Defender");
        pActual.seleccionAccion = entrada.nextInt();
        switch (pActual.seleccionAccion) {
            case 1:
                pActual.seleccionarAtaque();
                break;
            case 2:
                pActual.seleccionarDefensa();
                break;
        }

        System.out.println("TURNO: " + pActual.oponente.nombre + " Nivel " + pActual.oponente.nivel);
        System.out.println("Puntos de vida: " + pActual.oponente.puntosVida + "/" + pActual.oponente.puntosVidaMax);
        System.out.println("Seleccione una opción:");
        System.out.println("[1] Atacar");
        System.out.println("[2] Defender");
        pActual.oponente.seleccionAccion = entrada.nextInt();
        switch (pActual.oponente.seleccionAccion) {
            case 1:
                pActual.oponente.seleccionarAtaque();
                break;
            case 2:
                pActual.oponente.seleccionarDefensa();
                break;
        }

        if (pActual.seleccionAccion == 1 && pActual.oponente.seleccionAccion == 1) {
            pActual.atacar();
            pActual.oponente.atacar();
            System.out.println("Los dos jugadores atacaron.");
            imprimirPuntosVida(pActual);
            imprimirPuntosVida(pActual.oponente);

        } else if (pActual.seleccionAccion == 2 && pActual.oponente.seleccionAccion == 1) {
            pActual.defender();
            pActual.oponente.atacar();
            System.out.println("El " + pActual.oponente.nombre + " atacó y el " + pActual.nombre + " se defendió.");
            imprimirPuntosVida(pActual);
            imprimirPuntosVida(pActual.oponente);

        } else if (pActual.seleccionAccion == 1 && pActual.oponente.seleccionAccion == 2) {
            pActual.atacar();
            pActual.oponente.defender();
            System.out.println("El " + pActual.nombre + " atacó y el " + pActual.oponente.nombre + " se defendió.");
            imprimirPuntosVida(pActual);
            imprimirPuntosVida(pActual.oponente);

        } else if (pActual.seleccionAccion == 2 && pActual.oponente.seleccionAccion == 2) {
            System.out.println("Los dos jugadores se defendieron.");
            imprimirPuntosVida(pActual);
            imprimirPuntosVida(pActual.oponente);
        }
        System.out.println("[Enter] Continuar");
        entrada.nextLine();
        entrada.nextLine();

    }

    public void imprimirPuntosVida(Personaje p) {
        System.out.println(p.nombre + ". Puntos de vida: " + p.puntosVida + "/" + p.puntosVidaMax);
    }

    public void reiniciarPuntosVida() {
        pActual.puntosVida = pActual.puntosVidaMax;
        pActual.oponente.puntosVida = pActual.oponente.puntosVidaMax;
    }

    public Personaje obtenerGanador() {
        if (pActual.puntosVida < 1) {
            System.out.println("El ganador es " + pActual.oponente.nombre + " Nivel " + pActual.oponente.nivel);
            reiniciarPuntosVida();
            return pActual.oponente;
        } else if (pActual.oponente.puntosVida < 1) {
            System.out.println("El ganador es " + pActual.nombre + " Nivel " + pActual.nivel);
            reiniciarPuntosVida();
            return pActual;
        } else if (pActual.puntosVida < 1 && pActual.oponente.puntosVida < 1) {
            System.out.println("Ambos jugadores murieron");
            reiniciarPuntosVida();
        }
        return null;
    }

    public Personaje ganarExperiencia(Personaje p) {
        p.puntosExperiencia += p.oponente.nivel * 50;
        System.out.println("Puntos de experiencia: " + p.puntosExperiencia + "/" + p.puntosExperienciaMax);
        return p;
    }

    public Personaje subirNivel(Personaje p) {
        if (p.puntosExperiencia > p.puntosExperienciaMax) {
            p.nivel++;
            p.puntosExperiencia -= p.puntosExperienciaMax;
            System.out.println("El " + p.nombre + " subió al nivel " + p.nivel);
            inicializarPersonaje(p);
            System.out.println("Puntos de vida: " + p.puntosVida + "/" + p.puntosVidaMax);
            System.out.println("Puntos de experiencia: " + p.puntosExperiencia + "/" + p.puntosExperienciaMax);
            return p;
        } else {
            return p;
        }
    }

}
