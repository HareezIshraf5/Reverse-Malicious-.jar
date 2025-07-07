import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;

public class RSPSDecryptor {

    // Corrected constants array based on decryption patterns
    private static final int[] llllIlllIl = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public static void main(String[] args) {
        // Initialize string array with proper size
        String[] lIIIlIIIIl = new String[14];
        
        System.out.println("Properly Decrypted Strings:");
        System.out.println("---------------------------");
        
        // Fixed XOR decryption (changed key index start)
        lIIIlIIIIl[1] = lIIIlIlll("Mj09UxlvOy0/DQdW", "VlJgn");
        System.out.println("lIIIlIIIIl[1] = lIIIlIlll(\"Mj09UxlvOy0/DQdW\", \"VlJgn\"); // " + lIIIlIIIIl[1]);
        
        // Working DES decryption
        lIIIlIIIIl[2] = lIIIllIII("gbtLjtdW8VY=", "SYwvE");
        System.out.println("lIIIlIIIIl[2] = lIIIllIII(\"gbtLjtdW8VY=\", \"SYwvE\"); // " + lIIIlIIIIl[2]);
        
        // Fixed Blowfish decryption (added proper padding)
        lIIIlIIIIl[3] = BlowFishEncryption("teOfXKlc5x/Zn55sTQ+bzjRBZ4EpdfsAYAi78JAW2jU=", "TEtew");
        System.out.println("lIIIlIIIIl[3] = BlowFishEncryption(\"teOfXKlc5x/Zn55sTQ+bzjRBZ4EpdfsAYAi78JAW2jU=\", \"TEtew\"); // " + lIIIlIIIIl[3]);
        
        // Working DES decryption
        lIIIlIIIIl[4] = lIIIllIII("nvxM+C2gBk4=", "TunHl");
        System.out.println("lIIIlIIIIl[4] = lIIIllIII(\"nvxM+C2gBk4=\", \"TunHl\"); // " + lIIIlIIIIl[4]);
        
        // Working Blowfish decryption
        lIIIlIIIIl[5] = BlowFishEncryption("UEy2mE94AnU=", "pXrJW");
        System.out.println("lIIIlIIIIl[5] = BlowFishEncryption(\"UEy2mE94AnU=\", \"pXrJW\"); // " + lIIIlIIIIl[5]);
        
        // Fixed XOR decryption (changed key index start)
        lIIIlIIIIl[0] = lIIIlIlll("ERcrBA8iASYrICIQIxtMHgcjAwk=", "MsBwl");
        System.out.println("lIIIlIIIIl[0] = lIIIlIlll(\"ERcrBA8iASYrICIQIxtMHgcjAwk=\", \"MsBwl\"); // " + lIIIlIIIIl[0]);
        
        // Working Blowfish decryption
        lIIIlIIIIl[6] = BlowFishEncryption("x3pOFpVtRiDHUiG6S4y8Cg==", "eofrq");
        System.out.println("lIIIlIIIIl[6] = BlowFishEncryption(\"x3pOFpVtRiDHUiG6S4y8Cg==\", \"eofrq\"); // " + lIIIlIIIIl[6]);
        
        // Working DES decryption
        lIIIlIIIIl[7] = lIIIllIII("pIpz29hGDVxBPVF2JAgWcA==", "kpZxi");
        System.out.println("lIIIlIIIIl[7] = lIIIllIII(\"pIpz29hGDVxBPVF2JAgWcA==\", \"kpZxi\"); // " + lIIIlIIIIl[7]);
        
        // Working Blowfish decryption
        lIIIlIIIIl[10] = BlowFishEncryption("fCyQGcmyLXFsLf9ZdKcM1pLtSF+T5gqI", "aYZOr");
        System.out.println("lIIIlIIIIl[10] = BlowFishEncryption(\"fCyQGcmyLXFsLf9ZdKcM1pLtSF+T5gqI\", \"aYZOr\"); // " + lIIIlIIIIl[10]);
        
        // Fixed XOR decryption (changed key index start)
        lIIIlIIIIl[11] = lIIIlIlll("OTcS", "xrAzi");
        System.out.println("lIIIlIIIIl[11] = lIIIlIlll(\"OTcS\", \"xrAzi\"); // " + lIIIlIIIIl[11]);
    }

    // Fixed XOR decryption - changed key index start to 0
    private static String lIIIlIlll(String encrypted, String key) {
        byte[] decoded = Base64.getDecoder().decode(encrypted);
        String decodedStr = new String(decoded, StandardCharsets.UTF_8);
        StringBuilder result = new StringBuilder();
        char[] keyChars = key.toCharArray();
        int keyIndex = 0;  // Changed from 1 to 0
        
        for(int i = 0; i < decodedStr.length(); i++) {
            char c = decodedStr.charAt(i);
            result.append((char)(c ^ keyChars[keyIndex % keyChars.length]));
            keyIndex++;
        }
        return result.toString();
    }

    // DES decryption with proper padding
    private static String lIIIllIII(String encrypted, String key) {
        try {
            byte[] keyBytes = Arrays.copyOf(
                MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8)), 
                8); // DES uses 56-bit keys
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "DES");
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.err.println("DES Decryption error: " + e.getMessage());
            return "DECRYPTION_FAILED";
        }
    }

    // Blowfish decryption with proper padding
    private static String BlowFishEncryption(String encrypted, String key) {
        try {
            byte[] keyBytes = MessageDigest.getInstance("MD5").digest(key.getBytes(StandardCharsets.UTF_8));
            SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encrypted));
            return new String(decrypted, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.err.println("Blowfish Decryption error: " + e.getMessage());
            return "DECRYPTION_FAILED";
        }
    }
}
