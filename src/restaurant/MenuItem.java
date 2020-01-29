package restaurant;

import java.util.Calendar;
import java.util.Date;

public class MenuItem {
    private String itemName;
    private String itemCategory;
    private double itemPrice;
    private String itemDescription;
    private int dateAdded;
    private boolean isNew;

    public MenuItem(String itemName,String itemCategory,String itemDescription,double itemPrice){
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.dateAdded = dateAdded;
    }

    public void setDateAdded() {
        this.dateAdded = Calendar.DATE;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return this.itemPrice;
    }

    public String getItemCategory() {
        return this.itemCategory;
    }

    public String getItemDescription() {
        return this.itemDescription;
    }

    public String getItemName() {
        return this.itemName;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        return  "\n" + itemName + ": \n"  + itemCategory +
                "\n *" + itemDescription + '\n'
                + "Price: $" + itemPrice + "\n";
    }
}
