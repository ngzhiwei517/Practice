package LabTest3;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String toString(){
        return "-Title:"+getTitle()+"\nAuthor:"+getAuthor()+"\nISBN:"+getISBN()+"\n";
    }
}
