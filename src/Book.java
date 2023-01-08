public class Book {
    String author = "Ion Creanga";
    String title = "Amintiri din copilarie";
    double price = 50.00;

    public double getPrice(){
        return price;
    }

    public String showAuthorAndTitle(){
        return ("Book "+title+" is written by "+author);
    }

    public static void showILoveBooks(){
        System.out.println("I Love Books");
    }

}
