package org.launchcode;
import java.util.Locale;
import java.util.Scanner;

public class SearchTerm {
    public static void main(String[] args) {

        String sentenceAliceInWonderland = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or conversations in it," +
                " ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";

        Scanner input = new Scanner(System.in);
        System.out.println("What term should be searched for in the sentence?");
        String termToSearch = input.nextLine().toLowerCase(Locale.ROOT);
        boolean isTermThere= sentenceAliceInWonderland.toLowerCase().contains(termToSearch);

        System.out.println("Is the term there: " + isTermThere);
        int indexOfSearchTerm = sentenceAliceInWonderland.indexOf(termToSearch);
        int lengthOfTerm = termToSearch.length();
        System.out.println("The index of your search term is " + indexOfSearchTerm + " and has a length of " + lengthOfTerm);
        String withoutTermSentence = sentenceAliceInWonderland.replace(termToSearch,"");
        System.out.println(("This is the sentence without the search term: " + withoutTermSentence));
    }
}
