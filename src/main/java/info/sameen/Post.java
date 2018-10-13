package info.sameen;

import java.time.LocalDateTime;

/**
 * Created by sameen on 11/09/2018.
 */
public class Post {

    private String body;
    private LocalDateTime dateTimePublished;
    private User owner;

    public Post(User owner, String body) {
        this.body = body;
        this.owner = owner;
        this.dateTimePublished = LocalDateTime.now();
    }

    public String getBody() {
        return body;
    }

    public User getOwner() {
        return owner;
    }

    public LocalDateTime getDateTimePublished() {
        return dateTimePublished;
    }
}
