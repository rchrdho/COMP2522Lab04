package ca.bcit.comp2522.lab04;

/**
 * The Author class models a Person who is also an Author.
 * An Author has a specific genre they write in represented by a String instance field.
 *
 * @author Richard Ho
 * @author Bryson Lindy
 *
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    private final String genre;

    /**
     * Constructor for person class.
     *
     * @param name      a Name
     * @param birthDate a Date this person was born
     * @param deathDate a Date this person died
     */
    public Author(final Name name,
                  final Date birthDate,
                  final Date deathDate,
                  final String genre)
    {
        super(name, birthDate, deathDate);

        validateGenre(genre);
        this.genre = genre;
    }

    private static void validateGenre(final String genre)
                                      throws IllegalArgumentException
    {
        if (genre == null || genre.trim().isBlank())
        {
            throw new IllegalArgumentException("Genre cannot be null or empty");
        }
    }

    /**
     * Prints the instance data of this Author object in order of assignment
     */
    @Override
    public void display()
    {
        super.display();
        System.out.printf("Genre: %s\n", genre);
    }

    /**
     * Prints the instance data of this Author object in reverse order of assignment.
     */
    @Override
    public void backward()
    {
        System.out.printf("Genre: %s\n", genre);
        super.backward();
    }

    /**
     * Returns the genre of this Author object.
     *
     * @return Author writes this genre of Book.
     */
    public final String getGenre()
    {
        return this.genre;
    }
}
