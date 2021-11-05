package sky.pro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Author king = new Author("King", "Stephen");
        System.out.println(king.getSurName() + " " + king.getFirstName());
        Book shooter = new Book(1978, "Shooter", king);
        System.out.println(shooter.getBookName() + " " + shooter.getYearPublication() + " " + shooter.getSurName() + " " + shooter.getFirstName());
        shooter.setYearPublication(1979);
        System.out.println(shooter.getBookName() + " " + shooter.getYearPublication() + " " + shooter.getSurName() + " " + shooter.getFirstName());

        Author сapote = new Author("Capote", "Truman");
        System.out.println(сapote.getSurName() + " " + сapote.getFirstName());
        Book breakfast = new Book(1958, "Breakfast at Tiffany's", сapote);
        System.out.println(breakfast.getBookName() + " " + breakfast.getYearPublication() + " " + breakfast.getSurName() + " " + breakfast.getFirstName());
        breakfast.setYearPublication(1959);
        System.out.println(breakfast.getBookName() + " " + breakfast.getYearPublication() + " " + breakfast.getSurName() + " " + breakfast.getFirstName());


    }
}
