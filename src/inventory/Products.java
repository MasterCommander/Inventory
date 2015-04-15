package inventory;

import java.util.Scanner;

public class Products {
    int[] menu = new int[500];
    String[] menuItem = new String[500];
    String[][] ingred = new String[500][20];
    Scanner userInput = new Scanner(System.in);
    public String name;
    public void initialize(){
    for (int i = 0; i < menu.length; i++){
            menu[i] = 0;
            menuItem[i] = " ";
        }
    }

    public String getName(){
        return name;
}
    
    public void setName(String name){
        System.out.println("Enter a product name: ");
        name = userInput.nextLine();
        for (int i = 0; i < menu.length; i++){
        if (menu[i] == 0){
            menuItem[i] = name;
            menu[i] = i;
        System.out.println("Enter number of ingredients: ");
        ingredients = userInput.nextInt();
        for (int j = 0; j < ingredients; j++){
            System.out.println("Enter ingredient " + (j + 1) + ":");
            ingred[i][j] = userInput.next();
        }
        break;
        }
    }
    }
    public int ingredients;
    public void viewProduct(){
        System.out.println("Enter product to view: ");
        String view = " ";
        int var = 0;
        var = userInput.nextInt();
        for (int i = 0; i < ingredients; i++){
            System.out.println(menuItem[var] + "\nIngredient " + i + ": "
            + ingred[var][i]);
        }
        
    }
    
}