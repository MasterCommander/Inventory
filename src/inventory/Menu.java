package inventory;

import java.util.Scanner;

public class Menu {
    Scanner userInput = new Scanner(System.in);
    public String name;
    Products prod = new Products();
            
    public void menu(){

        int value = 0;
        do{
            System.out.println("\nPick a menu option:"
                    + "\n1. Add a product\n2. Change a product\n3. Exit");
            value = userInput.nextInt();
            switch(value){
                case 1:
                    newProduct();
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(value != 3);
    }
    
    public void newProduct(){
        System.out.println("Enter a product name: ");
        name = userInput.next();
        prod.setName(name);
    }
    
}