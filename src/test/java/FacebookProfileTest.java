
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;

public class FacebookProfileTest {


    @Test
    public void testRetrieveFriends_Positive() {
        FacebookProfile retriever = new FacebookProfile();
        String[] expected = {"Profile1", "Profile2", "Profile3"};
        String[] actual = retriever.getFriends("facebook.com/joel.hellstrom.7/");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRetrieveFriends_EmptyInput() {
        FacebookProfile retriever = new FacebookProfile();
        String[] expected = {};
        String[] actual = retriever.getFriends("");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRetrieveFriends_NullInput() {
        FacebookProfile retriever = new FacebookProfile();
        String[] expected = {};
        String[] actual = retriever.getFriends(null);
        assertArrayEquals(expected, actual);
    }
}
