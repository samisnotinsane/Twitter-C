package info.sameen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sameen on 11/09/2018.
 */
public class User {

    private String name;
    private List<User> following;
    private List<Post> timeline;
    private int lastPostIndex;

    public User(String name) {
        this.name = name;
        this.following = new ArrayList<>();
        this.timeline = new ArrayList<>();
        this.lastPostIndex = -1;
    }

    public String getName() {
        return name;
    }

    public List<User> getFollowing() {
        return following;
    }

    public List<Post> getTimeline() {
        return timeline;
    }

    public int getLastPostIndex() {
        return lastPostIndex;
    }

    public void post(String body) {
        Post p = new Post(this, body);
        timeline.add(p);
        lastPostIndex++;
    }

    public Post getLastPost() {
        return this.timeline.get(this.lastPostIndex);
    }

    public void follow(User toFollow) {
        this.following.add(toFollow);
    }

    public boolean isFollowing(User user) {
        for (User connection : this.following) {
            if (connection.equals(user)) {
                return true;
            }
        }
        return false;
    }
}
