package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Words {
    private List<String> words = new ArrayList<>();

    public void addWord(String word) {
        if (!isAWord(word)) {
            throw new IllegalArgumentException("It should be one word!");
        } else if (!isLowercase(word)) {
            throw new IllegalArgumentException("Word should be lower case!");
        } else
            words.add(word);
    }

    public boolean isLowercase(String s) {
        for (Character c : s.toCharArray()) {
            if (c < 97 || c > 122) {
                return false;
            }
        }
        return true;
    }

    public boolean isAWord(String s) {
        for (Character c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }

    public List<String> getWords() {
        return words;
    }

    public boolean isThereAWordTwice() {
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j)) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
