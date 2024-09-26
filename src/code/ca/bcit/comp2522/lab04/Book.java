package ca.bcit.comp2522.lab04;

import static org.apache.commons.lang3.StringUtils.reverse;

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
    private final Author author;
    private final int    yearPublished;

    /**
     *
     * @param title
     * @param yearPublished
     * @param author
     */
    public Book(final String title,
                final int    yearPublished,
                final Author author)
    {
        validateTitle(title);
        validateYearPublished(yearPublished);
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

    public String getBookTitle()
    {
        return bookTitle;
    }

    public int getYearPublished()
    {
        return yearPublished;
    }

    public Author getAuthor()
    {
        return author;
    }

    @Override
    public int compareTo(final Book that)
    {
        if (this.yearPublished < that.yearPublished)
        {
            return 1;
        }

        if (this.yearPublished > that.yearPublished)
        {
            return -1;
        }

        return 0;
    }

    @Override
    public void display()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(bookTitle + "\n");
        bob.append(author + "\n");
        bob.append(yearPublished + "\n");

        System.out.println(bob);
    }

    @Override
    public void backward()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(reverse(bookTitle));

        System.out.println(bob);
    }

}
