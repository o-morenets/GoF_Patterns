package behavioral.template_method;

/**
 * Created by a-morenets (alexey.morenets@gmail.com) on 05.12.2016.
 */

/**
 * Коды разновидностей игр.
 */
enum GameCode {
    CHESS,
    MONOPOLY
}

/**
 * Абстрактный класс, реализация абстрактных методов которого будет специфичной для каждого вида игры.
 */
abstract class Game {
    private int playersAmount;

    protected abstract void initializeGame();

    protected abstract void playGame();

    protected abstract void endGame();

    protected abstract void printWinner();

    public final void playOneGame(int playersAmount) {
        setPlayersAmount(playersAmount);

        initializeGame();
        playGame();
        endGame();

        printWinner();
    }

    public void setPlayersAmount(int playersAmount) {
        this.playersAmount = playersAmount;
    }
}

/**
 * Игра "Шахматы". Специфически только для шахмат реализует методы класса Game.
 */
class Chess extends Game {

    @Override
    protected void initializeGame() {
        // chess specific initialization actions
    }

    @Override
    protected void playGame() {
        // chess specific play actions
    }

    @Override
    protected void endGame() {
        // chess specific actions to end a game
    }

    @Override
    protected void printWinner() {
        // chess specific actions to print winner
    }
}

/**
 * Игра "Монополия". Специфически только для монополии реализует методы класса Game.
 */
class Monopoly extends Game {

    @Override
    protected void initializeGame() {
        // monopoly specific initialization actions
    }

    @Override
    protected void playGame() {
        // monopoly specific play actions
    }

    @Override
    protected void endGame() {
        // monopoly specific actions to end a game
    }

    @Override
    protected void printWinner() {
        // monopoly specific actions to print winner
    }
}

/**
 * Класс, показывающий работу шаблона проектирования "Шаблонный метод".
 */
public class GamesManager {

    public static void main(String[] args) {
        final GameCode gameCode = GameCode.CHESS;

        Game game;

        switch (gameCode) {
            case CHESS:
                game = new Chess();
                break;
            case MONOPOLY:
                game = new Monopoly();
                break;
            default:
                throw new IllegalStateException();
        }

        game.playOneGame(2);
    }

}