import java.util.Arrays;
import java.util.stream.Collectors;

public class E_59df2f8f08c6cec835000012 {
    static class Meeting {

        public static String meeting(String s) {
            return Arrays
                .stream(s.split(";"))
                .map(String::toUpperCase)
                .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
                .sorted()
                .collect(Collectors.joining());
        }
    }

    public static void main(String[] args) {
        System.out.println(Meeting.meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill"));
    }
}
