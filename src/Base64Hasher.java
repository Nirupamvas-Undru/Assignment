public class Base64Hasher implements PasswordHasher, Decryptable{
    @Override
    public String hashPassword(String password) {
        return "Hashed with Base64";
    }

    @Override
    public String decodePasswordFromHash(String hash) {
        return "Decoded from Base64";
    }
}
