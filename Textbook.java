public class Textbook extends Book {

    private int edition;

    public Textbook (String title, double price, int ed) {
        super(title, price);
        edition = ed;
    }

    public String getBookInfo() { 
        return super.getBookInfo() + "-" + edition; 
    }

    public int getEdition() { 
        return edition; 
    } 

    public boolean canSubstituteFor(Textbook t) {
        return (this.getEdition()>=t.getEdition()
        && this.getTitle().equals(t.getTitle()));
    }


}