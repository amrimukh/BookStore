/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amrita
 */
public class BookCatalog implements BookList{
    
    protected List<Book> booklist ;
    BigDecimal totalprice = BigDecimal.ZERO;
    //Book []items = new Book[booklist.size()];
    public BookCatalog() throws FileNotFoundException, IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
       booklist = new ArrayList<Book>();
      String line = null;
      //Book books;
      //books = new Book();
      while ((line = br.readLine()) != null) {
       //System.out.println(line);   
       Book book = new Book();
       String lines[] = line.split(";");
       //System.out.println(line);
       
        book.setTitle(lines[0]);
        book.setAuthor(lines[1]);
        book.setPrice(lines[2]);
        book.setQuantity(lines[3]);
           
        booklist.add(book);
    }
          
       //    booklist.toArray(items); 
       
    }
    
     // Returns the list of Books
    
    public List<Book> getList()
    {
      return booklist ;
    }
    
    @Override
    public Book[] list(String searchString) {
        
        /** Searches for an item by product code and returns it. If there is
    no such item, this method returns null.  */
    
    
// Linear searches aren't a good idea for big arrays, but this
// one is small.
     List<Book> searchedBooks = new ArrayList<Book>();
        for (int i=0; i < booklist.size(); i++)
        {
            if (booklist.get(i).getTitle().contains(searchString)|| booklist.get(i).getAuthor().contains(searchString) )
            {
               searchedBooks.add(booklist.get(i));
                    
                
            }
        }
        return (Book[])searchedBooks.toArray();
    }
        
       
  
    @Override
    public int[] buy(Book... books) {
         int[] returnValues = new int[books.length]; 
         for(int i=0;i<books.length;i++)
         {
             returnValues[i]= buyOneBook(books[i]);
         }
          
         return returnValues;
    }
    public int buyOneBook(Book book)
    {
        for(Book b : booklist)
       {
           if(b.equals(book))
           {
               if(b.getQuantity()>0){
                   b.setQuantity(b.getQuantity()-1);
                   totalprice = totalprice.add(b.getPrice());
                return 0;
               } else return 1;
               
           }
          
               
       }
        return 2;
    }
    @Override
    public boolean add(Book book, int amount) {
        if(book == null)
        {
            return false;
        }
        
       for(Book b : booklist)
       {
           if(b.equals(book))
           {
               b.setQuantity(amount+b.getQuantity());
               return true;
           }
          
               
       }
       book.setQuantity(amount);
       booklist.add(book);
       return true;
      //To change body of generated methods, choose Tools | Templates.
    }
    
}
