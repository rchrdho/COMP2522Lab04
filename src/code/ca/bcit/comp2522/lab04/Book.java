package ca.bcit.comp2522.lab04;

/**
 * @TODO validators for Data members
 */
public class Book implements Comparable<Book>,
                             Printable,
                             Reversible
{
    private static final int MAX_TITLE_LENGTH = 100;
    private static final int CURRENT_YEAR     = 2024;
    private static final int MIN_YEAR         = 868;

    private final String bookTitle;
    private final Author author;
    private final int    yearPublished;

    /**
     *
     * @param title
     * @param author
     * @param yearPublished
     */
    public Book(final String title,
                final Author author,
                final int    yearPublished)
                throws IllegalArgumentException
    {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.bookTitle      = title;
        this.author         = author;
        this.yearPublished  = yearPublished;
    }

    private void validateTitle(final String title)
    {
        if (title == null || title.isBlank() || title.length() >= MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title entry");
        }
    }

    private void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Invalid author entry");
        }
    }

    private void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR || yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year, outside of range");
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
    public boolean equals(final Object that)
    {
        if (!(that instanceof Book))
        {
            return false;
        }

        if (this == that)
        {
            return true;
        }

        final Book thatBook;

        thatBook = (Book) that;

        return this.bookTitle.equals(thatBook.bookTitle) &&
                this.yearPublished == thatBook.yearPublished &&
                this.author.equals(thatBook.author);
    }

    /**
     * Compares this book's publish year to that book's publish year.
     *
     * @param that the object to be compared.
     * @return +int when this is older than that
     *         0 when this is the same age as that
     *         -int when this is younger than that
     */
    @Override
    public int compareTo(final Book that)
    {
        return this.getYearPublished() - that.getYearPublished();
    }

    @Override
    public void display()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(this.getBookTitle()).append("\n");
        bob.append(this.getAuthor()).append("\n");
        bob.append(this.getYearPublished()).append("\n");

        System.out.println(bob);
    }

    @Override
    public void backward()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(this.getYearPublished()).append("\n");
        bob.append(this.getAuthor()).append("\n");
        bob.append(this.getBookTitle()).append("\n");

        System.out.println(bob);
    }

}
