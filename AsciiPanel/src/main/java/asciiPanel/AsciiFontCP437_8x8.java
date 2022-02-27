package asciiPanel;

import org.springframework.stereotype.Component;

@Component

public class AsciiFontCP437_8x8 implements AsciiFont{

    @Override
    public String getFontFilename() {
        // TODO Auto-generated method stub
        return "cp437_8x8.png";
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 8;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 8;
    }

}