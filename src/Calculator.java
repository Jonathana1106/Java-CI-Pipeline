import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JButton btnCLear;
    private JButton btnEquals;
    private JButton btnMinus;
    private JButton btnFour;
    private JButton btnOne;
    private JButton btnTree;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnDivide;
    private JButton btnFive;
    private JButton btnTwo;
    private JButton btnPlus;
    private JButton btnZero;
    private JButton btnDot;
    private JButton btnMulti;
    private JButton btnNine;
    private JButton btnSix;
    private JTextField textDisplay;

    private Double temp = 0.0;
    private Double result = 0.0;
    private char mathOperator;

    private void getMathOperator(String btnText) {
        mathOperator = btnText.charAt(0);
        temp = temp + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public Calculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() + btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });
        btnTree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTreeText = textDisplay.getText() + btnTree.getText();
                textDisplay.setText(btnTreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnPlus.getText();
                getMathOperator(buttonText);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (mathOperator) {
                    case '+':
                        result = temp + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        result = temp - Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        result = temp * Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        result = temp / Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(result));
                temp = 0.0;
            }
        });
        btnCLear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = 0.0;
                textDisplay.setText("");
            }
        });
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")) {
                    textDisplay.setText("0.");
                }
                else if(textDisplay.getText().contains(".")) {
                    btnDot.setEnabled(false);
                }
                else {
                    String btnDotText = textDisplay.getText() + btnDot.getText();
                    textDisplay.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMinus.getText();
                getMathOperator(buttonText);
            }
        });


        btnMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnMulti.getText();
                getMathOperator(buttonText);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = btnDivide.getText();
                getMathOperator(buttonText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
