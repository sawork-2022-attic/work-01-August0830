import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import asciiPanel.AsciiPanel;
import config.AsciiFontConfig;

public class Main extends JFrame{
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Autowired
    AsciiPanel panel;

    int width;
    int height;

    public Main(AsciiPanel panel){
        super();
        width = 10;
        height = 10;
        this.panel = panel;
        //new AsciiPanel(width, height, AsciiFont.DRAKE_10x10);
        add(panel);
        pack();
    }

    
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AsciiFontConfig.class);
        AsciiPanel panel = context.getBean(AsciiPanel.class);
        Main app = new Main(panel);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.repaint();
    }
    
    @Override
    public void repaint(){
        //panel.clear();
        for(int i=0;i<width;++i){
            for(int j=0;j<height;++j){
                panel.write((char)(i*height+j), i, j);
            }
        }
        super.repaint();
    }
}