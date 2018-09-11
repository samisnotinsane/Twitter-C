package info.sameen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sameen on 11/09/2018.
 */
public class PostTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testWithMessage() {
        Post p = new Post();
        p.setMessage("Hello World!");

        assertEquals("Hello World!", p.getMessage());
    }

    @Test
    public void testUser() {


    }

}
