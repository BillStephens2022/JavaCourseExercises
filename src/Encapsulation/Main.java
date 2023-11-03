package Encapsulation;

public class Main {
    public static void main(String[] args) {

        // code was written on a Player class WITHOUT ENCAPSULATION where everything was public
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // code written on EnhancedPlayer class WITH ENCAPSULATION

        EnhancedPlayer bill = new EnhancedPlayer("Bill");
        System.out.println("Initial health is " + bill.healthRemaining() + " for " + bill.getName());

        // note: that due to controls in the constructor method, max healthPercentage is 100%,
        // therefore, in the printout, it sets the health to 100 (overrides the 200 passed in).
        EnhancedPlayer carolyn = new EnhancedPlayer("Carolyn", 200, "Machine Gun");
        System.out.println("Initial health is " + carolyn.healthRemaining() + " for " + carolyn.getName());

    }
}
