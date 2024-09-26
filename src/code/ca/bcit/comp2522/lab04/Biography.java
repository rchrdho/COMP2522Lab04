package ca.bcit.comp2522.lab04;

/**
 *
 */
public class Biography extends Book
{
    private final String subject;

    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final String subject)
                     throws IllegalArgumentException
    {
        super(title, yearPublished, author);
        validateSubject(subject);
        this.subject = subject;
    }

    /*
    Checks to see if the subject is null or empty. Throws IllegalArgumentException if invalid.
     */
    private static void validateSubject(final String subject)
    {
        if (subject == null || subject.trim().isEmpty())
        {
            throw new IllegalArgumentException("Subject cannot be null or empty");
        }
    }

    @Override public boolean equals(final Object that)
    {
        if (that == null || that)
    }
}
