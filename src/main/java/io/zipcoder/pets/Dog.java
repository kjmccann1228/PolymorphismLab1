package io.zipcoder.pets;

/**
 * Created by kurtmccann on 9/26/16.
 */
public class Dog extends Pet
{
    public Dog(String name)
    {
        super(name);
    }

    public void Speak()
    {
        System.out.println("Woof");
    }
}
