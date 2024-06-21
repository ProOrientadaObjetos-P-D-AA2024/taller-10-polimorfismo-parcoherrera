package restaurante;

public class MenuNinios extends Menu {
    
    public double valorPorcionHelado;
    public double valorPorcionPastel;

    public MenuNinios(String nombrePlato, double valorInicialMenu, double valorPorcionHelado, double valorPorcionPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }
    
}
