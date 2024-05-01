/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week6;

/**
 *
 * @author xxg8089
 */
public class W6Q2{
    public static boolean wordsTest(String word1, String word2) {
        // Check if the lengths of the words are different
        if (word1.length() != word2.length())
            return false;

        // Create an array to store the frequency of characters for word1
        int[] charFrequency = new int[26];

        // Update frequency for characters in word1
        for (char c : word1.toCharArray()) {
            int index = c - 'a';
            charFrequency[index]++;
        }

        // Update frequency for characters in word2 and compare with word1
        for (char c : word2.toCharArray()) {
            int index = c - 'a';
            charFrequency[index]--;

            // If any character's frequency becomes negative, return false
            if (charFrequency[index] < 0)
                return false;
        }

        // Check if all frequencies are zero, indicating both words have the same characters
        for (int frequency : charFrequency) {
            if (frequency != 0)
                return false;
        }

        // If all characters have the same frequency, return true
        return true;
    }

    public static void main(String[] args) {
        System.out.println("\n\nwords test\n");
        System.out.println("study, dusty \t\t" + wordsTest("study", "dusty"));
        System.out.println("university, dusty \t\t" + wordsTest("university", "dusty"));
        System.out.println("looped, poodle \t\t" + wordsTest("looped","poodle"));
        System.out.println("teacher, cheater \t\t" + wordsTest("teacher","cheater"));
        System.out.println("table, order \t\t" + wordsTest("table","order"));
        System.out.println("sell, eels \t\t" + wordsTest("sell","eels"));
        System.out.println("letter, teller \t\t" + wordsTest("letter","teller"));
        System.out.println("firstsecond, first \t\t" + wordsTest("firstsecond","first"));
        System.out.println("esac, case \t\t" + wordsTest("esac","case"));
        System.out.println("string, substring \t\t" + wordsTest("string","substring"));
    }
}