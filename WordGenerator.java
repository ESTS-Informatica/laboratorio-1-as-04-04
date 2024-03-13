import java.util.ArrayList;
import java.util.Random;

/**
 * Escreva uma descrição da classe WordGenerator aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class WordGenerator
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private ArrayList<String> words;

    /**
     * Construtor para objetos da classe WordGenerator
     */
    public WordGenerator()
    {
        this.words = new ArrayList<>();
    }

    private void fillArrayList(){
        words.add("boolean");
        words.add("break");
        words.add("byte");
        words.add("case");
        words.add("char");
        words.add("class");
        words.add("continue");
        words.add("do");
        words.add("double");
        words.add("else");
        words.add("enum");
        words.add("for");
        words.add("if");
        words.add("import");
        words.add("int");
    }
    
    public String generateWord() {
        if (words.isEmpty()) {
            return null;
        }
        
        Random rand = new Random();
        int index = rand.nextInt(words.size());
        return words.get(index);
    }
    
    public void addWord(String word){
        if(!words.contains(word)){
            words.add(word);
        }
    }
}