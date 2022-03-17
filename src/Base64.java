public class Base64 extends Hashed
{
    public Base64()
    {
        this.passwordHasher = new Base64Hasher();
    }
}
