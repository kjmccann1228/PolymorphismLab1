package io.zipcoder.pets;

import org.junit.Test;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class Dog {
    @Test
    public void speakTest(){
        Dog pet = new Dog("Baxter");
        String expected = "Woof";
        String actual = pet.speak();
        assertEquals(expected, actual);

    }
}
