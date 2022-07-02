import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.setTitle("Useless Frame");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
}
