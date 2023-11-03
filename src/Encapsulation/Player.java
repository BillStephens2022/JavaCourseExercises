package Encapsulation;


// Player class WITHOUT ENCAPSULATION - for demonstration of how things can go wrong when there
// is no encapsulation and all variables/methods are public
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;

        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }

}
