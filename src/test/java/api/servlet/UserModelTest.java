package api.servlet;

import api.model.User;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class UserModelTest {

    @Test
    public void testUserCreation() {
        User user = new User(1, "Test", "test@test.com");
        assertNotNull(user);
    }
}
