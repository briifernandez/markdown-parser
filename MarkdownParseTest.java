import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void test1() {
        String s = readFile("snippetone.md");
        List<String> l = MarkdownParse.getLinks(s);
        assertEquals(l, List.of("anotherlink'"));
    }


}