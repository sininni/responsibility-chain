package builder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        User user = User.builder()
                .firstName("Hanna")
                .occupation("UCU")
                .occupation("killer")
                .lastName("Prah")
                .age(71)
                .build();

        assertEquals(user.toString(), "User(firstName=Hanna, lastName=Prah, occupations=[UCU, killer], gender=null, age=71, weight=0.0)");
    }

    @Test
    void testToString2() {
        List<String> jobs = new ArrayList<>();
        jobs.add("UCU");
        jobs.add("killer");
        User user2 = User.builder()
                .firstName("Hanna")
                .occupations(jobs)
                .lastName("Prah")
                .age(71)
                .build();

        assertEquals(user2.toString(), "User(firstName=Hanna, lastName=Prah, occupations=[UCU, killer], gender=null, age=71, weight=0.0)");
    }
}