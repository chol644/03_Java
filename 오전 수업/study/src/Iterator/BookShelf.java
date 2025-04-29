package Iterator;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return books[index];
    }
    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);

        // 확장 for문을 사용하는 방법
        for(Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();
    }
}