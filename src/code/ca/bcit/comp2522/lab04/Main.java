package ca.bcit.comp2522.lab04;

public class Main
{
    public static void main(final String[] args)
    {
        Name orwellName;
        Name leeName;
        Name austenName;
        Name fitzgeraldName;
        Name melvilleName;
        Name caroName;
        Name isaacsonName;
        Name gilbertName;
        Name chernowName;
        Name frankName;
        Name mandelaName;
        Name gandhiName;
        Name angelouName;
        Name xName;

        Date orwellBirthDate;
        Date orwellDeathDate;
        Date leeBirthDate;
        Date leeDeathDate;
        Date austenBirthDate;
        Date austenDeathDate;
        Date fitzgeraldBirthDate;
        Date fitzgeraldDeathDate;
        Date melvilleBirthDate;
        Date melvilleDeathDate;
        Date caroBirthDate;
        Date caroDeathDate;
        Date isaacsonBirthDate;
        Date isaacsonDeathDate;
        Date gilbertBirthDate;
        Date gilbertDeathDate;
        Date chernowBirthDate;
        Date chernowDeathDate;
        Date frankBirthDate;
        Date frankDeathDate;
        Date mandelaBirthDate;
        Date mandelaDeathDate;
        Date gandhiBirthDate;
        Date gandhiDeathDate;
        Date angelouBirthDate;
        Date angelouDeathDate;
        Date xBirthDate;
        Date xDeathDate;

        Person orwellAuthor;
        Person leeAuthor;
        Person austenAuthor;
        Person fitzgeraldAuthor;
        Person melvilleAuthor;
        Person caroAuthor;
        Person isaacsonAuthor;
        Person gilbertAuthor;
        Person chernowAuthor;
        Person frankAuthor;
        Person mandelaAuthor;
        Person gandhiAuthor;
        Person angelouAuthor;
        Person xAuthor;

        orwellName = new Name("George", "Orwell");
        leeName = new Name("Harper", "Lee");
        austenName = new Name("Jane", "Austen");
        fitzgeraldName = new Name("F. Scott", "Fitzgerald");
        melvilleName = new Name("Herman", "Melville");
        caroName = new Name("Robert", "Caro");
        isaacsonName = new Name("Walter", "Isaacson");
        gilbertName = new Name("Martin", "Gilbert");
        chernowName = new Name("Ron", "Chernow");
        frankName = new Name("Anne", "Frank");
        mandelaName = new Name("Nelson", "Mandela");
        gandhiName = new Name("Mahatma", "Gandhi");
        angelouName = new Name("Maya", "Angelou");
        xName = new Name("Malcolm", "X");

        orwellBirthDate = new Date(1903, 6, 25);
        orwellDeathDate = new Date(1950, 1, 21);
        leeBirthDate = new Date(1926, 4, 28);
        leeDeathDate = new Date(2016, 2, 19);
        austenBirthDate = new Date(1775, 12, 16);
        austenDeathDate = new Date(1817, 7, 18);
        fitzgeraldBirthDate = new Date(1896, 9, 24);
        fitzgeraldDeathDate = new Date(1940, 12, 21);
        melvilleBirthDate = new Date(1819, 8, 1);
        melvilleDeathDate = new Date(1891, 9, 28);
        caroBirthDate = new Date(1935, 10, 30);
        caroDeathDate = null;
        isaacsonBirthDate = new Date(1952, 5, 20);
        isaacsonDeathDate = null;
        gilbertBirthDate = new Date(1936, 10, 25);
        gilbertDeathDate = new Date(2015, 2, 3);
        chernowBirthDate = new Date(1949, 3, 3);
        chernowDeathDate = null;
        frankBirthDate = new Date(1929, 6, 12);
        frankDeathDate = new Date(1945, 3, 1);
        mandelaBirthDate = new Date(1918, 7, 18);
        mandelaDeathDate = new Date(2013, 12, 5);
        gandhiBirthDate = new Date(1869, 10, 2);
        gandhiDeathDate = new Date(1948, 1, 30);
        angelouBirthDate = new Date(1928, 4,4);
        angelouDeathDate = new Date(2014, 5, 28);
        xBirthDate = new Date(1925, 5, 19);
        xDeathDate = new Date(1965, 2, 21);

        orwellAuthor = new Author(orwellName, orwellBirthDate, orwellDeathDate, "Dystopian Fiction");
        leeAuthor = new Author(leeName, leeBirthDate, leeDeathDate, "Southern Gothic");
        austenAuthor = new Author(austenName, austenBirthDate, austenDeathDate, "Romance");
        fitzgeraldAuthor = new Author(fitzgeraldName, fitzgeraldBirthDate, fitzgeraldDeathDate, "Modernist Fiction");
        melvilleAuthor = new Author(melvilleName, melvilleBirthDate, melvilleDeathDate, "Adventure Fiction");
        caroAuthor = new Author(caroName, caroBirthDate, caroDeathDate, "Biography");
        isaacsonAuthor = new Author(isaacsonName, isaacsonBirthDate, isaacsonDeathDate, "Biography");
        gilbertAuthor = new Author(gilbertName, gilbertBirthDate, gilbertDeathDate, "Biography");
        chernowAuthor = new Author(chernowName, chernowBirthDate, chernowDeathDate, "Biography");
        frankAuthor = new Author(frankName, frankBirthDate, frankDeathDate, "Biography");
        mandelaAuthor = new Author(mandelaName, mandelaBirthDate, mandelaDeathDate, "Biography");
        gandhiAuthor = new Author(gandhiName, gandhiBirthDate, gandhiDeathDate, "Biography");
        angelouAuthor = new Author(angelouName, angelouBirthDate, angelouDeathDate, "Biography");
        xAuthor = new Author(xName, xBirthDate, xDeathDate, "Biography");

        orwellAuthor.display();
        System.out.println();
        leeAuthor.display();
        System.out.println();
        austenAuthor.display();
        System.out.println();
        fitzgeraldAuthor.display();
        System.out.println();
        melvilleAuthor.display();

    }
}
