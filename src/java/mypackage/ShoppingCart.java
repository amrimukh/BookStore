/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import static java.lang.System.out;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amrita
 */
public  class ShoppingCart implements java.io.Serializable
{
// The shopping cart items are stored in a Vector.
      protected Vector<Book> cartitems;

    public ShoppingCart()
    {
        cartitems = new Vector<Book>();
    }

/** Returns a Vector containing the items in the cart. The Vector
 *  returned is a clone, so modifying the vector won't affect the
 *  contents of the cart.
 */
    public Vector getItems()
    {
        return (Vector) cartitems.clone();
    }


/** Returns a Vector containing the items in the cart. The Vector
 *  returned is a clone, so modifying the vector won't affect the
 *  contents of the cart.
 */
    /*public Vector getItems()
    {
        return (Vector) items.clone();
    }*/

    
    public void addItem(Book newBook)
    {
        cartitems.add(newBook);
    }

    public void removeItem(int bookIndex)
    {
       cartitems.remove(bookIndex);
    }
  
// Warning! This order number is reset every time the server is
// restarted. This technique of generating an order number is
// just for demonstration.
    protected static int nextOrderNumber = 1;

// Submit the order and return a confirmation number.
   
        
    }


   

    


    
   

   

    
 
