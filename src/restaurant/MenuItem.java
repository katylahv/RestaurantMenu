package restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.itemPrice, itemPrice) == 0 &&
                dateAdded == menuItem.dateAdded &&
                isNew == menuItem.isNew &&
                Objects.equals(itemName, menuItem.itemName) &&
                Objects.equals(itemCategory, menuItem.itemCategory) &&
                Objects.equals(itemDescription, menuItem.itemDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemName, itemCategory, itemPrice, itemDescription, dateAdded, isNew);
    }
}
