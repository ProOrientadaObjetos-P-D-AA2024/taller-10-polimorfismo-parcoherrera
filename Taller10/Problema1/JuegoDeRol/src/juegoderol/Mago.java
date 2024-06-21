package juegoderol;

public class Mago extends Personaje {

    public int puntosAtaqueHechizo;
    public int puntosAtaqueLevitacion;
    public int puntosCampoFuerza;
    public int puntosInvisibilidad;

    public Mago(int nivel) {
        super(nivel);
        nombre = "Mago";
    }

    @Override
    public void calcularPuntosAtaque1() {
        puntosAtaqueHechizo = nivel * 100;
    }

    @Override
    public void calcularPuntosAtaque2() {
        puntosAtaqueLevitacion = nivel * 150;
    }

    @Override
    public void calcularPuntosDefensa1() {
        puntosCampoFuerza = nivel * 50;
    }

    @Override
    public void calcularPuntosDefensa2() {
        puntosInvisibilidad = nivel * 75;
    }

    @Override
    public void seleccionarAtaque() {
        System.out.println("[1] Ataque con hechizo");
        System.out.println("[2] Ataque con levitación");
        seleccionAtaque = entrada.nextInt();
    }

    @Override
    public void seleccionarDefensa() {
        System.out.println("[1] Defender con campo de fuerza");
        System.out.println("[2] Defender con invisivilidad");
        seleccionDefensa = entrada.nextInt();
    }

    @Override
    public void atacar() {
        switch (seleccionAtaque) {
            case 1:
                ataqueHechizo();
                break;
            case 2:
                ataqueLevitacion();
                break;
        }
    }

    @Override
    public void defender() {
        switch (seleccionDefensa) {
            case 1:
                campoFuerza();
                break;
            case 2:
                invisibilidad();
                break;
        }
    }

    public void ataqueHechizo() {
        oponente.puntosVida -= puntosAtaqueHechizo;
    }

    public void ataqueLevitacion() {
        oponente.puntosVida -= puntosAtaqueLevitacion;
    }

    public void campoFuerza() {
        puntosVida += puntosCampoFuerza;
    }

    public void invisibilidad() {
        puntosVida += puntosInvisibilidad;
    }

}
