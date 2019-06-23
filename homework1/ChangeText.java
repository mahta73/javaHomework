/*
    Write a Java program that inputs three lines of text and for each line of
    the input text outputs that line of text with all occurrences of “apple” changed to “pear”
    and the last occurrence of “plum” changed to “apricot”. For example, the line
*/

import java.util.Scanner;

public class ChangeText {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String firstMessage = "I like plums. This apple is red but those apples are green.";
        String secondMessage = "I love plums. This apple is red but those apples are green.";
        String thirdMessage = "I hate plums. This apple is red but those apples are green.";

        // THE FIRST MESSAGE

        System.out.println(firstMessage);

        String beforeApple = firstMessage.substring(0, firstMessage.indexOf("apple"));
        String afterApple = firstMessage.substring(firstMessage.indexOf("apple") + 5);
        String newMessage = beforeApple + "pear" + afterApple;

        String beforePlum = newMessage.substring(0, newMessage.lastIndexOf("plums"));
        String afterPlum = newMessage.substring(newMessage.lastIndexOf("plums") + 4);
        String finalMessage = beforePlum + "apricot" + afterPlum;

        System.out.println(finalMessage);

        // THE SECOND MESSAGE

        System.out.println(secondMessage);

        String beforeApple2 = secondMessage.substring(0, secondMessage.indexOf("apple"));
        String afterApple2 = secondMessage.substring(secondMessage.indexOf("apple") + 5);
        String newMessage2 = beforeApple2 + "pear" + afterApple2;

        String beforePlum2 = newMessage2.substring(0, newMessage2.lastIndexOf("plums"));
        String afterPlum2 = newMessage2.substring(newMessage2.lastIndexOf("plums") + 4);
        String finalMessage2 = beforePlum2 + "apricot" + afterPlum2;

        System.out.println(finalMessage2);

        // THE THIRD MESSAGE

        System.out.println(thirdMessage);

        String beforeApple3 = thirdMessage.substring(0, thirdMessage.indexOf("apple"));
        String afterApple3 = thirdMessage.substring(thirdMessage.indexOf("apple") + 5);
        String newMessage3 = beforeApple3 + "pear" + afterApple3;

        String beforePlum3 = newMessage3.substring(0, newMessage3.lastIndexOf("plums"));
        String afterPlum3 = newMessage3.substring(newMessage3.lastIndexOf("plums") + 4);
        String finalMessage3 = beforePlum3 + "apricot" + afterPlum3;

        System.out.println(finalMessage3);

    
    }
}