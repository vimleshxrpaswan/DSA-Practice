package java15feature;








import java.lang.*;

sealed class Human permits  Manish, Vartika, Vimlesh
{
    public void printName()
    {
        System.out.println("Default");
    }
}

non-sealed class Manish extends Human
{
    public void printName()
    {
        System.out.println("Manish Sharma");
    }
}

non-sealed class Vartika extends Human
{
    public void printName()
    {
        System.out.println("Vartika Dadheech");
    }
}

final class Vimlesh extends Human
{
    public void printName()
    {
        System.out.println("Anjali Sharma");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Human h1 = new Vimlesh();
        Human h2 = new Vartika();
        Human h3 = new Manish();

        h1.printName();
        h2.printName();
        h3.printName();
    }
}

