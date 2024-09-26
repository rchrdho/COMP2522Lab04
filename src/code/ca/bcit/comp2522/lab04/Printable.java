package ca.bcit.comp2522.lab04;

/**
 * The Printable interface enables an object to print relevant details
 * about itself.
 *
 * @author Bryson
 * @author Richard
 *
 * @version 1.0
 */
public interface Printable
{
    default void display()
    {

    /**
     * Prints a string of relevant details about the object.
     */
    void display();
}
