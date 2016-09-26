package io.zipcoder.pets;

import java.util.*;

/**
 * Created by kurtmccann on 9/26/16.
 */
public class PetRegister
{
    private int totalPets;
    private Map petList;

    public PetRegister(int numPets)
    {
        this.totalPets = numPets;
        petList = new HashMap<String, String>();
    }

    public int getTotalPets()
    {
        return this.totalPets;
    }

    public void addPet(String name, String type)
    {
        petList.put(name, type);
    }

    public int getNumberOfPetsCurrentlyInList()
    {
        return this.petList.size();
    }
}
