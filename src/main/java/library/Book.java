package library;

public class Book {
    private String bookName;
    private String writerName;
    private Integer year;
    private Integer pages;
    private String genres;

    public Book() {
    }

    public Book(String bookName, String writerName, Integer year, Integer pages, String genres) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.year = year;
        this.pages = pages;
        this.genres = genres;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        try {
            this.year = year;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        if(pages>0){
            this.pages = pages;
        }else {
            System.out.println("The page number should be greater then 0");
        }
    }

    @Override
    public String toString() {
        return "Book : \n" +
                "Book Name : " + bookName +"\n" +
                "Book Writer : " + writerName +"\n" +
                "Book Year : " + year + "\n" +
                "Book Pages : " + pages + "\n" +
                "Book genres : " + genres + "\n" +
                "-------------------------------------" + "\n";
    }
}
