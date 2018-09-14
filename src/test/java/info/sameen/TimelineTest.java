package info.sameen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sameen on 11/09/2018.
 */
public class TimelineTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void testPosting() {
        User alice = User.get("alice");
        Timeline aliceTimeline = alice.timeline();
        aliceTimeline.post(Message.createMessage("I love the weather today"));

        assertEquals("I love the weather today", aliceTimeline.lastMessage());
    }

    @Test
    public void testReading() {
        User alice = User.get("alice");
        Timeline aliceTimeline = alice.timeline();

        assertEquals("I love the weatehr today (5 mins ago)", aliceTimeline.lastMessage());
    }

}
