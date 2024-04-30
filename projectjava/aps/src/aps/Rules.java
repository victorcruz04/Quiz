package aps;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Bem vindo, " + name + " ,no Score Ambiental");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Esse teste é para saber se você é uma pessoa Ecoconsciente." + "<br><br>" +
                "2. Não sorria desnecessariamente para a pessoa sentada ao seu lado, ela também pode não saber a resposta." + "<br><br>" +
                "3. Você pode ter muitas opções na vida, mas aqui todas as perguntas são obrigatórias." + "<br><br>" +
                "4. O questionário pode ser feito em dupla, você e Deus." + "<br><br>" +
                "5. Existe apenas uma resposta correta." + "<br><br>" +
                "6. Todas as perguntas terão tempo. Assim você não poderá consultar." + "<br><br>" +
                "7. Seja sincero, e responda aquilo que acha correto." + "<br><br>" +
                "8. Aprenda com o questionário, pergunte-se no que melhorar e boa sorte !" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Voltar");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Começar");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
       

