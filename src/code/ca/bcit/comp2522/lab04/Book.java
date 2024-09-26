package ca.bcit.comp2522.lab04;

/**
 * @TODO validators for Data members
 */
public class Book implements Comparable<Book>,
                             Printable,
                             Reversible
{
    private static final int MAX_TITLE_CHARS = 100;
    private static final int CURRENT_YEAR    = 2024;
    private static final int MIN_YEAR        = 1;

    private final String bookTitle;
    private final int    yearPublished;
    private final Author author;

    public Book(final String title,
                final int    yearPublished,
                final Author author)
    {
        validateTitle(title);
        validateAuthor(author);

        this.bookTitle      = title;
        this.yearPublished  = yearPublished;
        this.author         = author;
    }

    private void validateTitle(final String title)
    {
        if (title == null || title.isBlank() || title.length() >= MAX_TITLE_CHARS)
        {
            throw new IllegalArgumentException("Invalid title entry");
        }
    }

    private void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR || yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year, outside of range");
        }
    }

    private void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Invalid author entry");
        }
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public Author getAuthor() {
        return author;
    }
}
