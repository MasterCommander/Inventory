package inventory;

public class Products {
    int[] menu = new int[200];
    String[] menuItem = new String[200];
    public String name = "banana";
    public void initialize(){
    for (int i = 0; i < menu.length; i++){
            menu[i] = 0;
            menuItem[i] = " ";
        }
    }

    public void getName(String name){
        for (int i = 0; i < menu.length; i++){
        if (menuItem[i] == " "){
            menuItem[i] = name;
        }
    }
            menuItem[5] = "banana";
        System.out.println(menuItem[5]);
}
}