import java.util.*;
class ItemList
{
    int itemID;
    String itemName;
    float price;
    int quantity;
    ItemList(int a, String b, float c, int d)
    {
        this.itemID = a;
        this.itemName = b;
        this.price = c;
        this.quantity = d;
    }
    void display()
    {
        System.out.format(" %-10s %-10s %.2f %10s\n"
                ,itemID,itemName,price,quantity);
    }
}
