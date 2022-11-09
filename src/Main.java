import java.util.*;

public class Main
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        ArrayList <ItemList> i = new ArrayList<ItemList>();
        i.add(new ItemList(1,"Milk",25.5f,40));
        i.add(new ItemList(2,"Bread",40,12));
        i.add(new ItemList(3,"Maggi",80,10));
        i.add(new ItemList(4,"Cadbury",120,5));
        i.add(new ItemList(5,"Eclairs",2.5f,90));
        i.add(new ItemList(6,"Butter",45,12));
        i.add(new ItemList(7,"Salt",12,30));
        i.add(new ItemList(8,"Pepper",30,15));
        i.add(new ItemList(9,"Toothbrush",30,10));
        i.add(new ItemList(10,"Biscuit",25,20));
        System.out.println("\nItem ID  \tItem Name  \tPrice \tQuantity");
        //Display the dummy iteams
        for(ItemList k : i)
        {
            k.display();
        }
        //taking the input from the user
        System.out.println("Enter number of orders");
        int order = sc.nextInt();
        double totalCost = 0;
        for(int i1 = 0 ; i1<order ; i1++)
        {
            System.out.println("Enter the itemid and quantity : ");
            int k = sc.nextInt();
            int q = sc.nextInt();
            Order o = new Order(k,q);
            OrderComputation o1 = new OrderComputation(o,i);
            totalCost = totalCost +  o1.display();
        }
        if (order>0) // display the total cost
        {
            System.out.println("Total Cost of All The order "+totalCost);
        }
    }
}
