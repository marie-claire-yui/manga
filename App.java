import com.perso.Pirate;
import com.perso.PirateException;
import com.env.Bateau;
import com.env.Chalet;
import com.env.Chateau;
import com.env.Waver;
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

       Bateau bateau1 = new Bateau();
       bateau1.deplacer(3,4);
       Waver waver1 = new Waver(0,0);
       waver1.deplacer(4,5);

       Chateau chateau1 = new Chateau();
       chateau1.materiaux();

        Chalet chalet1 = new Chalet();
        chalet1.materiaux();
    }
}



// import com.perso.*;
// import com.outils.*;

// public class App{
//     public static void main(String[] args)
//     {
//         // Pirate p = new Pirate("Luffi");
//         // p.move(32, 47);
//         // HommePoisson hp = new HommePoisson("Jimbe");
//         // hp.swim(3, 4, -20);
//         // Phoenix ph = new Phoenix("Marco");
//         // ph.fly(4, 80, 30);
//         // ph.move(0, 70);
//         // Combatant c = new Combatant();
//         // System.out.println(c.kezako());
//         Chalet ch = new Chalet();
//         System.out.println(ch.getNbrPieces());
//         ch.setNbrPieces(4);
//         System.out.println(ch.getNbrPieces());
//     }
// }