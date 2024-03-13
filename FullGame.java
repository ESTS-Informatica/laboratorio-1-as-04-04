import java.util.Scanner;

public class FullGame {
    private WordGuessingGame wordGuessingGame;
    private InputReader inputReader;

    public FullGame() {
        this.inputReader = new InputReader();
        this.wordGuessingGame = new WordGuessingGame(inputReader, new WordGenerator());
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        char playAgain;
        
        do {
            wordGuessingGame.reset();
            wordGuessingGame.play();
            System.out.print("Quer jogar novamente? (s/S para continuar): ");
            playAgain = scanner.nextLine().charAt(0);
        } while (playAgain == 's' || playAgain == 'S');
    }

    public static void main(String[] args) {
        FullGame fullGame = new FullGame();
        fullGame.play();
    }
}
