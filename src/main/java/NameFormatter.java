public class NameFormatter {
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix) throws IllegalAccessException {

        if (prefix == null) {
            prefix = "";
        }
        if (firstName == null) {
            firstName = "";
        }
        if (middleName == null) {
            middleName = "";
        }
        if (lastName == null) {
            lastName = "";
        }
        if (suffix == null) {
            suffix = "";
        }


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
