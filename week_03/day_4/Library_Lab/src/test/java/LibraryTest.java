import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Library<Book> bookLibrary;
    Library<DVD> DVDLibrary;
    Library<VCR> VCRLibrary;
    Book book;
    Book book1;
    DVD dvd;
    DVD dvd1;
    VCR vcr;
    VCR vcr1;

    @Before
    public void before(){
        bookLibrary = new Library<Book>();
        DVDLibrary = new Library<DVD>();
        VCRLibrary = new Library<VCR>();
        library = new Library();
        book = new Book("Americanah", "Chimamanda", Genre.DRAMA);
        book1 = new Book("Little Women", "Louisa May", Genre.DRAMA);
        dvd = new DVD("Dora the Explorer", AgeRating.G,Genre.FANTASY);
        dvd1 = new DVD("Harry Potter and The Goblet of Fire", AgeRating.PG_THIRTEEN, Genre.FANTASY);
        vcr = new VCR("The Gods Must Be Crazy", AgeRating.PG_THIRTEEN,Genre.COMEDY);
        vcr1 = new VCR("Baby's Day Out", AgeRating.PG, Genre.COMEDY);
    }

    @Test
    public void libraryIsEmpty(){

        assertEquals(0, library.librarySize() );
    }

    @Test
    public void canAddBookToLibrary(){
        bookLibrary.addToLibrary(book);
        bookLibrary.addToLibrary(book1);
        assertEquals(2, bookLibrary.librarySize());
    }

    @Test
    public void canAddDvdToLibrary(){
        DVDLibrary.addToLibrary(dvd);
        assertEquals(1, DVDLibrary.librarySize());

    }

    @Test
    public void canAddVcrToLibrary(){
        VCRLibrary.addToLibrary(vcr);
        assertEquals(1, VCRLibrary.librarySize());
    }

    @Test
    public void canTrackBookGenre(){
        bookLibrary.addToLibrary(book1);
        bookLibrary.addToLibrary(book);
        assertEquals(2, bookLibrary.trackItemGenre(Genre.DRAMA));
    }

    @Test
    public void canTrackDvdGenre(){
        DVDLibrary.addToLibrary(dvd);
        DVDLibrary.addToLibrary(dvd1);
        assertEquals(0, DVDLibrary.trackItemGenre(Genre.COMEDY));
    }

}
