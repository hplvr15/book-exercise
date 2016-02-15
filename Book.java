/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int page;
    private String refNumber = "";

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    
    public Book(String bookAuthor, String bookTitle, String ref, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        page = pages;
        refNumber = ref;
    } 
    
        public String getAuthor()
        {
            return author;
        }
        
        public String getTitle()
        {
            return title;
        }
        
        public int getPage()
        {
            return page;
        }
        
        public String getRefNumber()
        {
            return refNumber;
        }
        
        public void setAuthor(String bookAuthor)
        {
            author = bookAuthor;
        }
        
        public void setTitle(String bookTitle)
        {
          title = bookTitle;  
        }
        
        public void setPage(int pages)
        {
            page = pages;
        }
        
        public void setRefNumber(String ref)
        {
            refNumber = ref;
        }    
    // Add the methods here ...
    
        public void printAuthor()
        {
            System.out.println("The author is " + author);
        }
        
        public void printTitle()
        {
            System.out.println("The title of the book is " + title);
        }
        
        public void printDetails()
        {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Pages: " + page);
            if (refNumber == "")
            {
              System.out.println("ZZZ"); 
            }
            else
            {
             System.out.println("Reference Number" + refNumber);
            }

        }
        
        
        
        
}
