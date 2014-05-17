package com.hendrysuwanda.captureimage;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.github.sarxos.webcam.Webcam;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	Webcam webcam = Webcam.getDefault();
    	webcam.open();

    	// get image
    	BufferedImage image = webcam.getImage();

    	// save image to PNG file
    	ImageIO.write(image, "PNG", new File("test.png"));
    }
}
