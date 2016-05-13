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
@WebServlet(name = "RemoveItemServlet", urlPatterns = {"/RemoveItemServlet"})
public class RemoveItemServlet extends HttpServlet {

    public void service(HttpServletRequest request,
        HttpServletResponse response)
        throws IOException, ServletException
    {

// Get the index of the item to remove.
        int itemIndex = Integer.parseInt(request.getParameter("item"));

        HttpSession session = request.getSession();

// Get the cart.
        ShoppingCart cart =
            (ShoppingCart) session.getAttribute("ShoppingCart");

// If there is no shopping cart, create one.
        if (cart == null)
        {
            cart = new ShoppingCart();

            session.setAttribute("ShoppingCart", cart);
        }

        cart.removeItem(itemIndex);

// Now display the cart and allow the user to check out or order more items.
        response.sendRedirect(response.encodeRedirectURL(
            "Enter jsp page"));
    }
}
   

