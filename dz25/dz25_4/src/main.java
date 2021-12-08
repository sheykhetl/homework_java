import java.util.List;

public class main {

    public static void main(String[] args) {
        List.of(
                        "()()()",
                        "((()))",
                        ")))(((",
                        "()()((",
                        "))))))"
                ).stream().map(expression_utils::isBracketsBalanced)
                .forEach(System.out::println);
    }

}