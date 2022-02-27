package asciiPanel;

import org.springframework.stereotype.Component;

@Component
public class AsciiFontTalrythSquare_15x15 implements AsciiFont{

    @Override
    public String getFontFilename() {
        // TODO Auto-generated method stub
        return "talryth_square_15x15.png";
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 15;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 15;
    }

}