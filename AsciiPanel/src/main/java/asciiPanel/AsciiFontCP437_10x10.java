package asciiPanel;

import org.springframework.stereotype.Component;

@Component
public class AsciiFontCP437_10x10 implements AsciiFont{

    public String getFontFilename() {
        // TODO Auto-generated method stub
        return "cp437_10x10.png";
    }

    public int getWidth() {
        // TODO Auto-generated method stub
        return 10;
    }


    public int getHeight() {
        // TODO Auto-generated method stub
        return 10;
    }
}