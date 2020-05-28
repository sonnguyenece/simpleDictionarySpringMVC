package controllers;

import java.util.HashMap;

public class DictionaryData {
    static HashMap<String, String> dictionaryData= new HashMap<String, String>();

    public DictionaryData() {
//        dictionaryData
        dictionaryData.put("cat", "Mèo");

        dictionaryData.put("dog", "Chó");

        dictionaryData.put("monkey", "Khỉ");

        dictionaryData.put("snake", "Rắn");

        dictionaryData.put("spider", "Nhện");

        dictionaryData.put("bat", "Dơi");

    }

    public boolean addNewWord(String englishWord, String vietnamWord) {
        System.out.println(dictionaryData.size());
        englishWord = englishWord.toLowerCase();

        String check =dictionaryData.get(englishWord);
        if (check==null) {
            dictionaryData.put(englishWord, vietnamWord);
            System.out.println(dictionaryData.size());
        return true;
        }

        return false;
    }

    public String getWord(String findWord) {
        findWord = findWord.toLowerCase();
        String value = dictionaryData.get(findWord);
        if (value != null)
            return dictionaryData.get(findWord);
        return "Can't find that word";
    }
}
