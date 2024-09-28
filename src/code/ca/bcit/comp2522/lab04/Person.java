package ca.bcit.comp2522.lab04;

/**
 * Provides the name, birthdate, and death date [can be null]
 * Will print out a String giving the person's name their status [alive/dead with full date], and their full birth date.
 * Is capable of converting the current month's integer into the given month's name
 *
 * @author Richard Ho
 * @author Jayden Hutchinson
 * @author Bryson Lindy
 * @version 1.1
 */
abstract class Person implements Printable, Reversible, Comparable<Person>
{
    // instance variables
    private final Name name;
    private final Date birthDate;
    private final Date deathDate;

    // symbolic constants
    private static final String ALIVE_STATUS = "alive";
    private static final String DEATH_STATUS = "died";

    // integer values of each month of the year
    private static final int JANUARY   = 1;
    private static final int FEBRUARY  = 2;
    private static final int MARCH     = 3;
    private static final int APRIL     = 4;
    private static final int MAY       = 5;
    private static final int JUNE      = 6;
    private static final int JULY      = 7;
    private static final int AUGUST    = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER   = 10;
    private static final int NOVEMBER  = 11;
    private static final int DECEMBER  = 12;

    /**
     * Constructor for person class.
     *
     * @param name      a Name
     * @param birthDate a Date this person was born
     * @param deathDate a Date this person died
     */
    public Person(final Name name,
                  final Date birthDate,
                  final Date deathDate)
    {
        this.name      = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    /**
     * Gets the details of the client formatted.
     * Will provide it as NAME + STATUS [alive/dead with full date] + was born on + DAY(name), MONTH DAY(integer) +
     * YEAR
     *
     * @return Full Name (alive/died + date) was born DAY, MONTH DATE, YEAR
     */
    public String getDetails()
    {
        // Builds a string based on whether the person is alive or dead
        // Either alive, or dead, in which case it will provide the DAY(name), MONTH DAY(integer), YEAR
        final String status;
        status = (deathDate == null) ? ALIVE_STATUS : DEATH_STATUS + " " + deathDate.getDayOfTheWeek() + ", "
                + this.getMonthName(deathDate.getMonth()) + " " + deathDate.getDay() + ", " + deathDate.getYear();

        // Concatenates the person's current dead or alive status with the person's birth date
        return String.format("%s (%s) was born on %s, %s %02d, %d", name.getFullName(), status,
                             birthDate.getDayOfTheWeek(), getMonthName(birthDate.getMonth()), birthDate.getDay(), birthDate.getYear());
    }

    /**
     * Displays the instance data of a Person object in order of assignment.
     */
    @Override
    public void display()
    {
        System.out.printf("Name: %s\n", this.getName());
        System.out.printf("Birth date: %s\n", this.getBirthDate());
        if (this.getDeathDate() != null)
        {
            System.out.printf("Death date: %s\n", this.getDeathDate());
        }
    }

    /**
     * Displays the instance data of a Person object is reverse order of assignment.
     */
    @Override
    public void backward()
    {
        if (this.getDeathDate() != null)
        {
            System.out.printf("Death date: %s\n", this.getDeathDate());
        }
        System.out.printf("Birth date: %s\n", this.getBirthDate());
        System.out.printf("Name: %s\n", this.getName());
    }

    /**
     * Compares this Person to that Person
     * @param that the object to be compared.
     * @return +int when this is older than that
     *         0 when this is the same age as that
     *         -int when this is younger than that
     */
    @Override
    public int compareTo(final Person that)
    {
        return this.getBirthDate().getYear() - that.getBirthDate().getYear();
    }

    /**
     * Given the integer representation of the month in the year, gives the name of said month
     *
     * @param month integer of what month in the year it is
     *
     * @return The name of the current month integer given
     */
    public String getMonthName(int month)
    {
        // returns the month in the year given the integer of the current month
        switch(month)
        {
            case JANUARY:
                return "January";
            case FEBRUARY:
                return "February";
            case MARCH:
                return "March";
            case APRIL:
                return "April";
            case MAY:
                return "May";
            case JUNE:
                return "June";
            case JULY:
                return "July";
            case AUGUST:
                return "August";
            case SEPTEMBER:
                return "September";
            case OCTOBER:
                return "October";
            case NOVEMBER:
                return "November";
            case DECEMBER:
                return "December";
            default:
                return "Unknown";
        }
    }

    /**
     * Accessor for Name.
     *
     * @return name
     */
    public Name getName()
    {
        return name;
    }

    /**
     * Accessor for Birthdate
     *
     * @return birthDate
     */
    public Date getBirthDate()
    {
        return birthDate;
    }

    /**
     * Accessor for Death date.
     *
     * @return deadDate
     */
    public Date getDeathDate()
    {
        return deathDate;
    }
}