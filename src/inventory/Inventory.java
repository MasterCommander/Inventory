package inventory;

public class Inventory {

    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.setDefaultCloseOperation(0);
        screen.setVisible(true);
        Products prod = new Products();
        prod.initialize();
        screen.initialize();
        Menu menu = new Menu();
        //menu.menu();
        
        
    }
    
}
