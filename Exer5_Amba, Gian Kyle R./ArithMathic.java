import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.Random;

public class ArithMathic extends JFrame {

    JTextField usernameField, answerField;
    JLabel questionLabel, scoreLabel, levelLabel;
    JButton startBtn, submitBtn;

    int num1, num2, correctAnswer;
    int score = 0;
    int level = 1;
    char operator;

    Random random = new Random();

    public ArithMathic() {
        setTitle("ARITH MATHIC");
        setSize(520, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Border curvedBlack = new LineBorder(Color.BLACK, 2, true);

        JPanel main = new JPanel(new BorderLayout(10, 10));
        main.setBackground(Color.LIGHT_GRAY);
        main.setBorder(new EmptyBorder(15, 15, 15, 15));

        JLabel title = new JLabel("ARITH MATHIC", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        main.add(title, BorderLayout.NORTH);

        JPanel center = new JPanel(new GridLayout(6, 1, 10, 10));
        center.setBackground(Color.LIGHT_GRAY);

        usernameField = new JTextField();
        usernameField.setFont(new Font("Arial", Font.PLAIN, 16));
        usernameField.setBorder(new CompoundBorder(curvedBlack,
                new EmptyBorder(8, 10, 8, 10)));
        usernameField.setToolTipText("Enter Username");

        levelLabel = new JLabel("Level: 1", JLabel.CENTER);
        levelLabel.setFont(new Font("Arial", Font.BOLD, 16));
        levelLabel.setOpaque(true);
        levelLabel.setBackground(Color.WHITE);
        levelLabel.setBorder(curvedBlack);

        questionLabel = new JLabel("Press START", JLabel.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 18));
        questionLabel.setOpaque(true);
        questionLabel.setBackground(Color.WHITE);
        questionLabel.setBorder(curvedBlack);

        answerField = new JTextField();
        answerField.setFont(new Font("Arial", Font.PLAIN, 16));
        answerField.setBorder(new CompoundBorder(curvedBlack,
                new EmptyBorder(8, 10, 8, 10)));

        scoreLabel = new JLabel("Score: 0", JLabel.CENTER);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 16));
        scoreLabel.setOpaque(true);
        scoreLabel.setBackground(Color.WHITE);
        scoreLabel.setBorder(curvedBlack);

        center.add(usernameField);
        center.add(levelLabel);
        center.add(questionLabel);
        center.add(answerField);
        center.add(scoreLabel);

        main.add(center, BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        buttons.setBackground(Color.LIGHT_GRAY);

        startBtn = new JButton("START");
        submitBtn = new JButton("SUBMIT");

        startBtn.setBorder(curvedBlack);
        submitBtn.setBorder(curvedBlack);

        buttons.add(startBtn);
        buttons.add(submitBtn);

        main.add(buttons, BorderLayout.SOUTH);

        add(main);

        startBtn.addActionListener(e -> generateQuestion());
        submitBtn.addActionListener(e -> checkAnswer());
    }

    void generateQuestion() {
        int min = 1, max = 50;

        if (level == 2) {
            min = 51;
            max = 100;
        } else if (level == 3) {
            min = 101;
            max = 150;
        }

        num1 = random.nextInt(max - min + 1) + min;
        num2 = random.nextInt(max - min + 1) + min;

        int op = random.nextInt(4);

        switch (op) {
            case 0 -> {
                operator = '+';
                correctAnswer = num1 + num2;
            }
            case 1 -> {
                operator = '-';
                correctAnswer = num1 - num2;
            }
            case 2 -> {
                operator = '×';
                correctAnswer = num1 * num2;
            }
            case 3 -> {
                operator = '÷';
                num2 = random.nextInt(9) + 1;
                correctAnswer = random.nextInt(10) + 1;
                num1 = correctAnswer * num2;
            }
        }

        questionLabel.setText(num1 + " " + operator + " " + num2);
        answerField.setText("");
    }

    void checkAnswer() {
        try {
            int userAnswer = Integer.parseInt(answerField.getText());

            if (userAnswer == correctAnswer) {
                score += 10;

                if (score >= 30 && level < 3) {
                    level++;
                    JOptionPane.showMessageDialog(this,
                            "Level Up! Now Level " + level);
                }

            } else {
                score -= 5;
                JOptionPane.showMessageDialog(this,
                        "Wrong Answer!");
            }

            scoreLabel.setText("Score: " + score);
            levelLabel.setText("Level: " + level);
            generateQuestion();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Please enter a valid number");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ArithMathic().setVisible(true);
        });
    }
}
