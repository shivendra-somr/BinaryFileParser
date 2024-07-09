package com.da.util;

public class Template001WordReversal {
    private String word;

    public Template001WordReversal(String word) {
        this.word = word;
    }

    public Template001WordReversal() {
    }

    public String getWord() {
        return word;
    }

    public String parsedWord(String word){
        if(word.length()%2 == 0){
            int n = word.length();
            char originalWord[] = new char[n];
            for(int i=0; i<n; i+=2){
                originalWord[i] = word.charAt(i+1);
                originalWord[i+1] = word.charAt(i);
            }
            String result = "";
            for(char x: originalWord){
                result+=x;
            }
            return result;
        }
        return null;
    }
}
