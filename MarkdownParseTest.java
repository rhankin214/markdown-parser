import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
public class MarkdownParseTest {
    @Before
    public void setup()
    {
        ArrayList<String> gottenLinks = new ArrayList<>();
        ArrayList<String> expectedLinks = new ArrayList<>();
    }
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test
    public void getLinksTwo(){
        MarkdownParse mrkdwnPrse = new MarkdownParse();
        mrkdwnPrse.getLinks("test-file.md");
    }
}
