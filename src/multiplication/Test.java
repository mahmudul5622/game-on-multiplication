
package multiplication;


import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Test extends JFrame {
    private Container C;
    private JLabel L1,imglabel;
    private Font f;
    private JButton btn;
    private JTextField tf;
    private JTextArea ta;
    private ImageIcon icon,img;
    
    
    
    
    Test(){

         initcomponent();
     
    }
    
    public void initcomponent()
    {
        
        C=this.getContentPane();
        C.setLayout(null);
        C.setBackground(Color.pink);
        
        
        img = new ImageIcon(getClass().getResource("img.jpg"));
        imglabel = new JLabel(img);
        imglabel.setBounds(0,0,400,300);
        //imglabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
        C.add(imglabel);
        
        f= new Font("Arial",Font.BOLD,20);
        
        L1 = new  JLabel("Enter Any Number :");
        L1.setBounds(16,320,190,50);
        L1.setForeground(Color.black);
        L1.setFont(f);
        C.add(L1);
        
        btn = new JButton("Clear");
        btn.setBounds(220,380,100,50);
        btn.setBackground(Color.green);
        btn.setFont(f);
        C.add(btn);
        
        
        btn.addActionListener(new ActionListener()
       {
       public void actionPerformed(ActionEvent e)
       {
           ta.setText("");
           tf.setText("");
           
       }
       });
        
        
        
        
        tf = new JTextField();
        tf.setBounds(220,320,100,50);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBackground(Color.green);
        tf.setFont(f);
        C.add(tf);
        
        
        
        
       tf.addActionListener(new ActionListener()
       {
       public void actionPerformed(ActionEvent e)
       {
          String Value=tf.getText();
           if(Value.isEmpty())
           {
           JOptionPane.showMessageDialog(null,"You Dont Enter Anything");
           }
           else
           {
               
               ta.setText("");
           int num=Integer.parseInt(tf.getText());
           int i;
           
           for(i=1;i<=10;i++)
               
           {
           
           int result=num*i;
           String r=String.valueOf(result);
           String n=String.valueOf(num);
           String incr=String.valueOf(i);
           ta.append(n+"X"+incr+"="+r+"\n");
           }
          }
        }
       });
           
        ta = new JTextArea();
        ta.setBounds(20,445,350,240);
        ta.setBackground(Color.green);
        ta.setFont(f);
        C.add(ta);
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        Test frame = new Test();
        frame.setVisible(true);
        frame.setTitle("Multiplication");
        frame.setBounds(500,0, 400, 732);
        frame.setResizable(false);
        
        
        
        
    }
    
}
