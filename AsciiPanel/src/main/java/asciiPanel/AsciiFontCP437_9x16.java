package asciiPanel;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("AsciiFontCP437_9x16")
public class AsciiFontCP437_9x16 implements AsciiFont{

    @Override
    public String getFontFilename() {
        // TODO Auto-generated method stub
        return "cp437_9x16.png";
    }

    @Override
    public int getWidth() {
        // TODO Auto-generated method stub
        return 9;
    }

    @Override
    public int getHeight() {
        // TODO Auto-generated method stub
        return 16;
    }

}