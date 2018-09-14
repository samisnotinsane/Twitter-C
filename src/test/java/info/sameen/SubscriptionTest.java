package info.sameen;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sameen on 14/09/2018.
 */
public class SubscriptionTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testFollow() {
        User charlie = User.get("charlie");
        charlie.follow(User.get("alice"));

        assertEquals(true, charlie.isFollowing(User.get("alice")));
    }

}
