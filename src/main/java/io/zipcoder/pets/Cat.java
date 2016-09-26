package io.zipcoder.pets;

/**
 * Created by kurtmccann on 9/26/16.
 */
public class Cat extends Pet
{
    public Cat(String name)
    {
        super(name);
    }

    public void speak()
    {
        System.out.println("Meow");
    }
}
