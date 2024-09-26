package ca.bcit.comp2522.lab04;

/**
 *
 *
 */
public class Author extends Person
{

    /**
     * Constructor for person class.
     *
     * @param name      a Name
     * @param birthDate a Date this person was born
     * @param deathDate a Date this person died
     */
    public Author(Name name,
                  Date birthDate,
                  Date deathDate) {

        super(name, birthDate, deathDate);
    }
}
