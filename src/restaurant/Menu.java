package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;


public class Menu {
    LocalDate todaysDate;
    ArrayList<Object> menuUpdate;
    LocalDate lastUpdate;

    public Menu(){
        this.todaysDate = LocalDate.now();
        this.lastUpdate = null;
        this.menuUpdate = new ArrayList<Object>();
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

        menu.displayOne(salmon);

        menu.removeItem(carrotCake);
        System.out.println(menu);

    } // end main

    public LocalDate getLastUpdate() {
        return this.lastUpdate;
    }

    public void setTodaysDate(LocalDate todaysDate){
        this.todaysDate = todaysDate;
    }
    public void setLastUpdate(LocalDate lastUpdate) {

        this.lastUpdate = lastUpdate;
    }

    public void displayOne(Object food){
        for (Object items : this.menuUpdate){
            if (items.equals(food)){
                System.out.println(items);
            }
        }
    }

    public void  addItem(MenuItem food){
        this.menuUpdate.add(food);
        this.lastUpdate = java.time.LocalDate.now();
    }

    public void removeItem(Object removeItem){
        for (Object foodObject : this.menuUpdate){
            if (foodObject.equals(removeItem)){
                this.menuUpdate.remove(foodObject);
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(menuUpdate, menu.menuUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuUpdate);
    }

    @Override
    public String toString() {
        return "\t\t***Menu***" +
                "\n" + menuUpdate +
                "\nlast updated: " + lastUpdate;
    }
}
