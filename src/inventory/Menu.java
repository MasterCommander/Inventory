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
                    + "\n1. Add a product\n2. View a product\n3. Change a product\n4. Exit");
            value = userInput.nextInt();
            switch(value){
                case 1:
                    prod.setName(name);
                    break;
                case 2:
                    prod.viewProduct();
                    break;
                case 3:
                    prod.changeProduct();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(value != 4);
    }
    
    public String changeProduct(){
        do{
            System.out.println("Please enter item to change: ")
            int pro = userInput.nextInt();
            System.out.println("Please choose what to change: \n1. Change name\n2. Change ingredients\n3. "
            + "Change recipe\n4. Remove item\n5. Return to previous menu")
            value = userInput.nextInt();
            switch(value){
                case 1:
                    prod.changeName(pro);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please select a valid option")
                    changeProduct();
            }
        }while(value != 5);
        return name;
    }
    
    
    
}
