public class SymmetricalApplication {
    public static void main(String[] args) {
        try {
            SymmetricalAES256 aes = new SymmetricalAES256();
            String msg = "The carrots are cooked.";
            System.out.println("\nBase Text: " + msg);

            String encryptedText = aes.crypt(msg);
            System.out.println("Encrypted Text: " + encryptedText);

            String decryptedText = aes.decrypt(encryptedText);
            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}