public class main {

    public static void main(String[] args) {
        System.out.println(
                address.parseWithSplit("USA, New-England, Portland, NE-Gilsan, 608, 1, 30b", ",")
        );
        System.out.println(
                address.parseWithStringTokenizer("USA, New-England, Portland, NE-Gilsan, 608, 1, 30b", ",")
        );
    }

}