
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        while(currentIndex < markdown.length()) {
            System.out.println(currentIndex);
            int openBracket = markdown.indexOf("[", currentIndex);
            // System.out.println(openBracket);
            int closeBracket = markdown.indexOf("]", openBracket);
            // System.out.println(closeBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            int closeParen = markdown.indexOf(")", openParen);
           if(openParen == -1 || openBracket == -1 || closeParen == -1 || closeBracket == -1) {
               break;
           }

           int tickMark = markdown.indexOf("'");
           if(tickMark != -1) {
               break;
           }

         
        
           

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;
           
            // toReturn.add(markdown.substring(openParen + 1, closeParen));
            // currentIndex = closeParen + 1;

            // System.out.println(currentIndex);
            
            
        }

        return toReturn;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        

        
    }
}