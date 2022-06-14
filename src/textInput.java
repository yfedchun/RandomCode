import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class textInput {
    private JPanel panel;
    private JButton xy;



    public textInput() {

        xy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = "I guess this is just like VB or Delphi";
                JOptionPane.showMessageDialog(null, title);
                                                        }
        }

        );// end action listener


        }//end constructor


        public static void main(String[] args) {
        JFrame frame = new JFrame("TEST");
        //frame.setContentPane(new textInput().panel);
        JOptionPane.showMessageDialog(frame, "Well, shit.....");  //JFrame.EXIT_ON_CLOSE
        //frame.pack();  disabling this makes window size static

        frame.setVisible(true);
System.exit(0);
    }

   private void createUIComponents() {
        // TODO: place custom component creation code here

    }


}
