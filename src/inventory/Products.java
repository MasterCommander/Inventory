package inventory;

import java.util.Scanner;

public class Products {
    int[] menu = new int[200];
    String[] menuItem = new String[200];
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
        for (int i = 0; i < menu.length; i++){
        if (menuItem[i] == " "){
            menuItem[i] = name;
                    System.out.println(menuItem[i]);
            break;
        }
    }
        getName();
    }
}