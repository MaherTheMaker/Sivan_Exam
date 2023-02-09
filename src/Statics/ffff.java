package Statics;

class Book {
    static int bookCount = 0;
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        bookCount++;
    }

    public static int getBookCount() {
        return bookCount;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

 class Mai4 {
    public static void main(String[] args) {
        Book book1 = new Book("War and Peace", "Leo Tolstoy");
        Book book2 = new Book("Moby-Dick", "Herman Melville");

        System.out.println("Statics.Book count: " + Book.getBookCount());
        // Output: Statics.Book count: 2

        System.out.println("Title: " + book1.getTitle() + " Author: " + book1.getAuthor());
        // Output: Title: War and Peace Author: Leo Tolstoy
    }
}
