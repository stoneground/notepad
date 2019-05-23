import javax.swing.*;
import java.awt.*;
class gui {
    public static void main(String args[]) {

        //Skapar "ramen"
        JFrame frame = new JFrame("Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Skapar meny
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FIl");
        JMenu m2 = new JMenu("Hjälp");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Öppna");
        JMenuItem m22 = new JMenuItem("Spara som");
        m1.add(m11);
        m1.add(m22);

        //Skapar panelen och botten
        JPanel panel = new JPanel(); //
        JLabel label = new JLabel("Skriv in text");
        JTextField tf = new JTextField(25); // Godtar upp till 25 bokstäver
        JButton send = new JButton("Sänd");
        JButton reset = new JButton("Reset");
        panel.add(label); //
        panel.add(label); //
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Centrerar texten
        JTextArea ta = new JTextArea();

        //Lägger till komponenter till skärmen
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}