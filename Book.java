public class Book 
{ 
    private String title; 

    private double price; 

    public Book (String bookTitle, double bookPrice) { 
        /* implementation not shown */ 
    }

    public String getTitle() { 
        return title; 
    } 

    public String getBookInfo() { 
        return title + 
        + price; 
    } 

} 
