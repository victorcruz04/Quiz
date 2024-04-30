
package aps;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Você costuma andar mais de?";
        questions[0][1] = "Moto";
        questions[0][2] = "Transporte compartilhado (público ou privado)";
        questions[0][3] = "Carro a combustão";
        questions[0][4] = "Carro elétrico";

        questions[1][0] = "Quando você marca uma reunião,  é realizado por: ";
        questions[1][1] = "Video conferência";
        questions[1][2] = "Local próximo à você";
        questions[1][3] = "Local próximo aos participantes";
        questions[1][4] = "Local intermediário a todos";

        questions[2][0] = "Como você normalmente lava o seu veículo ou de algum parente?";
        questions[2][1] = "Balde";
        questions[2][2] = "Vape";
        questions[2][3] = "Mangueira";
        questions[2][4] = "Lava rápido";

        questions[3][0] = "Como as pessoas em sua casa descartam o óleo?";
        questions[3][1] = "Na pia";
        questions[3][2] = "No lixo";
        questions[3][3] = "Em garrafas";
        questions[3][4] = "Vaso sanitário";

        questions[4][0] = "Você possui na sua casa remédios guardados em: ";
        questions[4][1] = "Pequena escala, remédios que sobraram";
        questions[4][2] = "Média escala, remédios que sobraram e remédios que eu acho necessário";
        questions[4][3] = "Grande escala, tenho uma farmácia em casa";
        questions[4][4] = "Pequena escala, remédios que eu acho necessário";

        questions[5][0] = "Você anda mais a pé por qual motivo?";
        questions[5][1] = "Para resolver uma pendência de minha vida";
        questions[5][2] = "Para praticar uma atividade física";
        questions[5][3] = "Porque meu transporte não está disponível";
        questions[5][4] = "Não ando a pé";

        questions[6][0] = "Como você costuma carregar suas compras?";
        questions[6][1] = "Sacola de pano";
        questions[6][2] = "Sacola de plástico";
        questions[6][3] = "Caixa de papelao";
        questions[6][4] = "Bolsa e/ou mochila";

        questions[7][0] = "Quando você vai descartar um vidro vazio, oque você faz?";
        questions[7][1] = "Jogo no lixo comum";
        questions[7][2] = "Jogo no lixo específico para vidros";
        questions[7][3] = "Descarto diretamente na natureza";
        questions[7][4] = "Deixo guardado em casa";

        questions[8][0] = "Como você costuma descartar pilhas e baterias usadas?";
        questions[8][1] = "Guardo para um centro de coleta";
        questions[8][2] = "Jogo no lixo comum";
        questions[8][3] = "Enterro no quintal";
        questions[8][4] = "Descarto em qualquer lixeira";

        questions[9][0] = "Quando você precisa se desfazer de uma roupa, oque você faz?";
        questions[9][1] = "Doou para instituições de caridade ou brechos";
        questions[9][2] = "Jogo no lixo comum";
        questions[9][3] = "Queimo no quintal";
        questions[9][4] = "Deixo acumular no armário";
        
        answers[0][1] = "Transporte compartilhado (público ou privado): ";
        answers[1][1] = "Video conferência";
        answers[2][1] = "Balde";
        answers[3][1] = "Em garrafas";
        answers[4][1] = "Pequena escala, remédios que eu acho necessário: ";
        answers[5][1] = "Para praticar uma atividade física";
        answers[6][1] = "Sacola de pano";
        answers[7][1] = "Jogo no lixo específico para vidros";
        answers[8][1] = "Guardo para um centro de coleta";
        answers[9][1] = "Doou para instituições de caridade ou brechos";
        
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Próximo");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 18));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("Aumentar sua chance");
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Enviar");
        submit.setBounds(1100, 710, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Tempo restante - " + timer + " segundos"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 16));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Tempo esgotado!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}