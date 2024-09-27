package ca.bcit.comp2522.lab04;

/**
 *
 */
public class Biography extends Book
{
    private final String subject;

    public Biography(final String title,
                     final int    yearPublished,
                     final Author author,
                     final String subject)
                     throws IllegalArgumentException
    {
        super(title, yearPublished, author);
        validateSubject(subject);
        this.subject = subject;
    }

    /*
    Checks to see if the subject is null or empty. Throws Il
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
     * Two Biographies are equal if they have the same subject.
     * @param that Biography being compared to this
     * @return true if equals, false if not
     */
    @Override
    public boolean equals(final Object that)
    {
        if (that == null || !(that instanceof Biography))
        {
            return false;
        }

        return this.getSubject().equals(((Biography) that).getSubject());
    }
}
