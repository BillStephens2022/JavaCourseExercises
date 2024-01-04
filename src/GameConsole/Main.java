package GameConsole;

import GameConsole.game.GameConsole;
import GameConsole.pirate.PirateGame;

public class Main {
    public static void main(String[] args) {

//        var console = new GameConsole<>(new ShooterGame("The Shootout Game"));
//        int playerIndex = console.addPlayer();
//        console.playGame(playerIndex);

//        Weapon weapon = Weapon.getWeaponByChar('P');
//        System.out.println("weapon = " + weapon + ", hitPoints = " +
//                weapon.getHitPoints() + ", minLevel = " + weapon.getMinLevel());
//        var list = Weapon.getWeaponByLevel(1);
//        list.forEach(System.out::println);
//
//        Pirate tim = new Pirate("Tim");
//        System.out.println(tim);
//
//        PirateGame.getTowns(0).forEach(t -> System.out.println(t.information()));
//        System.out.println("-----------------------------------");
//        PirateGame.getTowns(1).forEach(t -> System.out.println(t.information()));

        var console = new GameConsole<>(new PirateGame("The Pirate Game"));
        int playerIndex = console.addPlayer();
        console.playGame(playerIndex);

    }
}
