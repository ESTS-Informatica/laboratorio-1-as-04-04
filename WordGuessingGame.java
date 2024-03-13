public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;

    // Construtor
    public WordGuessingGame(InputReader reader) {
        hiddenWord = "abc";
        guessedWord = "___";
        numberOfTries = 0;
        this.reader = reader;
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
    
    public void showWelcome(){
        System.out.println("Bem Vindo");
    }
    
    private void guess(char letter){
        if(hiddenWord.contains(String.valueOf(letter)) && !guessedWord.contains(String.valueOf(letter))) {
            StringBuilder newGuessedWord = new StringBuilder(guessedWord);
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    newGuessedWord.setCharAt(i, letter);
                }
            }
            guessedWord = newGuessedWord.toString();
        }
    }
    
    private boolean isWordGuessed() {
        return guessedWord.equals(hiddenWord);
    }
    
    private void showResult() {
        System.out.println("Parabéns! Adivinhaste a palavra em " + numberOfTries + " tentativas.");
    }
    
    public void play(){
        showWelcome();
        while (!isWordGuessed()) {
            showGuessedWord();
            System.out.print("Adivinhe uma letra: ");
            char letter = reader.getChar(null);
            guess(letter);
            numberOfTries++;
        }
        showResult();
    }
}