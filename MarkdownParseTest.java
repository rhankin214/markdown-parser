import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
public class MarkdownParseTest {
    ArrayList<String> expectedLinks;
    ArrayList<String> gottenLinks;
    MarkdownParse mrkdwnPrse = new MarkdownParse();
    @Before
    public void setup()
    {
        gottenLinks = new ArrayList<String>();
        expectedLinks = new ArrayList<String>();
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinksTestFile() throws IOException{
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        gottenLinks = mrkdwnPrse.getLinks(content);
        for(int i = 0; i < expectedLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
}
