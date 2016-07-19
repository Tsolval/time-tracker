package net.tsolval.psp;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application configuration class. Add or reference Spring configurations here.
 *
 * @author tsolval
 */
@SpringBootApplication
public class TimeTrackerApplication {

	/**
	 * This is the main starting point for the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TimeTrackerApplication.class, args);
		String url = "http://localhost:8080/";
		if (Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
			} catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
		} else {
			Runtime runtime = Runtime.getRuntime();
			String os = System.getProperty("os.name").toLowerCase();
			if (os.indexOf("win") >= 0) {
				try {
					runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (os.indexOf("mac") >= 0) {
				try {
					runtime.exec("open " + url);
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (os.indexOf("nix") >= 0 || os.indexOf("nux") >= 0) {
				String[] browsers = { "epiphany", "firefox", "mozilla", "konqueror", "netscape", "opera", "links",
						"lynx" };

				StringBuffer cmd = new StringBuffer();
				for (String browser : browsers) {
					cmd.append(browser).append(" \"").append(url).append("\" ").append("|| ");
				}
				cmd.setLength(cmd.length() - 3);

				try {
					runtime.exec(new String[] { "sh", "-c", cmd.toString() });
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
