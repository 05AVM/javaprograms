import java.applet.Applet;
import java.awt.Graphics;
import java.net.MalformedURLException;
import java.net.URL;
/*
<applet code= "shapes.class" width=1000
height=500>
</applet>
*/


public class LinkApplet extends Applet {
    public void init() {
        // Get the applet's context
        AppletContext appletContext = getAppletContext();

        try {
            // Create a URL object for the link
            URL linkURL = new URL("https://example.com");

            // Open the link in a new browser window or tab
            appletContext.showDocument(linkURL, "_blank");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        // Display a message on the applet
        g.drawString("Click here to visit a link", 50, 50);
    }
}
