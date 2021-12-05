import java.util.LinkedList;

public class two {

    public static void main(String[] args) {

        String str1 = new String("добрый день");
        String str2 = new String("сегодня в москве 8 градусов тепла");
        String str3 = new String("облачно с прояснениями");
        String str4 = new String("хорошего дня!");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println(earlBio);

    }
}