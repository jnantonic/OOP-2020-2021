package ie.tudublin;

public class Main
{
    public void catsAndDogs()
    {
        System.out.println("Hello world");

        // Polymorphism - We use the type as a base class but the instance is one of the subclasses of the base class 
        Animal misty = new Dog("Misty");  // That's why we can say misty = Animal because both are animals 

        Animal topCat = new Cat("TopCat");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 

        Cat ginger = new Cat("Ginger");  // pass ginger string to the cat 
        while(ginger.getNumLives() > 0)
        {
            ginger.kill(); 
        }
        ginger.kill(); // print i am dead
    }

    public void helloProcessing1()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing1());
    }

    public void helloProcessing2()
    {
        String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing2());
    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.helloProcessing2();
    }
} 