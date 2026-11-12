public class NameFormatter {
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) throws IllegalAccessException {

        if (lastName.isEmpty()) {
            throw new IllegalAccessException("You must provide a last name");
        }

        if (firstName.isEmpty()) {
            throw new IllegalAccessException("You must provide a last name");
        }

        String result = "";
        result += lastName + ", ";

        if (!prefix.isEmpty()) {
            result += prefix + " ";
        }

        result += firstName;

    }

}
