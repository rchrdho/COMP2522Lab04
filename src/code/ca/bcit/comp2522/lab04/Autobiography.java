package ca.bcit.comp2522.lab04;

public class Autobiography extends    Biography
                           implements Printable,
                                      Reversible
{
    public Autobiography(final String title,
                         final Author author,
                         final int    yearPublished)
    {
        super(title, author, yearPublished, author.getName().getFullName());
    }
}
