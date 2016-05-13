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
import java.util.List;

/**
 *
 * @author Amrita
 */
public class Book {
   private String title;
   private String author;
   private BigDecimal price;
   private int quantity;
  
    
   
   public Book()throws FileNotFoundException, IOException{
       //booklist = new ArrayList<Book>();
   }
   
   /*public List<Book> createlist() throws FileNotFoundException, IOException {
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
    //for(Book b: booklist) {
    // System.out.println(b.title + b.author + b.price + b.quantity ) ;
    //}
      br.close();
      return booklist;
   }*/
           
    public Book(String aTitle, String aAuthor,
        double aPrice, int aQuantity)
    {
        title = aTitle;
        author = aAuthor;
        price = BigDecimal.valueOf(aPrice);
        quantity = aQuantity;
    }

   public String toString(){
           return "Title: " + title + "\nAuthor: " + author + "\nPrice:" + price +"\nQuantity: " + quantity + "\n";


       }
/* public Book(String title, String author, BigDecimal price)
{
this.title = title;
this.author = author;
this.price = price ;
} */



/*public String getAuthor(int index)
{
    
}

public BigDecimal getPrice(int index)
{
    
}*/

 public void setQuantity(int amount) {
         //To change body of generated methods, choose Tools | Templates.
         this.quantity = amount;
    }

   public void setQuantity(String amount) {
         //To change body of generated methods, choose Tools | Templates.
         this.quantity = Integer.parseInt(amount);
    }
   
    public void setTitle(String line) {
        this.title = line; //To change body of generated methods, choose Tools | Templates.
    }

    public void setAuthor(String line) {
        this.author = line; //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrice(String line) {
        this.price = new BigDecimal(line);
        //To change body of generated methods, choose Tools | Templates.
        
    } 
    
    public BigDecimal getPrice()
    {
        return price ;
    }

    private boolean Arrays(List<Book> booklist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

        public int getQuantity() {
        return quantity;
    }
        
       public boolean equals(Book book)
       {
          return book.title.equals(this.title) && book.author.equals(this.author);
       
       
       }
}


