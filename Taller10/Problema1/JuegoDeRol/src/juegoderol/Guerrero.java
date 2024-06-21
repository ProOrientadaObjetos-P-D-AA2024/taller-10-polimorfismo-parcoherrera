package juegoderol;

public class Guerrero extends Personaje {

    public int puntosAtaquePunios;
    public int puntosAtaquePatadas;
    public int puntosDefensaBrazos;
    public int puntosEsquivar;

    public Guerrero(int nivel) {
        super(nivel);
        nombre = "Guerrero";
    }

    @Override
    public void calcularPuntosAtaque1() {
        puntosAtaquePunios = nivel * 100;
    }

    @Override
    public void calcularPuntosAtaque2() {
        puntosAtaquePatadas = nivel * 150;
    }

    @Override
    public void calcularPuntosDefensa1() {
        puntosDefensaBrazos = nivel * 50;
    }

    @Override
    public void calcularPuntosDefensa2() {
        puntosEsquivar = nivel * 75;
    }

    @Override
    public void seleccionarAtaque() {
        System.out.println("[1] Ataque con puños");
        System.out.println("[2] Ataque con patadas");
        seleccionAtaque = entrada.nextInt();
    }

    @Override
    public void seleccionarDefensa() {
        System.out.println("[1] Defender con brazos");
        System.out.println("[2] Esquivar ataque");
        seleccionDefensa = entrada.nextInt();
    }

    @Override
    public void atacar() {
        switch (seleccionAtaque) {
            case 1:
                ataquePunios();
                break;
            case 2:
                ataquePatadas();
                break;
        }
    }

    @Override
    public void defender() {
        switch (seleccionDefensa) {
            case 1:
                defensaBrazos();
                break;
            case 2:
                esquivar();
                break;
        }
    }

    public void ataquePunios() {
        oponente.puntosVida -= puntosAtaquePunios;

    }

    public void ataquePatadas() {
        oponente.puntosVida -= puntosAtaquePunios;
    }

    public void defensaBrazos() {
        puntosVida += puntosDefensaBrazos;

    }

    public void esquivar() {
        puntosVida += puntosEsquivar;
    }

}
