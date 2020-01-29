package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;


public class Menu {
    LocalDate todaysDate;
    ArrayList<Object> menuUpdate;
    LocalDate lastUpdate;

    public Menu(){
        this.todaysDate = LocalDate.now();
        this.lastUpdate = null;
        this.menuUpdate = new ArrayList<Object>();
    }
    public LocalDate getTodaysDate(){
        return this.todaysDate;
    }

    public LocalDate getLastUpdate() {
        return this.lastUpdate;
    }

    public void setTodaysDate(LocalDate todaysDate){
        this.todaysDate = todaysDate;
    }
    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void  addItem(MenuItem food){
        this.menuUpdate.add(food);
        this.lastUpdate = java.time.LocalDate.now();
    }


    public static void main(String[] args) {

        MenuItem clamStrips = new MenuItem("Clam Strips", "appetizer", "breaded and served with comeback sauce", 8.50);
        MenuItem porkSteak = new MenuItem("Pork Steak", "entree", "BBQd and served with potato salad", 12.50);
        MenuItem carrotCake = new MenuItem("Carrot Cake", "dessert", "served with fresh fruit", 7.25);
        MenuItem salmon = new MenuItem("Tuscan Salmon", "entree", "three filets atop olives, onions, tomatoes and a citrus butter sauce", 18.50);

        Menu menu = new Menu();

        menu.addItem(clamStrips);
        menu.addItem(porkSteak);
        menu.addItem(carrotCake);
        menu.addItem(salmon);

        System.out.println(menu);
    }

    @Override
    public String toString() {
        return "\t\t***Menu***" +
                "\n" + menuUpdate +
                "\nlast updated: " + lastUpdate;
    }
}
