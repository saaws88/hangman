package src.main.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Word {
    
    String word;
    Random randomWord = new Random();

    public static List<String> getVocab() throws IOException {
        List<String> vocabLines = Files.readAllLines(Paths.get("Resources\\vocab.txt"));
        return vocabLines;
    }    
}