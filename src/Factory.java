public class Factory
{
    public static Animal CreateLion(String name)
    {
        Animal l = new Lion(name);
        return l;

    }
    public static Animal CreateTiger(String name)
    {
        Animal t = new Tiger(name);
        return t;

    }
    public static Animal CreateZebra(String name)
    {
        Animal z = new Zebra(name);
        return z;

    }
    public static Animal CreateGazelle(String name)
    {
        Animal g = new Gazelle(name);
        return g;

    }
}
