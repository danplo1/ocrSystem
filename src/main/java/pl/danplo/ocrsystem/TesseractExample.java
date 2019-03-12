package pl.danplo.ocrsystem;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

public class TesseractExample {

    public static void main(String[] args) throws IOException {

        URL imageFile = new URL("https://2.allegroimg.com/s512/037caf/94cf42ab46b58f3f420fd275b1a2");
        BufferedImage bufferedImage = ImageIO.read(imageFile);

        ITesseract instance = new Tesseract();

        instance.setDatapath("C:\\Users\\Daniel_D'AGE\\IdeaProjects\\ocrsystem");
        instance.setLanguage("pol");

        try {
            String result = instance.doOCR(bufferedImage);
            System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }


}
