package asciiPanel;

import org.springframework.stereotype.Component;

@Component
public class AsciiFontDrake_10x10 implements AsciiFont{

    @Override
    public String getFontFilename() {
        // TODO Auto-generated method stub
        return "drake_10x10.png";
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 10;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 10;
    }

}