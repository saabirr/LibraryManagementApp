package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyLibraryBookTest {
    private LibraryBook myBook1;
    private LibraryBook myBook2;
    private LibraryBook myBook3;
    private LibraryBook myBook4;

    @BeforeEach
    public void runBefore() {
        myBook1 = new LibraryBook(123, "Project Phase one",
                "Joe", "Coding");
        myBook2 = new LibraryBook(456, "Cleaning Hands",
                "Farah", "Health");
        myBook3 = new LibraryBook(789, "Success",
                "Abdi", "Motivation");
        myBook4 = new LibraryBook(1011, "Big bang",
                "Andre", "Philosophy");
    }

    @Test
    public void ConstructorTest() {
        assertEquals("Project Phase one", myBook1.getBookTitle());
        assertEquals("Cleaning Hands", myBook2.getBookTitle());
        assertEquals(123, myBook1.getSerialNum());
        assertEquals("Philosophy", myBook4.getBookGenre());

    }

    @Test
    public void LibraryBookUnknownAuthorTest() {
        myBook3 = new LibraryBook(667, "Design", "", "Arts");
        assertEquals("Unknown", myBook3.getBookAuthor());
    }

    @Test
    public void getSameGenreTest() {
        List<LibraryBook> books = new ArrayList<LibraryBook>();
        books.add(myBook1);
        books.add(myBook2);
        books.add(myBook3);
        books.add(myBook4);

        assertEquals( 4, books.size());

    }

}