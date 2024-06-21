package restaurante;

public class Ejecutor002 {
    
    public static void main(String[] args) {
        
        Menu[] menu = new Menu[5];
        
        menu[0] = new MenuNinios("Nuggets de Pollo", 2.50, 1, 1.25);
        menu[1] = new MenuNinios("Hamburguesa", 3.00, 1.5, 0.75);
        menu[2] = new MenuEconomico("Guatita", 3,10);
        menu[3] = new MenuDia("Seco de Pollo", 3,0.5,0.75);
        menu[4] = new MenuCarta("Costillas de cerdo", 5, 1.25,1.50,15);
        
        menu[0].calcularValorMenu();
        menu[1].calcularValorMenu();
        menu[2].calcularValorMenu();
        menu[3].calcularValorMenu();
        menu[4].calcularValorMenu();
        
        Cuenta cuenta = new Cuenta("Wayner Bustamante", menu, 15);
        cuenta.calcularSubtotal();
        cuenta.calcularTotal();
        System.out.println(cuenta.toString());
        
    }
    
}
