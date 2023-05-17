import com.perso.Pirate;
import com.perso.HommePoisson;

public class App {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("Luffy");
        pirate1.move(32,47);
        HommePoisson hommePoisson1= new HommePoisson("Jimbe");
        hommePoisson1.move(25,25);
        hommePoisson1.swim(-40);

        System.out.println(pirate1.name);
        System.out.println(hommePoisson1.name);
    }
}
