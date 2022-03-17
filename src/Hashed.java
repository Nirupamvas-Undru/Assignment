public abstract class Hashed
{
    PasswordHasher passwordHasher;
    String hash;

    public void generateHash(String password)
    {
        hash = passwordHasher.hashPassword(password);
    }
}
