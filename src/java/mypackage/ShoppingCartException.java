/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author Amrita
 */
public class ShoppingCartException extends Exception
{
    public ShoppingCartException()
    {
    }

    public ShoppingCartException(String message)
    {
        super(message);
    }
}