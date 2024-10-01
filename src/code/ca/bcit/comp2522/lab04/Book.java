package ca.bcit.comp2522.lab04;

import java.util.Objects;

/**
 * The {@code Book} class represents a book with a title, author, and year of publication.
 * This class implements {@code Comparable<Book>} to allow comparison based on the year of publication,
 * {@code Printable} to enable displaying book details, and {@code Reversible} to allow
 * displaying the details in reverse order.
 * <p>
 * The class ensures that the title, author, and year are validated before creation.
 * </p>
 *
 * @author  Richard Ho
 * @author  Bryson Lindy
 *
 * @version 1.0
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
     * Constructs a {@code Book} object with the specified title, author, and year of publication.
     * This constructor validates the inputs before assigning the values.
     *
     * @param title         the title of the book (must be non-null, non-blank, and less than 100 characters)
     * @param author        the author of the book (must be non-null)
     * @param yearPublished the year the book was published (must be between 868 and the current year)
     * @throws IllegalArgumentException if any of the validation checks fail
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

    /**
     * Validates the title of the book.
     * The title must not be null, blank, or exceed the maximum allowed length.
     *
     * @param title the title to be validated
     * @throws IllegalArgumentException if the title is invalid
     */
    private void validateTitle(final String title)
    {
        if (title == null || title.isBlank() || title.length() >= MAX_TITLE_LENGTH)
        {
            throw new IllegalArgumentException("Invalid title entry");
        }
    }

    /**
     * Validates the author of the book.
     * The author must not be null.
     *
     * @param author the author to be validated
     * @throws IllegalArgumentException if the author is null
     */
    private void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Invalid author entry");
        }
    }

    /**
     * Validates the year of publication.
     * The year must be between 868 and the current year.
     *
     * @param yearPublished the year to be validated
     * @throws IllegalArgumentException if the year is outside the valid range
     */
    private void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR || yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year, outside of range");
        }
    }

    /**
     * Returns the title of this book.
     *
     * @return the title of the book
     */
    public String getBookTitle()
    {
        return bookTitle;
    }

    /**
     * Returns the year this book was published.
     *
     * @return the year of publication
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Returns the author of this book.
     *
     * @return the author of the book
     */
    public Author getAuthor()
    {
        return author;
    }

    /**
     * Checks if this book is equal to another object.
     * Two books are considered equal if they have the same title, author, and year of publication.
     *
     * @param that          the object to be compared for equality
     * @return {@code true} if the given object is a {@code Book} with the same title, author, and year;
     * {@code false} otherwise
     */
    @Override
    public boolean equals(final Object that)
    {
        if (that == null)
        {
            return false;
        }

        if (this == that)
        {
            return true;
        }

        if (that instanceof Book)
        {
            final Book thatBook;

            thatBook = (Book) that;

            return this.getBookTitle().equals(thatBook.getBookTitle()) &&
                    this.getYearPublished() == thatBook.getYearPublished() &&
                    this.getAuthor().equals(thatBook.getAuthor());
        }

        return false;
    }

    /**
     * Returns an int based on the same instance fields used in equals.
     * @return int hashcode made of Book title, year published, author name.
     */
    @Override
    public int hashCode()
    {
        return Objects.hash(this.getBookTitle(),
                            this.getYearPublished(),
                            this.getAuthor());
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
        return that.getYearPublished() - this.getYearPublished();
    }

    /**
     * Displays the details of the book in the following order: title, author, and year of publication.
     * This method implements the {@code Printable} interface.
     */
    @Override
    public void display()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(this.getBookTitle()).append("\n");
        bob.append(this.getAuthor().getName().getFullName()).append("\n");
        bob.append(this.getYearPublished()).append("\n");

        System.out.println(bob);
    }

    /**
     * Displays the details of the book in reverse order: year of publication, author, and title.
     * This method implements the {@code Reversible} interface.
     */
    @Override
    public void backward()
    {
        final StringBuilder bob;

        bob = new StringBuilder();

        bob.append(this.getYearPublished()).append("\n");
        bob.append(this.getAuthor().getName().getFullName()).append("\n");
        bob.append(this.getBookTitle()).append("\n");

        System.out.println(bob);
    }

}
