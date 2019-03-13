package pl.danplo.ocrsystem;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import org.springframework.stereotype.Service;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;

@Service
public class OcrService {

    public String doOCR(String url) {

        //"https://2.allegroimg.com/s512/037caf/94cf42ab46b58f3f420fd275b1a2"
        try {
            URL imageFile = new URL(url);
            BufferedImage bufferedImage = ImageIO.read(imageFile);

            ITesseract instance = new Tesseract();
            instance.setDatapath("C:\\Users\\Daniel_D'AGE\\IdeaProjects\\ocrsystem");
            instance.setLanguage("pol");
            return instance.doOCR(bufferedImage);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

}
