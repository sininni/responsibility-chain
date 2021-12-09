package builder;

public class Main {
    User user = User.builder()
            .firstName("Anna")
            .lastName("Zymna")
            .age(61)
            .occupation("killer")
            .occupation("actor")
            .build();
}
