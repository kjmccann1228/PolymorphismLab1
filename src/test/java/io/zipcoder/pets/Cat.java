package io.zipcoder.pets;

import org.junit.Test;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class Cat {
    @Test
    public void speakTest(){
        Cat pet = new Cat("Biscuit");
        String expected = "Meow";
        String actual = pet.speak();
        assertEquals(expected, actual);

    }
}
