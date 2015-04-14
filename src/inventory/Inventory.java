package inventory;

public class Inventory {

    public static void main(String[] args) {
        
        Products prod = new Products();
        prod.initialize();
        Menu menu = new Menu();
        menu.menu();
    }
    
}
