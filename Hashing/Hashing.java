import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hashing {
    public static void main(String[] args) {
        String originalString = "AtulIsGod";
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] encodedHash = digest.digest(originalString.getBytes(StandardCharsets.UTF_8));

            // System.out.println("encodedHash memory address " + encodedHash);

            // System.out.println("encodedHash Length " + encodedHash.length);

            String hashedString = bytesToHex(encodedHash);

            System.out.println("hashedString " + hashedString);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String bytesToHex(byte[] encodedHash) {
        StringBuilder hexString = new StringBuilder(2 * encodedHash.length);
        for (byte b : encodedHash) {

            String hex = Integer.toHexString(0xff & b);

            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
}