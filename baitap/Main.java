package baitap;
public class Main {
    public static void main(String[] args) {
        Author author = new Author("hehe", "bvgg@gmail.com", 'm');
        System.out.println(author);
        Author author1 = new Author("Author 1", "author1@email.com",'f');
        Author author2 = new Author("Author 2", "author2@email.com",'m');
        Author[] authors = {author1, author2};
        Book book = new Book("cẩm nang sinh tồn trong vku", authors, 9999999, 200);
        System.out.println(book);
    }
}