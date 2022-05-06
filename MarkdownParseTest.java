
import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testfileMarkdownParse() throws IOException{

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);

        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(content));
    }

    // @Test
    // public void testfile1MarkdownParse() throws IOException {

    //     Path fileName1 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file1.md");
    //     String content1 = Files.readString(fileName1);

    //     assertEquals(List.of(), MarkdownParse.getLinks(content1));
    // }

    // @Test
    // public void testfile4MarkdownParse() throws IOException {

    //     Path fileName4 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file4.md");
    //     String content4 = Files.readString(fileName4);

    //     assertEquals(List.of(), MarkdownParse.getLinks(content4));
    // }

    // @Test
    // public void testfile5MarkdownParse() throws IOException {

    //     Path fileName5 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file5.md");
    //     String content5 = Files.readString(fileName5);

    //     assertEquals(List.of(), MarkdownParse.getLinks(content5));
    // }

    // @Test
    // public void testfile6MarkdownParse() throws IOException {

    //     Path fileName6 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file6.md");
    //     String content6 = Files.readString(fileName6);

    //     assertEquals(List.of(), MarkdownParse.getLinks(content6));
    // }

    // @Test
    // public void testfile7MarkdownParse() throws IOException {

    //     Path fileName7 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file7.md");
    //     String content7 = Files.readString(fileName7);

    //     assertEquals(List.of(), MarkdownParse.getLinks(content7));
    // }

    // @Test
    // public void testfile8MarkdownParse() throws IOException {

    //     Path fileName8 = Path.of("/Users/ria/CSE 15L/markdown-parser/test-file8.md");
    //     String content8 = Files.readString(fileName8);

    //     assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(content8));
    }

