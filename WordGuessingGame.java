public class WordGuessingGame {
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    private InputReader reader;
    private WordGenerator wordGenerator;
    
    
    // Construtor
    public WordGuessingGame(InputReader reader, WordGenerator wordGenerator) {
        this.reader = reader;
        this.wordGenerator = wordGenerator;
        initializeHiddenWord();
    }
    
    private void initializeHiddenWord() {
        hiddenWord = wordGenerator.generateWord();
        guessedWord = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            guessedWord += "_";
        }
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
    
    public void setHiddenWord(String hiddenWord){
        this.hiddenWord = hiddenWord;
    }
    // Método para exibir a palavra adivinhada
    public void showGuessedWord() {
        System.out.println(guessedWord);
    }
    
    public void showWelcome(){
        System.out.println("Bem Vindo");
    }
    
    private void guess(char letter) {
        if (hiddenWord.contains(String.valueOf(letter)) && !guessedWord.contains(String.valueOf(letter))) {
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
    
    public void reset(){
        initializeHiddenWord();
    }
}
