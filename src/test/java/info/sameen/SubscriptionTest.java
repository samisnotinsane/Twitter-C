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

    User alice;
    User bob;

    @Before
    public void setUp() {
        alice = new User("Alice");
        bob = new User("Bob");
    }

    @After
    public void tearDown() {
        alice = null;
        bob = null;
    }

    @Test
    public void testFollow() {
        User charlie = new User("Charlie");
        charlie.follow(alice);

        assertEquals(true, charlie.isFollowing(alice));
    }

    @Test
    public void testFollowOtherDirection() {
        User charlie = new User("Charlie");
        charlie.follow(alice);

        assertEquals(false, alice.isFollowing(charlie));
    }

}
