public class Test13 {

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public int numberOfLetters(Days day) {
        return switch (day) {
            case SUNDAY, MONDAY, FRIDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }


    public static void main(String[] args) {
        System.out.println("""
        Text blocks
        With new lines
            """);

        System.out.println(new Test13().numberOfLetters(Days.FRIDAY));
        System.out.println(new Test13().numberOfLetters(Days.WEDNESDAY));
        System.out.println(new Test13().numberOfLetters(Days.THURSDAY));
    }
}
