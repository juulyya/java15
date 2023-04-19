import java.util.ArrayList;
import java.util.List;

public class Game {

    List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {

        int strength1;
        int strength2;

        if (findByName(playerName1) == null) {
            throw new NotRegisteredException("Игрок " + playerName1 + " не зарегистрирован");
        }

        if (findByName(playerName2) == null) {
            throw new NotRegisteredException("Игрок " + playerName2 + " не зарегистрирован");
        }

        strength1 = findByName(playerName1).getStrength();
        strength2 = findByName(playerName2).getStrength();


        if (strength1 > strength2) {
            return 1;
        } else {
            if (strength1 < strength2) {
                return 2;
            } else {
                return 0;
            }
        }
    }


    public Player findByName(String name) {
        for (int i = 0; i < players.size(); i++) {
            if (name == players.get(i).getName()) {
                return players.get(i);
            }
        }
        return null;
    }
}
