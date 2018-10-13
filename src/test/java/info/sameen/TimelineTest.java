package info.sameen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sameen on 11/09/2018.
 */
public class TimelineTest {

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
    public void testSinglePostToTimeline() {
        alice.post("I love the weather today");
        Post aliceLastPost = alice.getLastPost();

        assertEquals("I love the weather today", aliceLastPost.getBody());
    }

    @Test
    public void testMultipleUsersPostToTimeline() {
        alice.post("I love the weather today");
        bob.post("Damn! We lost!");

        assertEquals("Damn! We lost!", bob.getLastPost().getBody());
    }

    @Test
    public void testLastPostFromTimeline() {
        bob.post("Damn! We lost!");
        bob.post("Good game though.");

        assertEquals("Good game though.", bob.getLastPost().getBody());
    }

    @Test
    public void testGetOlderPostFromTimeline() {
        bob.post("Damn! We lost!");
        bob.post("Good game though.");

        assertEquals("Damn! We lost!", bob.getTimeline().get(bob.getLastPostIndex()-1).getBody());
    }

    @Test
    public void testTimelineSize() {
        bob.post("Damn! We lost!");
        bob.post("Good game though.");

        assertEquals(2, bob.getTimeline().size());
    }

    @Test
    public void testAggregateSubscriptionTimelineSize() {
        alice.post("I love the weather today");
        User charlie = new User("Charlie");
        charlie.post("I'm in New York today! Anyone want to have a coffee?");
        charlie.follow(alice);

        assertEquals(2, charlie.wall().size());
    }

}
