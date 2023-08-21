
package helper;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.annotations.Test;

public class ScreenshotPrac {
	@Test
	public static String sct() throws IOException, AWTException
	{
		
	       Robot robot = new Robot();
	       Dimension scr_size=Toolkit.getDefaultToolkit().getScreenSize();
	       Rectangle rect=new Rectangle(scr_size);
	       BufferedImage scrshot=robot.createScreenCapture(rect);
	       File dest=new File("C:\\Users\\sambati\\Desktop\\ScreenShots\\sc1.png");
	       //ImageIO.write(im, formatName, output)
	       ImageIO.write(scrshot,"png",dest);
	       return dest.toString();
	      
	}
}
