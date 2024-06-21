package restaurante;

public class MenuDia extends Menu {
    
    public double valorPostre;
    public double valorbebida;

    public MenuDia(String nombrePlato, double valorInicialMenu, double valorPostre, double valorbebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorbebida = valorbebida;
    }
    
    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicialMenu + valorPostre + valorbebida;
    }
    
}
