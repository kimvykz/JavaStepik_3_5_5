import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program {


    public static void main(String[] args) {
        String[] dimentions = {"300x100", "500x200"};
        JFrame frame = new JFrame("Dimenstion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 100));
        JButton button = new JButton("choose dimention");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object s = JOptionPane.showInputDialog(null, "choose dimension","dims",
                         JOptionPane.QUESTION_MESSAGE, null, dimentions, dimentions[0]);
                String[] dims = s.toString().split("x");
                System.out.println(s.toString());
                frame.setSize(new Dimension(Integer.parseInt(dims[0]), Integer.parseInt(dims[1])));
                frame.repaint();
            }
        });

        panel.add(button);
        frame.getContentPane().add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
