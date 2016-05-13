/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Amrita
 */
@WebServlet(name = "AddToShoppingCart", urlPatterns = {"/AddToShoppingCart"})
public class AddToShoppingCartServlet extends HttpServlet {

    
    
    boolean flag = false;
    public void service(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException
    {    
         BookCatalog booksearch = new BookCatalog();
         //findBook = new Book[10];
         String searchString = request.getParameter("search");
         Book[] findBook = booksearch.list(searchString);
                 
// First get the item values from the request.
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int quantity = Integer.parseInt(
            request.getParameter("quantity"));
        double price = Double.parseDouble(
            request.getParameter("price"));

// Now create an item to add to the cart.
        Book book = new Book(title, author, price, quantity);

        HttpSession session = request.getSession();

// Get the cart.
        ShoppingCart cart = (ShoppingCart) session.
            getAttribute("ShoppingCart");

// If there is no shopping cart, create one.
        if (cart == null)
        {
            cart = new ShoppingCart();

            session.setAttribute("ShoppingCart", cart);
        }
        
     /*   if (findBook == null) {
             flag = false;
        }
        else {
             flag = true;
        } */
     
        cart.addItem(book);

// Now display the cart and allow the user to check out or order more items.
        response.sendRedirect(response.encodeRedirectURL(
            "Enter jsp page"));
    }
}