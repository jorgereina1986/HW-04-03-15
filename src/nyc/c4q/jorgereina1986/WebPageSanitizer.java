package nyc.c4q.jorgereina1986;
import java.net.URL;

/**
 * Created by Jorge Reina and Luke on 4/6/15.
 */
public class WebPageSanitizer
{
    public static String sanitize(String html){
        html = html.toLowerCase();   //changing html to all lower cases

        while (true) {

            int startIndex = html.indexOf("<script");
            int endIndex = html.indexOf("</script>") +9;

            if(startIndex == -1){
                break;
            }
            String script = html.substring(startIndex, endIndex); //taking everything in between
            html = html.replace(script, "");
        }

        return html;
    }

    public static void main(String[] args)
    {
        //URL myUrl = new URL();

    }
}
