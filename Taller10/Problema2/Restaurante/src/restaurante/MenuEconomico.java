package restaurante;

public class MenuEconomico extends Menu {

    public double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu, double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu - ((valorInicialMenu * porcentajeDescuento) / 100);
    }

}
