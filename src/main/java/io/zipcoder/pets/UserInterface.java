package io.zipcoder.pets;
import java.util.*;
/**
 * Created by kurtmccann on 9/26/16.
 */
public class UserInterface
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        PetRegister reg = new PetRegister(in.nextInt());
        while(reg.getNumberOfPetsCurrentlyInList() < reg.getTotalPets())
        {
            System.out.println("You have added " + reg.getNumberOfPetsCurrentlyInList() + " pets so far.");
            System.out.println("What is the next pet's name?");
            String name = in.next();
            in.nextLine();
            System.out.println("What type of pet is " +name + "?");
            String type = in.next();
            in.nextLine();
            reg.addPet(name, type);
        }
        System.out.println("Thanks for adding your pets, you're done now.");
    }
}
