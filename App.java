import com.perso.Pirate;
import com.perso.PirateException;
import com.perso.Combattant;
import com.perso.HommePoisson;
import com.perso.Phoenix;

public class App {
    public static void main(String[] args) throws PirateException {
        Pirate pirate1 = new Pirate("Luffy");
        pirate1.move(32,47);
        HommePoisson hommePoisson1= new HommePoisson("Jimbe");
     //   hommePoisson1.move(25,25);
        hommePoisson1.swim(23,20,-40);

        Phoenix phoenix1 = new Phoenix("marco");
        phoenix1.fly(4,80,30);

        System.out.println(pirate1.name);
        System.out.println(hommePoisson1.name);
        System.out.println(phoenix1.name);

        Combattant c = new Combattant();
       System.out.println(c.kezako());
    }
}
