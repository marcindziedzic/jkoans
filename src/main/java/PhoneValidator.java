public class PhoneValidator {

    /*
        Phone number 1234567890 validation result: true
        Phone number 123-456-7890 validation result: true
        Phone number 123-456-7890 x1234 validation result: true
        Phone number 123-456-7890 ext1234 validation result: true
        Phone number (123)-456-7890 validation result: true
        Phone number 123.456.7890 validation result: true
        Phone number 123 456 7890 validation result: true
     */
    private static boolean validatePhoneNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) return true;
            //validating phone number with -, . or spaces
        else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
            //validating phone number with extension length from 3 to 5
        else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
            //validating phone number where area code is in braces ()
        else if (phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
            //return false if nothing matches the input
        else return false;
    }

}
