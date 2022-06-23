package Services;

import javax.crypto.Cipher;
import java.io.BufferedReader;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class SecurityRSA {
    //class Encrpytion using RSA using base64
    //SecurityKeyPairGenerator is used to generate public and private key

    public static String SecurityKeyPairGenerator() {
        String publicKey = "";
        String privateKey = "";
        try {
            //create key pair
            java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
            //get public key
            PublicKey publicKeyObj = keyPair.getPublic();
            PrivateKey privateKeyObj = keyPair.getPrivate();
            //convert public key to string
            publicKey = Base64.getEncoder().encodeToString(publicKeyObj.getEncoded());
            //convert private key to string
            //a -> skjdfhksjdfhkdsjfhkladsjhfalksdjfhlasdkj public key mã hoá
            //skjdfhksjdfhkdsjfhkladsjhfalksdjfhlasdkj -> private key giải mã
            privateKey = Base64.getEncoder().encodeToString(privateKeyObj.getEncoded());
        } catch (Exception e) {
            e.printStackTrace();

        }
        //save public and private key to file foder "Config"
        try {
            java.io.FileWriter fw = new java.io.FileWriter("Configs/publicKey.txt");
            fw.write(publicKey);
            fw.close();
            fw = new java.io.FileWriter("Configs/privateKey.txt");
            fw.write(privateKey);
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Lưu file thành công";
    }

    //read public key from file foder "Config"
    public static String readPublicKey() {
        String publicKey = "";
        try {
            java.io.FileReader fr = new java.io.FileReader("Configs/publicKey.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                publicKey = line;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return publicKey;
    }
    //read private key from file foder "Config"
    public static String readPrivateKey() {
        String privateKey = "";
        try {
            java.io.FileReader fr = new java.io.FileReader("Configs/privateKey.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                privateKey = line;
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return privateKey;
    }
    //Encrypt data using public key and base64
    public static String encrypt(String data) {
        String encryptedData = "";
        try {
            //read public key
            String publicKey = readPublicKey();
            //convert public key to public key object
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKey);
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(publicKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PublicKey publicKeyObj = keyFactory.generatePublic(x509EncodedKeySpec);
            //create cipher object
            Cipher cipher = Cipher.getInstance("RSA");
            //encrypt data
            cipher.init(Cipher.ENCRYPT_MODE, publicKeyObj);
            byte[] encryptedBytes = cipher.doFinal(data.getBytes());
            //convert encrypted data to string
            encryptedData = Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return encryptedData;
    }
    //Decrypt data using private key and base64
    public static String decrypt(String data) {
        String decryptedData = "";
        try {
            //read private key
            String privateKey = readPrivateKey();
            //convert private key to private key object
            byte[] privateKeyBytes = Base64.getDecoder().decode(privateKey);
            PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(privateKeyBytes);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PrivateKey privateKeyObj = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
            //create cipher object
            Cipher cipher = Cipher.getInstance("RSA");
            //decrypt data
            cipher.init(Cipher.DECRYPT_MODE, privateKeyObj);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(data));
            //convert decrypted data to string
            decryptedData = new String(decryptedBytes);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return decryptedData;
    }
    public static void main(String[] args) {
        SecurityRSA securityRSA = new SecurityRSA();
//        securityRSA.SecurityKeyPairGenerator();
    }
}


