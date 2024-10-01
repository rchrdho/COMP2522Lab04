package ca.bcit.comp2522.lab04;

/**
 * The {@code Biography} class represents a biography, which is a specific type of book that
 * focuses on the life of a particular subject. It extends the {@code Book} class and adds a subject field.
 * <p>
 * This class validates the subject to ensure it is non-null and non-empty.
 * </p>
 *
 * @author Richard Ho
 * @author Bryson Lindy
 *
 * @version 1.0
 */
public class Biography extends Book
{
    private final String subject;

    /**
     * Constructs a {@code Biography} object with the specified title, author, year of publication, and subject.
     *
     * @param title                     the title of the biography (must be non-null, non-blank, and less than 100 characters)
     * @param author                    the author of the biography (must be non-null)
     * @param yearPublished             the year the biography was published (must be between 868 and the current year)
     * @param subject                   the subject of the biography (must be non-null and non-empty)
     * @throws IllegalArgumentException if any of the validation checks fail
     */
    public Biography(final String title,
                     final Author author,
                     final int    yearPublished,
                     final String subject)
                     throws IllegalArgumentException
    {
        super(title, author, yearPublished);

        validateSubject(subject);
        this.subject = subject;
    }

    /**
     * Validates the subject of the biography.
     * The subject must not be null or empty.
     *
     * @param subject                   the subject of the biography
     * @throws IllegalArgumentException if the subject is null or empty
     */
    private static void validateSubject(final String subject)
    {
        if (subject == null || subject.trim().isEmpty())
        {
            throw new IllegalArgumentException("Subject cannot be null or empty");
        }
    }

    /**
     * Returns the subject of this object.
     * @return subject of this object
     */
    public String getSubject()
    {
        return this.subject;
    }

    /**
     * Compares this biography to another object for equality.
     * Two biographies are considered equal if they have the same subject.
     *
     * @param that           the object to be compared for equality
     * @return {@code true}  if the specified object is a {@code Biography} with the same subject,
     * {@code false} otherwise
     */
    @Override
    public boolean equals(final Object that)
    {
        if (that == null)
        {
            return false;
        }

        if (!(that instanceof Biography))
        {
            return false;
        }

        if (that == this)
        {
            return true;
        }

        final Biography thatBio;
        thatBio = (Biography) that;

        return this.getSubject().equals(thatBio.getSubject());
    }

    /**
     * Returns an int based on the same instance fields used in equals.
     * @return int hashcode made of Biography's subject
     */
    @Override
    public int hashCode()
    {
        return this.getSubject().hashCode();
    }
}
