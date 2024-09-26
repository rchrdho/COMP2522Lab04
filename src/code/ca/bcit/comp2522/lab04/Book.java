package ca.bcit.comp2522.lab04;

/**
 *
 */
public class Book implements Comparable<Book>,
                             Printable,
                             Reversible
{
    private final String bookTitle;
    private final int    yearPublished;
    private final Author author;

    public Book(final String title,
                final int    yearPublished,
                final Author author)
    {
        this.bookTitle = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    private void isValidTitle(final String title)
    {

    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
