public class Test13 {

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    static int numberOfLetters(Days day) {
        return switch (day) {
            case SUNDAY, MONDAY, FRIDAY -> 6;
            case TUESDAY -> 7;
            case THURSDAY, SATURDAY -> 8;
            case WEDNESDAY -> 9;
        };
    }

    static int fooBar(String s) {
        return switch (s) {
            case "Foo" -> 1;
            case "Bar" -> 2;
            default -> {
                System.out.println("Strange");
                yield 0;
            }
        };
    }


    public static void main(String[] args) {
        var multiLines = """
        Text blocks
        With new lines
                With new lines
            """;
        System.out.println(multiLines);
        System.out.println("FRIDAY: " + numberOfLetters(Days.FRIDAY));
        System.out.println("WEDNESDAY: " + numberOfLetters(Days.WEDNESDAY));
        System.out.println("THURSDAY: " + numberOfLetters(Days.THURSDAY));
        System.out.println("Foo: " + fooBar("Foo"));
        System.out.println("Bar: " + fooBar("Bar"));
        System.out.println("FooBar: " + fooBar("FooBar"));
    }
}
