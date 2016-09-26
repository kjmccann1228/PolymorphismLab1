package io.zipcoder.pets;

import org.junit.Test;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class BoneVultureTest {
    @Test
    public void speakTest(){
        BoneVulture pet = new BoneVulture("Butterbean");
        String expected = "BLOOD FOR THE BLOOD GOD!";
        String actual = pet.speak();
        assertEquals(expected, actual);
    }
}
