package restaurante;

public class Cuenta {

    public String nombreCliente;
    public Menu[] menu;
    public double valorSubTotal;
    public int iva;
    public double valorTotal;

    public Cuenta(String nombreCliente, Menu[] menu, int iva) {
        this.nombreCliente = nombreCliente;
        this.menu = menu;
        this.valorSubTotal = 0;
        this.iva = iva;
        this.valorTotal = 0;
    }

    public void calcularSubtotal() {
        for (int i = 0; i < menu.length; i++) {
            valorSubTotal += menu[i].valorMenu;
        }
        //System.out.println("Cuenta Subtotal: $" + valorSubTotal);
    }

    public void calcularTotal() {
        valorTotal = valorSubTotal + ((valorSubTotal * iva) / 100);
    }
    
    @Override
    public String toString(){
        return "-----Informacion de la cuenta-----"
                + "\nNombre del cliente: " +nombreCliente
                + "\nPedido 1: Menú infantil" 
                + "\nTotal pedido "+menu[0].nombrePlato +": $"+menu[0].valorMenu
                + "\nPedido 2: Menú infantil" 
                + "\nTotal pedido "+menu[1].nombrePlato +": $"+menu[1].valorMenu
                + "\nPedido 3: Menú infantil" 
                + "\nTotal pedido "+menu[2].nombrePlato +": $"+menu[2].valorMenu
                + "\nPedido 4: Menú infantil" 
                + "\nTotal pedido "+menu[3].nombrePlato +": $"+menu[3].valorMenu
                + "\nPedido 5: Menú infantil" 
                + "\nTotal pedido "+menu[4].nombrePlato +": $"+menu[4].valorMenu
                + "\nCuenta Subtotal: $" +valorSubTotal
                + "\nIVA: " +iva +"%"
                + "\nCuenta Total: $" +valorTotal;
    }
    
    

}
