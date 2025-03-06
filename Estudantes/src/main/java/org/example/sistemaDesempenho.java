package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sistemaDesempenho {
    public JFrame frame;
    public JTextField nomeField;
    public JTextField notaField;
    public JTextArea resultadoArea;
    public JButton avaliarButton;

    public sistemaDesempenho() {

        frame = new JFrame("Sistema de Avaliação de Notas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nomeLabel = new JLabel("Nome do Aluno:");
        nomeLabel.setBounds(30, 30, 120, 25);
        frame.add(nomeLabel);

        nomeField = new JTextField();
        nomeField.setBounds(150, 30, 200, 25);
        frame.add(nomeField);


        JLabel notaLabel = new JLabel("Nota Final:");
        notaLabel.setBounds(30, 70, 120, 25);
        frame.add(notaLabel);

        notaField = new JTextField();
        notaField.setBounds(150, 70, 200, 25);
        frame.add(notaField);


        avaliarButton = new JButton("Avaliar Desempenho");
        avaliarButton.setBounds(100, 110, 200, 30);
        frame.add(avaliarButton);


        resultadoArea = new JTextArea();
        resultadoArea.setBounds(30, 160, 320, 80);
        resultadoArea.setEditable(false);
        frame.add(resultadoArea);


        avaliarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = nomeField.getText();
                String notaText = notaField.getText();

                if (nome.isEmpty() || notaText.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Por favor, preencha todos os campos.");
                    return;
                }

                try {
                    double nota = Double.parseDouble(notaText);


                    estudante aluno = new estudante(nome, nota);
                    avaliadorDeNotas avaliador = new avaliadorDeNotas();
                    String resultado = avaliador.avaliarDesempenho(aluno);


                    resultadoArea.setText(resultado);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira um valor válido para a nota.");
                }
            }
        });
    }

    public void exibir() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        sistemaDesempenho gui = new sistemaDesempenho();
        gui.exibir();
    }
}
