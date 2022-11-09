import java.util.*;

class OrderComputation
{
    double sum = 0;
    OrderComputation(Order obj,ArrayList<ItemList> i)
    {
        for (ItemList i1 : i)
        {
            if ( i1.itemID == obj.itemid)//checking,, user enter the correct iteam_id which is present in the arraylist if "yes"
            {
                if(obj.quantity<=i1.quantity)// checked for quantity , if "yes"
                {
                    sum = sum + obj.quantity * i1.price; // calculating for the each iteams price
                    (i1.quantity) -= obj.quantity;  // deducted the quantity
                }
                else
                {
                    System.out.println("ITEM OUT OF STOCK"); // print:if quantity less than from the order quantity
                }
            }
        }
    }
    public double display()
    {
        System.out.println("Total Cost of Each Order: " + sum);
        return sum;// return total cost of all the  iteams
    }
}

