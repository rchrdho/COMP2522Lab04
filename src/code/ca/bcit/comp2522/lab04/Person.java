package ca.bcit.comp2522.lab04;

import java.util.Objects;

/**
 * Provides the name, birthdate, and death date [can be null]
 * Will print out a String giving the person's name their status [alive/dead with full date], and their full birth date.
 * Is capable of converting the current month's integer into the given month's name
 *
 * @author Richard Ho
 * @author Jayden Hutchinson
 * @author Bryson Lindy
 *
 * @version 1.1
 */
abstract class Person implements Printable,
                                 Reversible,
                                 Comparable<Person>
{
    // instance variables
    private final Name name;
    private final Date birthDate;
    private final Date deathDate;

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
     * Displays the instance data of a Person object in order of assignment.
     */
    @Override
    public void display()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        sb.append(String.format("Name: %s\n", this.name.getFullName()));
        sb.append(String.format("Birth date: %s\n", this.birthDate));

        if(this.deathDate != null)
        {
            sb.append(String.format("Death date: %s\n", this.deathDate));
        }

        System.out.printf("%s", sb);
    }

    /**
     * Displays the instance data of a Person object is reverse order of assignment.
     */
    @Override
    public void backward()
    {
        final StringBuilder sb;

        sb = new StringBuilder();

        if(this.getDeathDate() != null)
        {
            sb.append(String.format("Death date: %s\n", this.deathDate));
        }
        sb.append(String.format("Birth date: %s\n", this.birthDate));
        sb.append(String.format("Name: %s\n", this.name.getFullName()));

        System.out.println(sb);
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
        return that.getBirthDate().getYear() - this.getBirthDate().getYear();
    }

    /**
     * Compares this {@code Person} to the specified object.
     *
     * <p>This method checks for total equality between this {@code Person}
     * and the provided object. Two {@code Person} objects are considered equal if
     * and only if all of the following conditions hold:
     * <ul>
     *     <li>The specified object is not {@code null}.</li>
     *     <li>The specified object is of the same class as this {@code Person}.</li>
     *     <li>The {@code name}, {@code birthDate}, and {@code deathDate} fields of both
     *     {@code Person} objects are equal.</li>
     * </ul>
     *
     * <p>For the {@code deathDate} field, if both {@code Person} objects have a
     * {@code null} value, they are considered equal for that field.
     *
     * @param that the object to compare this {@code Person} against
     * @return {@code true} if the given object represents a {@code Person}
     *         equivalent to this person, {@code false} otherwise
     * @see #hashCode()
     */
    @Override
    public boolean equals(final Object that)
    {
        if(that == null)
        {
            return false;
        }

        if(!(that instanceof Person))
        {
            return false;
        }

        if(this == that)
        {
            return true;
        }

        final Person thatPerson;

        thatPerson = (Person) that;

        return  this.getName().equals(thatPerson.getName()) &&
                this.getBirthDate().equals(thatPerson.getBirthDate()) &&
                (Objects.equals(this.getDeathDate(), thatPerson.getDeathDate()));
    }

    /**
     * Returns an int based on the same instance fields used in equals.
     * @return int hashcode made of Person name, birthday, death date
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(this.getName(),
                            this.getBirthDate(),
                            this.getDeathDate());
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
        return this.name;
    }

    /**
     * Accessor for Birthdate
     *
     * @return birthDate
     */
    public Date getBirthDate()
    {
        return this.birthDate;
    }

    /**
     * Accessor for Death date.
     *
     * @return deadDate
     */
    public Date getDeathDate()
    {
        return this.deathDate;
    }
}