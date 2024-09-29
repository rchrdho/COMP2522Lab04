package ca.bcit.comp2522.lab04;

/**
 * The {@code Autobiography} class represents an autobiography, which is a type of biography
 * where the author is also the subject. It extends the {@code Biography} class and implements
 * the {@code Printable} and {@code Reversible} interfaces to allow displaying details in forward
 * and reverse order.
 * <p>
 * The subject of an autobiography is automatically set to the author's full name.
 * </p>
 *
 * @author Richard Ho
 * @author Bryson Lindy
 *
 * @version 1.0
 */
public class Autobiography extends    Biography
                           implements Printable,
                                      Reversible
{

    /**
     * Constructs an {@code Autobiography} object with the specified title, author, and year of publication.
     * The subject of the autobiography is automatically set to the author's full name.
     *
     * @param title         the title of the autobiography (must be non-null, non-blank, and less than 100 characters)
     * @param author        the author of the autobiography (must be non-null, also the subject)
     * @param yearPublished the year the autobiography was published (must be between 868 and the current year)
     */
    public Autobiography(final String title,
                         final Author author,
                         final int    yearPublished)
    {
        super(title, author, yearPublished, author.getName().getFullName());
    }
}
