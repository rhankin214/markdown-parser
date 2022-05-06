import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//hello

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
    public ArrayList<String> getGottenLinks (String fileName) throws IOException
    {
        Path filePath = Path.of(fileName);
        String content = Files.readString(filePath);
        return mrkdwnPrse.getLinks(content);
    }
    @Test
    public void getLinksTestFile() throws IOException{
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-thing.html");
        gottenLinks = getGottenLinks("test-file.md");
        for(int i = 0; i < expectedLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinksbreakingTests() throws IOException{
        expectedLinks.add("linkwithaspace.html");
        
        gottenLinks = getGottenLinks("breakingTests.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile2() throws IOException{
        expectedLinks.add("https://something.com");
        expectedLinks.add("some-page.html");
        gottenLinks = getGottenLinks("test-file2.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile3() throws IOException{
        gottenLinks = getGottenLinks("test-file3.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile4() throws IOException{
        gottenLinks = getGottenLinks("test-file4.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile5() throws IOException{
        gottenLinks = getGottenLinks("test-file5.md");
        System.out.println(gottenLinks);
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile6() throws IOException{
        gottenLinks = getGottenLinks("test-file6.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile7() throws IOException{
        gottenLinks = getGottenLinks("test-file7.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
    @Test
    public void getLinkTestFile8() throws IOException{
        expectedLinks.add("a link on the first line");
        gottenLinks = getGottenLinks("test-file8.md");
        for(int i = 0; i < gottenLinks.size(); i++)
        {
            assertEquals(i + "th link didn't match for test-file", expectedLinks.get(i), 
                gottenLinks.get(i));
        }
    }
}
