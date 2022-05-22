import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    //javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
    //java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParseTest

    //Tests for My Implementation
    @Test
    public void test1() throws IOException{
     
        String contents= Files.readString(Path.of("snippetone.md"));
        List<String> expect = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expect);

    }

    @Test
    public void test2() throws IOException{
       

        String contents= Files.readString(Path.of("snippettwo.md"));
        List<String> expect = List.of("a.com", "a.com((","example.com" );
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    @Test
    public void test3() throws IOException{
       

        String contents= Files.readString(Path.of("snippetthree.md"));
        List<String> expect = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule" );
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }

    //Tests for Reviewed Implementation
    @Test
    public void test4()throws IOException {
        String contents= Files.readString(Path.of("snippetone.md"));
        List<String> expect = MarkdownParse.getLinks(contents);
        assertEquals(expect.size(), 3);
        List<String> expectTwo = List.of("`google.com", "google.com", "ucsd.edu");
        assertEquals(MarkdownParse.getLinks(contents), expectTwo);
    }


     @Test
    public void test5()throws IOException {
        String contents= Files.readString(Path.of("snippettwo.md"));
        List<String> expect = MarkdownParse.getLinks(contents);
        assertEquals(expect.size(), 3);
        List<String> expectTwo = List.of("a.com", "a.com((","example.com" );
        assertEquals(MarkdownParse.getLinks(contents), expectTwo);
    }

    @Test
    public void test6()throws IOException {
        String contents= Files.readString(Path.of("snippetthree.md"));
        List<String> expect = MarkdownParse.getLinks(contents);
        assertEquals(expect.size(), 1);
        List<String> expectTwo = List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule" );
        assertEquals(MarkdownParse.getLinks(contents), expectTwo);
    }




}