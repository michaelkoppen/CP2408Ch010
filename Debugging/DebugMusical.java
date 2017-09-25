public class DebugMusical extends DebugPlay
{
   protected String composer;
   protected String title;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title,author);
      this.composer = comp;
      this.title = title;
   }
   public void display()
   {
      System.out.println("The performance is"  + title +
        " by " + author + "\nThe music for " + title +
        " is by " + composer);
   }
}