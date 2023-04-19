import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    Player player1 = new Player(1, "Egor", 5);
    Player player2 = new Player(2, "Vadim", 8);
    Player player3 = new Player(3, "Andrey", 6);
    Player player4 = new Player(4, "Sasha", 8);

    List<Player> players = new ArrayList<>();
    Game game = new Game();

    @Test
    public void gameTestOne() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 2;
        int actual = game.round("Egor", "Vadim");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameTestTwo() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 1;
        int actual = game.round("Vadim", "Andrey");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameTestThree() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        int expected = 0;
        int actual = game.round("Sasha", "Vadim");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void gameTestForth() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        try {
            game.round("Petya", "Vadim");
        } catch (NotRegisteredException e) {
            System.out.println("Игра не состоялось, есть не зарегистрированные игроки");
        }
    }

    @Test
    public void gameTestFifth() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);

        try {
            game.round("Egor", "Kolya");
        } catch (NotRegisteredException e) {
            System.out.println("Игра не состоялось, есть не зарегистрированные игроки");
        }
    }
}
