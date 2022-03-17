public class PasswordService
{
    private PasswordHasher passwordHasher;

    public PasswordService(PasswordHasher passwordHasher)
    {
        this.passwordHasher = passwordHasher;
    }

    void hashPassword(String password)
    {
        System.out.println(this.passwordHasher.hashPassword(password));
    }

    private Decryptable decryptable;

    public PasswordService(Decryptable decryptable)
    {
        this.decryptable = decryptable;
    }
    void decodePasswordFromHash(String hash){
        System.out.println(this.decryptable.decodePasswordFromHash(hash));
    }

    public static void main(String[] args) {
        //PasswordHasher passwordHasher = new Base64Hasher();
        //PasswordService passwordService = new PasswordService(passwordHasher);
        //passwordService.hashPassword("abcdde");


        //Hashing
        PasswordHasher passwordHasher = new MD5Hasher();
        PasswordService passwordService = new PasswordService(passwordHasher);
        passwordService.hashPassword("Nirupamvas");


        //Decryption
        Decryptable decryptable = new Base64Hasher();
        PasswordService passwordService1 = new PasswordService(decryptable);
        passwordService1.decodePasswordFromHash("Nirupamvas");

        //Save password
        PasswordSaver passwordSaver = new PasswordSaver();
        passwordSaver.savePassword();


        Base64 base64 = new Base64();
        base64.generateHash("abc");
        System.out.println(base64.hash);
    }
}