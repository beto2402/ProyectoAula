package proyectoaula;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class pantallaPrinc extends JFrame implements ActionListener {
    
    private JLabel titulo;
    private JLabel texto;
    private JLabel elige;
    private JButton fisica;
    private JButton mate;
    
    public pantallaPrinc()
    {
        this.setTitle("+6 Ventana Inicial");
        this.setSize(1500, 1000);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        componentes();
        setVisible(true);
    }
    
    private void componentes()
    {
        //Etiqueta de título
        titulo = new JLabel();
        titulo.setBounds(500, 100, 800, 100);
        titulo.setText("Bienvenido a +6");
        titulo.setFont(new Font("Arial", Font.PLAIN, 70));
        this.add(titulo);
        
        //Etiqueta de descripción
        texto = new JLabel("<html>      \Bienvenido a +6, un programa en el que podrás aprender<br>"
                + "un poco acerca de Física y Geometría Analítica para luego hacer<br>"
                + "          cuestionarios y practicar lo aprendido.</html>");
        texto.setBounds(400, 200, 1000, 200);
        texto.setFont(new Font("Arial", Font.PLAIN, 25));
        this.add(texto);
        
        //Etiqueta de elegir
        elige = new JLabel();
        elige.setBounds(450, 400, 800, 200);
        elige.setFont(new Font("Arial", Font.PLAIN, 35));
        elige.setText("Elige la unidad de aprendizaje deseada");
        this.add(elige);
        
        //Boton de física
        fisica = new JButton();
        fisica.setBounds(675, 650, 150, 70);
        fisica.setText("Fisica I");
        fisica.addActionListener(this);
        fisica.setFont(new Font("Arial", Font.PLAIN, 30));
        fisica.setVisible(true);
        this.add(fisica);
        
        //Botón de Geom Analítica
        mate = new JButton();
        mate.setBounds(550, 750, 400, 70);
        mate.setText("Geometría Analítica");
        mate.addActionListener(this);
        mate.setFont(new Font ("Arial", Font.PLAIN, 30));
        mate.setVisible(true);
        this.add(mate);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
