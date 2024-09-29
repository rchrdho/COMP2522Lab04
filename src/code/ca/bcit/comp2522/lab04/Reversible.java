package ca.bcit.comp2522.lab04;

/**
 * The Reversible interface is a specialized version of the Printable interface.
 * It prints the details of Printable in reverse.
 *
 * @author Bryson Lindy
 * @author Richard Ho
 *
 * @version 1.0
 */
public interface Reversible extends Printable
{
    /**
     * Reverses the order of the details printed by Printable interface method display()
     */
    void backward();
}
