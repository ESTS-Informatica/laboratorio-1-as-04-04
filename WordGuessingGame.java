public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;

    // Construtor
    public WordGuessingGame() {
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
    }

    // Métodos seletores
    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    // Método para exibir a palavra adivinhada
    public void showGuessedWord() {
        System.out.println(guessedWord);
    }
}
