package lesson18.homework;

import java.util.Scanner;

public class CaesarCipher {
    
    public static String encrypt(String sentence, int shift) {
        StringBuilder encrypted = new StringBuilder();
        
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // Encrypt uppercase letters
            if (Character.isUpperCase(ch)) {
                char encryptedCh = (char) (((ch - 'A' + shift) % 26) + 'A');
                encrypted.append(encryptedCh);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(ch)) {
                char encryptedCh = (char) (((ch - 'a' + shift) % 26) + 'a');
                encrypted.append(encryptedCh);
            }
            // If the character is not a letter, append it as it is
            else {
                encrypted.append(ch);
            }
        }
        
        return encrypted.toString();
    }
    
    // Function to decrypt the given encrypted sentence using Caesar cipher
    public static String decrypt(String encryptedSentence, int shift) {
        return encrypt(encryptedSentence, 26 - shift); // Decrypting is just shifting in the opposite direction
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input sentence from user
        System.out.print("Enter a sentence to encrypt: ");
        String sentence = scanner.nextLine();
        
        // Input the shift value
        System.out.print("Enter the shift value for encryption: ");
        int shift = scanner.nextInt();
        
        // Encrypt the sentence
        String encryptedSentence = encrypt(sentence, shift);
        System.out.println("Encrypted sentence: " + encryptedSentence);
        
        // Decrypt the sentence
        String decryptedSentence = decrypt(encryptedSentence, shift);
        System.out.println("Decrypted sentence: " + decryptedSentence);
        
        scanner.close();
    }
}
