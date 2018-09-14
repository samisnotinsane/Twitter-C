package info.sameen;

/**
 * Created by sameen on 11/09/2018.
 */
public class User {

    /**
     * Returns a <code>User</code> if it exists,
     * <code>null</code> otherwise.
     *
     * @param username
     * @return
     */
    public static User get(String username) {
        return null;
    }

    /**
     * Returns the <code>Timeline</code> of this <code>User</code>.
     *
     * @return
     */
    public Timeline timeline() {
        return null;
    }

    /**
     * Subscribes this <code>User</code> to the given
     * <code>User</code>.
     *
     * @param toFollow the <code>User</code> which should be followed
     */
    public void follow(User toFollow) {

    }

    /**
     * Checks that the given <code>User</code> is being followed by
     * this <code>User</code>.
     *
     * @param user
     * @return <code>true</code> if subscribed to given user
     */
    public boolean isFollowing(User user) {
        return false;
    }
}
