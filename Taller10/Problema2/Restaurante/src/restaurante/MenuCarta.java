package restaurante;

public class MenuCarta extends Menu {
    
    public double valorPocrionGuarnicion;
    public double valorBebida;
    public double porcentajeAdicionalServicio;

    public MenuCarta(String nombrePlato, double valorInicialMenu, double valorPocrionGuarnicion, double valorBebida, double porcentajeAdicionalServicio) {
        super(nombrePlato, valorInicialMenu);
        this.valorPocrionGuarnicion = valorPocrionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }
    

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu +valorPocrionGuarnicion+ valorBebida +((valorInicialMenu*porcentajeAdicionalServicio)/100);
    }
    
}
