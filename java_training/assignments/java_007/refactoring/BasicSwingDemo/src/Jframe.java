import javax.swing.*;

public interface Jframe {
    JFrame getFrame(String title);
    JFrame getFrame(JFrame frm, int width, int height, int onExit, String label);
}
