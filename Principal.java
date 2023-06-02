import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    private Contas contas;

    private JTextField textFieldValor1;
    private JTextField textFieldValor2;
    private JLabel labelResultado;

    public Principal() {
        contas = new Contas();

        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        textFieldValor1 = new JTextField();
        textFieldValor2 = new JTextField();
        labelResultado = new JLabel("Resultado: ");

        JButton buttonSoma = new JButton("Soma");
        JButton buttonSubtract = new JButton("Subtrair");
        JButton buttonMultiplica = new JButton("Multiplicar");
        JButton buttonDivide = new JButton("Dividir");

        buttonSoma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(textFieldValor1.getText());
                int valor2 = Integer.parseInt(textFieldValor2.getText());
                int resultado = contas.soma(valor1, valor2);
                labelResultado.setText("Resultado: " + resultado);
            }
        });

        buttonSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(textFieldValor1.getText());
                int valor2 = Integer.parseInt(textFieldValor2.getText());
                int resultado = contas.subtract(valor1, valor2);
                labelResultado.setText("Resultado: " + resultado);
            }
        });

        buttonMultiplica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(textFieldValor1.getText());
                int valor2 = Integer.parseInt(textFieldValor2.getText());
                int resultado = contas.multi(valor1, valor2);
                labelResultado.setText("Resultado: " + resultado);
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int valor1 = Integer.parseInt(textFieldValor1.getText());
                int valor2 = Integer.parseInt(textFieldValor2.getText());
                try {
                    double resultado = contas.divide(valor1, valor2);
                    labelResultado.setText("Resultado: " + resultado);
                } catch (ArithmeticException ex) {
                    labelResultado.setText("Erro: " + ex.getMessage());
                }
            }
        });

        add(new JLabel("Valor 1: "));
        add(textFieldValor1);
        add(new JLabel("Valor 2: "));
        add(textFieldValor2);
        add(buttonSoma);
        add(buttonSubtract);
        add(buttonMultiplica);
        add(buttonDivide);
        add(labelResultado);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal();
            }
        });
    }
}