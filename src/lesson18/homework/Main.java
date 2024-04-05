package lesson18.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence to encrypt: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the key of the receiver: ");
        int shift = scanner.nextInt();

        String encryptedSentence = CaesarCipher.encrypt(sentence, shift);
        System.out.println("Encrypted sentence: " + encryptedSentence);

        String decryptedSentence = CaesarCipher.decrypt(encryptedSentence, shift);
        System.out.println("Decrypted sentence: " + decryptedSentence);
    }
}
