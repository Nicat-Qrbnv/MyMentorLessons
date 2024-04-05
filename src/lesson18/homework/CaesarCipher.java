package lesson18.homework;

import java.util.Scanner;

public class CaesarCipher {
    
    public static String encrypt(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                char encryptedCh = (char) (((ch - 'A' + key) % 26) + 'A');
                encrypted.append(encryptedCh);
            }

            else if (Character.isLowerCase(ch)) {
                char encryptedCh = (char) (((ch - 'a' + key) % 26) + 'a');
                encrypted.append(encryptedCh);
            }

            else {
                encrypted.append(ch);
            }
        }
        
        return encrypted.toString();
    }
    
    // Function to decrypt the given encrypted sentence using Caesar cipher
    public static String decrypt(String encryptedText, int key) {
        return encrypt(encryptedText, 26 - key); // Decrypting is just shifting in the opposite direction
    }
}
