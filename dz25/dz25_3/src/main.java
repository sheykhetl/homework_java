import java.util.List;

public class main {
    public static void main(String[] args) {
        List.of(
                        "127.0.0.1",
                        "255.255.255.0",
                        "1300.6.7.8",
                        "abc.def.gha.bcd"
                ).stream().map(address_utils::isValid)
                .forEach(System.out::println);
    }
}