import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



public class JFTrabajador extends JFrame implements ActionListener
{
       private JPanel p;
       private JButton b1, b2;
       private JLabel l1,l2,l3,l4,l5;
       private JTextArea t1,t2,t3,t4,t5;

   
    public JFTrabajador()
    {
        setTitle("Ingreso de Nuevo Trabajador");
        setVisible(true);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);//para que se cierre al salir
        setResizable(false);//no se puede cambiar de tamaño la ventana
              
        p=new JPanel();
               
        p.setLayout(new GridLayout(6,2));
        p.setPreferredSize(new Dimension (0,130));
        p.setBackground(Color.red);  
        
        add(p);
                
        l1=new JLabel ("Id del Trabajador:");
        l2=new JLabel ("Nombre del Trabajador:");
        l3=new JLabel ("Dirección del Trabajador:");
        l4=new JLabel ("Teléfono del Trabajador:");
        l5=new JLabel (" Sueldo del Trabajador:");
        t1=new JTextArea ("");
        t2=new JTextArea ("");
        t3=new JTextArea ("");
        t4=new JTextArea ("");
        t5=new JTextArea ("");
        b1=new JButton ("Guardar");
        b2=new JButton ("Limpiar");
   
        

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(l4);
        p.add(t4);
        p.add(l5);
        p.add(t5);
        p.add(b1);
        p.add(b2);
     
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
    }
    public void actionPerformed(ActionEvent evento){
        
        String comando = evento.getActionCommand();
        
         if (comando.equals("Guardar")){
            Trabajador t = new Trabajador(Integer.parseInt(t1.getText()),t2.getText(),t3.getText(),t4.getText(),Double.parseDouble(t5.getText()));
            System.out.println("El nombre del trabajador es " + t.getNombre());
        }else if (comando.equals("Limpiar")){
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }
        
    }
    
    }
