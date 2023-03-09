package pro.sky.java.course1.homework1;

public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author tolstoy2 = new Author("Лев", "Толстой");
        Author dostoevskiy = new Author("Федор", "Достоевский");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1854);
        Book idiot = new Book("Идиот", dostoevskiy, 1700);

        System.out.println(warAndPeace);
        System.out.println(idiot);

        System.out.println(tolstoy);
    }
}