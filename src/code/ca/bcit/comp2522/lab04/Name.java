package ca.bcit.comp2522.lab04;

/**
 * Name class.
 * must not be null or blank,
 * cannot be more than MAX_NAME_LENGTH_CHARS characters.
 * <p>
 * Contains methods that will return the initials, full name and reverse
 * the name input.
 *
 * @author  Richard Ho
 * @author  Jayden Hutchinson
 * @author  Bryson Lindy
 *
 * @version 2.0
 */
public class Name implements Printable,
                             Reversible
{
    // instance variables
    private final String first;
    private final String last;

    // symbolic constants
    private static final int    MAX_NAME_LENGTH_CHARS = 50;
    private static final int    FIRST_CHAR            = 0;
    private static final int    SECOND_CHAR           = 1;
    private static final String ILLEGAL_STRING        = "admin";

    /**
     * Constructor for the Name class.
     *
     * @param first String that takes first name
     * @param last  String that takes last name
     *
     * @throws IllegalArgumentException first or last name is null, blank, or less than MAX_NAME_LENGTH_CHARS
     */
    public Name(final String first,
                final String last)
    {
        // validate Inputs
        validateFirstName(first);
        validateLastName(last);

        // assign Variables
        this.first = first;
        this.last  = last;
    }

    /*
     * Validator method to check if firstname is within MAX_NAME_LENGTH_CHARS, does not include
     * "admin" at any point, null or blank
     */
    private static void validateFirstName(final String firstName)
    {
        // if firstName is null, blank, or less than maximum length, throw exception
        if(firstName == null ||
                firstName.isBlank() ||
                firstName.length() > MAX_NAME_LENGTH_CHARS ||
                firstName.equalsIgnoreCase(ILLEGAL_STRING))
        {
            throw new IllegalArgumentException("Invalid first name entry");
        }
    }

    /*
     * Validator method to check if lastname is within MAX_NAME_LENGTH_CHARS characters, does not include
     * "admin" at any point, null, or blank
     */
    private static void validateLastName(final String lastName)
    {
        // if lastName is null, blank, or less than MAX_NAME_LENGTH_CHARS, throw exception
        if(lastName == null ||
                       lastName.isBlank() ||
                       lastName.length() > MAX_NAME_LENGTH_CHARS ||
                       lastName.equalsIgnoreCase(ILLEGAL_STRING))
        {
            throw new IllegalArgumentException("Invalid last name entry");
        }
    }

    /**
     * Accessor for first name.
     *
     * @return first name
     */
    public String getFirst()
    {
        return first;
    }

    /**
     * Accessor for last name.
     *
     * @return last name
     */
    public String getLast()
    {
        return last;
    }

    /**
     * Accessor for full name.
     *
     * @return full name
     */
    public String getFullName()
    {
        return first + " " + last;
    }

    /**
     * Converts the first and last name to their initials capitalized.
     *
     * @return initials a String
     */
    public String getInitials()
    {
        // initials string builder initialization
        final StringBuilder initials;
        initials = new StringBuilder();

        initials.append(first.toUpperCase().charAt(FIRST_CHAR));// append Capital First Initial
        initials.append("."); // append period
        initials.append(last.toUpperCase().charAt(FIRST_CHAR)); // append Capital Last Initial
        initials.append("."); // append period

        return initials.toString(); // return initials
    }

    /**
     * Prints the first and last names.
     */
    @Override
    public void display()
    {
        System.out.printf("%s %s", this.first,
                                   this.last);
    }

    /**
     * Prints the first and last name in reverse.
     */
    @Override
    public void backward()
    {
        System.out.printf("%s %s", this.last,
                                   this.first);
    }
}