import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Kalkulator {
    private JPanel panel1;
    private JTextField textDisplay;
    private JButton a4Button;
    private JButton a2Button;
    private JButton a00Button;
    private JButton a5Button;
    private JButton a1Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton xButton;
    private JButton a3Button;
    private JButton button4;
    private JButton a0Button;
    private JButton ACButton;
    private JButton button9;
    private JButton button10;
    private JButton button1;
    private JButton a9Button1;
    private JButton a6Button1;
    private JButton a3Button1;
    private JButton button11;


    double a, b, result;
    String op;

    public Kalkulator() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button1.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button1.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a00Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        a9Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button1.getText());
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(textDisplay.getText());
                    pm = pm*-1;
                    textDisplay.setText(String.valueOf(pm));
                }else{
                    long PM = Long.parseLong(textDisplay.getText());
                    PM = PM*-1;
                    textDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(textDisplay.getText());
                    pm = pm*-1;
                    textDisplay.setText(String.valueOf(pm));
                }else{
                    long PM = Long.parseLong(textDisplay.getText());
                    PM = PM*-1;
                    textDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!textDisplay.getText().contains(".")){
                    textDisplay.setText(textDisplay.getText() + button11.getText());
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "+";
                textDisplay.setText("");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "-";
                textDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "*";
                textDisplay.setText("");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "/";
                textDisplay.setText("");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(textDisplay.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length() -1);
                    backspace = String.valueOf(strB);
                    textDisplay.setText(backspace);
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textDisplay.getText());

                if(op == "+"){
                    result = a+b;
                    textDisplay.setText(String.valueOf(result));
                }else if(op == "-"){
                    result = a-b;
                    textDisplay.setText(String.valueOf(result));
                }else if(op == "*"){
                    result = a*b;
                    textDisplay.setText(String.valueOf(result));
                }else if(op == "/"){
                    result = a/b;
                    textDisplay.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
