package aps;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score2.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Obrigado " + name + ", por responder ao questionário");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Sua pontuação foi de " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);

        if (score == 0) {
            JLabel perfectMessage = new JLabel("<html>Você odeia tanto a natureza<br> que até as formigas estão<br> formando um boicote contra você.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 10) {
            JLabel perfectMessage = new JLabel("<html>Se a natureza fosse uma rede<br> social, você seria o único<br> usuário bloqueado por todos os <br>seres vivos.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 20) {
            JLabel perfectMessage = new JLabel("<html>Sua conexão com a natureza é <br>tão fraca que até o ecossistema marinho<br> está enviando uma petição para<br>mantê-lo longe do oceano.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 30) {
            JLabel perfectMessage = new JLabel("<html>Se a natureza fosse um restaurante,<br> você seria aquele cliente que<br>reclama do cardápio e deixa o <br>lugar sem dar gorjeta.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 40) {
            JLabel perfectMessage = new JLabel("<html>Se a natureza fosse uma festa, você <br>seria aquele convidado que<br>derruba a decoração e pisa nas flores.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 50) {
            JLabel perfectMessage = new JLabel("<html>Se a natureza fosse um livro,<br> você ainda estaria na introdução.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 60) {
            JLabel perfectMessage = new JLabel("<html>Sua conexão com a natureza é<br> como uma sopa morna - nem quente, nem fria, apenas lá.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 70) {
            JLabel perfectMessage = new JLabel("<html>Você e a natureza estão <br>se aproximando tanto que até<br> as borboletas estão te convidando<br> para voar junto com elas.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 80) {
            JLabel perfectMessage = new JLabel("<html>Até os pássaros estão<br> com ciúmes da sua <br>harmonia com a natureza.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 90) {
            JLabel perfectMessage = new JLabel("<html>Se a natureza fosse<br> um jardim, você seria<br> o jardineiro mais habilidoso.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        if (score == 100) {
           JLabel perfectMessage = new JLabel("<html>Parabéns! Você e a natureza são como<br>dois pés no mesmo sapato - inseparáveis<br>sempre dando passos em direção à <br>beleza do mundo.</html>");
            perfectMessage.setBounds(350, 230, 500, 100);
            perfectMessage.setFont(new Font("Tahoma", Font.PLAIN, 20));
            perfectMessage.setForeground(Color.GREEN); // Cor verde para destacar
            add(perfectMessage);
        }
        
        JButton submit = new JButton("<html>Responder<br> Novamente<html>");
        submit.setBounds(350, 340, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Tahoma", Font.BOLD, 12));
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 100); // Exemplo de uso com score 100
    }
}