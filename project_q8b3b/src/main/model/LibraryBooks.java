package model;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("checkstyle:RightCurly")
public class LibraryBooks {
    private List<LibraryBook> books = new ArrayList<LibraryBook>();

    public LibraryBooks() {
        LibraryBook b1 = new LibraryBook(123, "Project Phase one",
                "Joe", "Coding");
        LibraryBook b2 = new LibraryBook(125, "Project Phase two",
                "John", "Coding");
        books.add(b1);
        books.add(b2);


    }


    public void addBook(int serialNum, String bookTitle, String authorName, String genre) {
        LibraryBook book = new LibraryBook(serialNum, bookTitle, authorName, genre);
        this.books.add(book);

    }

    @SuppressWarnings({"checkstyle:WhitespaceAround", "checkstyle:OneStatementPerLine"})
    public List sameGenre(String genre) {

      //  List<LibraryBook>() this.books = new ArrayList<LibraryBook>();

        for (LibraryBook book : this.books) {
            if (genre == book.getBookGenre()) {

                this.books.add(book);

                return (List) books;

            } else {
                return (List) (books = (List<LibraryBook>) new LibraryBooks());


            }

        }

        return (List) books;
    }
}
