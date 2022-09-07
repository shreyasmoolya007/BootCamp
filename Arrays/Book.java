class Book
{
    String bookName;
    int id;

    public Book(String bookName, int id) {
        this.bookName = bookName;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Book name: "+this.bookName+"\nBook ID: "+this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (this.bookName.equals(book.bookName)) && (this.id == book.id);
    }

    @Override
    public int hashCode() {
        return this.hashCode();
    }
}

