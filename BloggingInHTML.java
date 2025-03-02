import java.util.Scanner;

public class BloggingInHTML {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String header = input.nextLine();
        String imageFilePath = input.nextLine();
        String postText =input.nextLine();
        String author = input.nextLine();
        String postDate = input.nextLine();

        System.out.printf("<html><body><h1>%s</h1>\n<img scr=\"%s\"/>\n<p>%s</p>%n<small>%s, %s</small>\n</body></html>", header, imageFilePath, postText, author, postDate);
    }
}
