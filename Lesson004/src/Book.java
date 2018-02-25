
public class Book
{
   //ctor
   Book(String _author, String _title, float _price, int _pages)
   {
      author = _author;
      title = _title;
      price = _price;
      pages = _pages;
   }

   String author;
   String title;
   float price;
   int pages;

   public void setAuthor(String _author)
   {
      author = _author;
   }

   public void setTitle(String _bookTitle)
   {
      title = _bookTitle;
   }

   public void setPrice(float _price)
   {
      price = _price;
   }

   public void setPages(int _pages)
   {
      pages = _pages;
   }

   public String getAuthor()
   {
      return author;
   }

   public String getTitle()
   {
      return title;
   }

   public float getPrice()
   {
      return price;
   }

   public int getPages()
   {
      return pages;
   }

   @Override
   public String toString()
   {
      return "fuck you" + author;
   }
}
