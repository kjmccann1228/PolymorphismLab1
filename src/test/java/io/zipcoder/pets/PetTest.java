package io.zipcoder.pets;

import org.junit.Test;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class PetTest {

    @Test
    public void speakTest(){
        Pet pet = new Pet("Butterbean");
        String expected = "Every moment I live is agony";
        String actual = pet.speak();
        assertEquals(expected, actual);

    }




}
