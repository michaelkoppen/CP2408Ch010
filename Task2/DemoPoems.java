/**
 * Created by jc428209 on 25/09/17.
 */
public class DemoPoems {
    public static void main(String[] args) {
        Poem poem = new Poem("Poem", 50);
        Couplet couplet = new Couplet("Couplet");
        Limerick limerick = new Limerick("Limerick");
        Haiku haiku = new Haiku("Haiku");
        poem.display();
        couplet.display();
        limerick.display();
        haiku.display();
    }



}
