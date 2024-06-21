package juegoderol;

public class Arquero extends Personaje {

    public int puntosLanzarFlechaNormal;
    public int puntosLanzarFlechaFuego;
    public int puntosUsarEscudo;
    public int puntosEsconderse;

    public Arquero(int nivel) {
        super(nivel);
        nombre = "Arquero";
    }

    @Override
    public void calcularPuntosAtaque1() {
        puntosLanzarFlechaNormal = nivel * 100;
    }

    @Override
    public void calcularPuntosAtaque2() {
        puntosLanzarFlechaFuego = nivel * 150;
    }

    @Override
    public void calcularPuntosDefensa1() {
        puntosUsarEscudo = nivel * 50;
    }

    @Override
    public void calcularPuntosDefensa2() {
        puntosEsconderse = nivel * 75;
    }

    @Override
    public void seleccionarAtaque() {
        System.out.println("[1] Lanzar flecha normal");
        System.out.println("[2] Lanzar flecha de fuego");
        seleccionAtaque = entrada.nextInt();
    }

    @Override
    public void seleccionarDefensa() {
        System.out.println("[1] Usar escudo");
        System.out.println("[2] Esconderse");
        seleccionDefensa = entrada.nextInt();
    }

    @Override
    public void atacar() {
        switch (seleccionAtaque) {
            case 1:
                lanzarFlechaNormal();
                break;
            case 2:
                lanzarFlechaFuego();
                break;
        }
    }

    @Override
    public void defender() {
        switch (seleccionDefensa) {
            case 1:
                usarEscudo();
                break;
            case 2:
                esconderse();
                break;
        }
    }

    public void lanzarFlechaNormal() {
        oponente.puntosVida -= puntosLanzarFlechaNormal;
    }

    public void lanzarFlechaFuego() {
        oponente.puntosVida -= puntosLanzarFlechaFuego;
    }

    public void usarEscudo() {
        puntosVida += puntosUsarEscudo;
    }

    public void esconderse() {
        puntosVida += puntosEsconderse;
    }

}
