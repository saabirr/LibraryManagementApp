package model;

import java.util.List;

public class LibraryBook {
    private int serialNum;
    private String bookName;
    private String authorName;
    private String genre;

    //REQUIRES: bookName has a non-zero length
    //EFFECTS:name of LibraryBook is set to bookName; serialNum is a
    //     *          positive integer not assigned to any other librarybook;
    //     *          if String.length(authorName ) = 0 then author name is set "Unknown"
    //     *           otherwise return authorName.

    public LibraryBook(int serialNum, String title, String authorName, String genre) {
        this.serialNum = serialNum;
        this.bookName = title;
        this.authorName = authorName;
        this.genre = genre;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public String getBookTitle() {
        return bookName;
    }

    public String getBookAuthor() {
        if ("".equals(authorName)) {
            authorName = "Unknown";
        } else {
            authorName = authorName;
        }
        return authorName;
    }

    public String getBookGenre() {
        return genre;

    }



}
