/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
/**
 *
 * @author shahe
 */
public class mainwin extends JFrame{
    private JButton clear;
    private JTextArea outputlabel;
    private JButton fill;
    private JButton randomisebutton;
    private JTextField nostf;
    private JTextField entertf;
    private double randomnum1;
    private double randomnum2;
    private int myInt, myInt2;
    private String s,p;
    private int input, nos,i;
    private String output;
    private JRadioButton multiply, divide;


    public mainwin(){
    
        setTitle("Times Table");
       
        setLocation(500,250);  
        setLayout(null);
        
        setSize(500,340);
        setLocation(200,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp =getContentPane();

        JLabel enter= new JLabel("Enter the multiplier/divisor:");
        JLabel nos=new JLabel("Enter number of sums");
        nostf=new JTextField();
        
        entertf=new JTextField();
        
        randomisebutton=new JButton("Randomise");
        
         multiply =new JRadioButton("Multiply");
         divide=new JRadioButton("Divide");

       fill= new JButton("Fill Table");
         clear= new JButton("Clear Table");

        ButtonGroup group=new ButtonGroup();
        group.add(multiply);
        group.add(divide);

        JPanel operationpanel=new JPanel();
        operationpanel.setBounds(380,120,150,60);
        operationpanel.setLayout(new BoxLayout(operationpanel,BoxLayout.PAGE_AXIS));
        operationpanel.add(divide);
        operationpanel.add(multiply);

        JPanel outputpanel=new JPanel();
        outputlabel=new JTextArea();
        outputpanel.setBounds(20,40,350,200);
        outputpanel.add(outputlabel);
        outputpanel.setBackground(Color.WHITE);

        JPanel userinputpanel=new JPanel();
        userinputpanel.setBounds(10, 1, 460, 30);
        userinputpanel.setLayout(new BoxLayout(userinputpanel,BoxLayout.X_AXIS));
        userinputpanel.add(enter);
        userinputpanel.add(Box.createRigidArea(new Dimension(10,0)));
        userinputpanel.add(entertf);
        userinputpanel.add(Box.createRigidArea(new Dimension(10,0)));
        userinputpanel.add(nos);
        userinputpanel.add(Box.createRigidArea(new Dimension(10,0)));
        userinputpanel.add(nostf);
        userinputpanel.add(Box.createRigidArea(new Dimension(10,0)));
        userinputpanel.add(randomisebutton);

 

        JPanel tableoptions= new JPanel();
        tableoptions.add(fill);
        tableoptions.add(Box.createRigidArea(new Dimension(15,0)));
        tableoptions.add(clear);
        tableoptions.setBounds(80,260,220,20);
        tableoptions.setLayout(new BoxLayout(tableoptions,BoxLayout.X_AXIS));


        cp.add(userinputpanel);
        cp.add(outputpanel);
        cp.add(operationpanel);
        cp.add(tableoptions);
        
        ButtonHandler bh =new ButtonHandler();
        clear.addActionListener(bh);
        randomisebutton.addActionListener(bh);
        fill.addActionListener(bh);
        multiply.addActionListener(bh);
        divide.addActionListener(bh);
    }
    
    public static void main(String[]args){
mainwin f= new mainwin();
        f.setVisible(true);
        

        }
public class ButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== clear){
            outputlabel.setText("");
          

        }
        else if(ae.getSource()==fill){
            outputlabel.setText(output);

}
else if(ae.getSource()==randomisebutton){
    Random rand = new Random();
    randomnum2=rand.nextInt(10);
     randomnum1=rand.nextInt(8);
    
     myInt=(int)randomnum1;
     s =String.valueOf(myInt);
    nostf.setText(s);
   
    
    myInt2=(int)randomnum2;
    p =String.valueOf(myInt2);
   entertf.setText(p);
}
input=Integer.parseInt(entertf.getText());
nos=Integer.parseInt(nostf.getText());

if(ae.getSource()==multiply){
for(i=1;i<=nos;i++){
    output="\n";
for(i=1;i<=nos;i++){
    output+= i + "x" + input + "=" + i*nos   + "\n";
    }
}}
else if(ae.getSource()==divide){
    for(i=1;i<=nos;i++){
        output="\n";
    for(i=1;i<=nos;i++){
        output+= i*input + "/" + input + "=" + (i)  + "\n";
}

}}}
}
}
