import static org.junit.Assert.*;

import java.util.ArrayList;

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
    public void getLinksTestFile(){
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        gottenLinks = mrkdwnPrse.getLinks("test-file.md");
        for(int i = 0; i < expectedLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
}
