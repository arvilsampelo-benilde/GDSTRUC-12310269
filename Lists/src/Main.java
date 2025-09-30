import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(new Player(1, "Saitama", 999));
        playerList.add(new Player(2, "Goku", 500));
        playerList.add(new Player(3, "Deku", 100));

        // initial contents of the list
        System.out.println("Inital contents of list");

        for (Player player : playerList) {
            System.out.println(player);
        }

        // add player at index 2
        playerList.add(2, new Player(4, "Sakamoto", 10));

        System.out.println("\nAfter adding a player at index 2");

        for (Player player : playerList) {
            System.out.println(player);
        }

        System.out.println("\nPlayer at index 2 " + playerList.get(2));

        // remove a player at index 1
        System.out.println("\nAfter removing a player at index 1");

        playerList.remove(1);

        for (Player player : playerList) {
            System.out.println(player);
        }

        // check if player object is in list
        boolean contains = playerList.contains(new Player(1, "Saitama", 999));
        System.out.println("\nList has Saitama? " + contains);

        // check player's index
        int index = playerList.indexOf(new Player(1, "Saitama", 999));
        System.out.println("\nIndex of Saitama? " + index);
    }

    //Functions

    private static void removeElement() {
        System.out.println("\nAfter removing a player at index 1");
    }

    private static void size() {
        Player[] playerList;
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    private static void contains() {
        Player[] playerList;
        for (Player player : playerList) {
            System.out.println(player);
        }
    }

    private static void indexOf() {

    }
}
