package restaurante;

public abstract class Menu {
    
    public String nombrePlato;
    public double valorInicialMenu;
    public double valorMenu;
    

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }
    
    public abstract void calcularValorMenu();
    
}
