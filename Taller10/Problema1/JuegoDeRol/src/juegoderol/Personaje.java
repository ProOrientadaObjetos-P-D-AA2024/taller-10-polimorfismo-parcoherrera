package juegoderol;

import java.util.Scanner;

public abstract class Personaje {

    Scanner entrada = new Scanner(System.in);

    public String nombre;
    public Personaje oponente;
    public int nivel;
    public int puntosVida;
    public int puntosVidaMax;
    public int puntosExperiencia;
    public int puntosExperienciaMax;
    public int seleccionAccion;
    public int seleccionAtaque;
    public int seleccionDefensa;

    public Personaje(int nivel) {
        this.nivel = nivel;
        this.puntosExperiencia = 0;
    }

    public void calcularPuntosVidaIniciales() {
        puntosVidaMax = nivel * 500;
        puntosVida = puntosVidaMax;
    }

    public void calcularPuntosExperienciaIniciales() {
        puntosExperienciaMax = nivel * 100;
    }
    
    public abstract void atacar();

    public abstract void defender();

    public abstract void seleccionarAtaque();

    public abstract void seleccionarDefensa();
    
    public abstract void calcularPuntosAtaque1();

    public abstract void calcularPuntosAtaque2();

    public abstract void calcularPuntosDefensa1();

    public abstract void calcularPuntosDefensa2();


}
