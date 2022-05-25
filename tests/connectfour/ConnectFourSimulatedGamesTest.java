package connectfour;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConnectFourSimulatedGamesTest {

    @Test
    void game1(){
        DebugEngine game = new ConnectFour(7,6,"a");

        int red = 1;
        int yellow = 2;
        game.insertDebug(4, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(4, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(4, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(4, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(4, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(4, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(2, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(5, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(5, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(5, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(1, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(7, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(3, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(6, red);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(5, yellow);
        Assertions.assertFalse(game.win(red));
        Assertions.assertFalse(game.win(yellow));
        game.insertDebug(5, red);

        Assertions.assertTrue(game.win(red));
        Assertions.assertFalse(game.win(yellow));

    }
}
