package gui;


import gui.patient;
import gui.project;
import gui.tests;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;



public class Hospital5  extends Frame implements ActionListener{
    Label l= new Label("Hospital Managment System");
    Label l2= new Label("Doctor name");
    Label l3= new Label("Doctor ssn");
    Label l4= new Label("Doctor spealization");
    Label l5= new Label("Doctor page  ");
    Label l6= new Label("patient name");
    Label l7= new Label("patient ssn");
    Label l8= new Label("Date admitted");
    Label l9= new Label("Date checked out");
    Label l10= new Label("Patient insurance");
    Label l11 = new Label("Test name");
    Label l12= new Label("Test id ");
    Label l13= new Label("Test date");
    Label l14= new Label("Test time ");
    Label l15= new Label("Test result ");
    Label l16= new Label("patient page ");
    Label l17= new Label("Test pege ");

    
    
    Button b=new Button("Doctors");
    Button b1=new Button("patients");
    Button b2=new Button("Tests");
    Button b3=new Button("Exit");
    Button b4=new Button("Update");
    Button b5=new Button("Insert");
    Button b6=new Button("Delete");
    Button b7=new Button("Search");
    Button b8=new Button("Exit");
    Button b9=new Button("Update");
    Button b10=new Button("Insert");
    Button b11=new Button("Delete");
    Button b12=new Button("Search");
    Button b13=new Button("Exit");
    Button b14=new Button("Update");
    Button b15=new Button("Insert");
    Button b16=new Button("Delete");
    Button b17=new Button("Search");
    Button b18=new Button("Exit");
       

 
    Frame f1=new Frame();
    Frame f2=new Frame(); 
    Frame f3=new Frame(); 
    Choice c1=new Choice();
    TextField t1=new TextField();
    TextField t2=new TextField();
    TextField t3=new TextField();
    TextField t4=new TextField();
    TextField t5=new TextField();
    TextField t6=new TextField();
    TextField t7=new TextField();
    TextField t8=new TextField();
    TextField t9=new TextField();
    TextField t10=new TextField();
    TextField t11=new TextField();
    TextField t12=new TextField();
    
    
    
    Hospital5(){
    setLayout(null);
    setBounds(300,130,700,700);
    setBackground(Color.LIGHT_GRAY);
    l.setBounds(200, 50, 200, 80);
    l.setBackground(Color.WHITE);
    add (l);
   
    
    
//doctor page *************************************************************   
    /*f1.setBounds(300, 130,600, 700);
    f1.setLayout(null);
    f1.add(l5);
    l5.setBounds(200, 50, 170, 50);
    l5.setBackground(Color.CYAN);
    
    f1.add(l2);
    l2.setBounds(30, 120, 80, 70);
    f1.add(t1);
    t1.setBounds(140, 140, 150, 30);
    
    
    f1.add(l3);
    l3.setBounds(30, 190, 80, 70);
    f1.add(t2);
    t2.setBounds(140, 210,150 , 30);
    
    
    f1.add(l4);
    l4.setBounds(30, 290, 120, 70);   
    f1.add(c1);
    c1.setBounds(150, 310, 170, 70);
    c1.add("Dentist");
    c1.add("Anatomy");
    c1.add("surgery");
    c1.add("Internal Medicine");
    c1.add("Neurology");
    
    f1.add(b4);
    b4.setBounds(30,500 , 60, 40);
    
    f1.add(b5);
    b5.setBounds(120, 500, 60, 40);
    
    f1.add(b6);
    b6.setBounds(210, 500, 60, 40);
    
    f1.add(b7);
    b7.setBounds(300, 500, 60, 40);
    
    f1.add(b8);
    b8.setBounds(400, 600, 60, 40);
    b8.addActionListener(this);*/
    
   
    
    
// patient page ************************************************************
    
    b1.addActionListener(this);
    /*f2.setBounds(300, 130, 600, 700);
    f2.add(l16);
    l16.setBounds(200, 50, 170, 50);
    l16.setBackground(Color.gray);
    
    f2.add(l6);
    l6.setBounds(30, 120, 80, 70);
    f2.add(t3);
    t3.setBounds(140, 140, 150, 30);
    
     f2.add(l7);
    l7.setBounds(30, 190, 80, 70);
    f2.add(t4);
    t4.setBounds(140, 210,150 , 30);
    
    f2.add(l10);
    l10.setBounds(30, 260, 120, 70);   
    f2.add(t5);
    t5.setBounds(150, 280, 150, 30);
    
    f2.add(l8);
    l8.setBounds(30, 330, 140, 70);
     f2.add(t6);
    t6.setBounds(180, 350, 150, 30);
    
    f2.add(l9);
    l9.setBounds(30, 400, 120, 70);
    f2.add(t7);
    t7.setBounds(150, 420, 150, 30);    
    
    f2.add(b9);
    b9.setBounds(30,500 , 60, 40);
    
    f2.add(b10);
    b10.setBounds(120, 500, 60, 40);
    
    f2.add(b11);
    b11.setBounds(210, 500, 60, 40);
    
    f2.add(b12);
    b12.setBounds(300, 500, 60, 40);
    
    f2.add(b13);
    b13.setBounds(320, 500, 60, 40);
    b13.addActionListener(this);*/
    
    // Test page *************************************************************
     b2.addActionListener(this);
    /*f3.setBounds(300, 130, 560, 600);
     f3.add(l17);
    l17.setBounds(200, 50, 170, 50);
    l17.setBackground(Color.gray);
    
     f3.add(l11);
    l11.setBounds(30, 120, 80, 70);
    f3.add(t8);
    t8.setBounds(140, 140, 150, 30);
    
     f3.add(l12);
    l12.setBounds(30, 190, 80, 70);
    f3.add(t9); 
    t9.setBounds(140, 210,150 , 30);
    
   f3.add(l13);
   l13.setBounds(30, 260, 120, 70);   
   f3.add(t10);
   t10.setBounds(150, 280, 150, 30);
    
    f3.add(l14);
    l14.setBounds(30, 330, 140, 70);
    f3.add(t11);
    t11.setBounds(180, 350, 150, 30);
    
    f3.add(l15);
    l15.setBounds(30, 400, 120, 70);
    f3.add(t12);
    t12.setBounds(150, 420, 150, 30);    
      
 
    f3.add(b14);
    b14.setBounds(30,500 , 60, 40);
    
    f3.add(b15);
    b15.setBounds(120, 500, 60, 40);
    
    f3.add(b16);
    b16.setBounds(210, 500, 60, 40);
    
    f3.add(b17);
    b17.setBounds(300, 500, 60, 40);
    
    f3.add(b18);
    b18.setBounds(390, 500, 60, 40);
    b18.addActionListener(this);*/   
    
    
   // the main frame 
    b.setBounds(65,200 , 500, 80);
    b.addActionListener(this);
    add (b);
    b2.setBounds(65,400 , 500, 80);
    add (b2);
    
     b3.setBounds(200,600 , 150, 55);
     b3.addActionListener(this);
    add (b3);
    
    
    b1.setBounds(65,300 , 500, 80);
    add (b1);   
    
    b2.setBounds(65,400 , 500, 80);
    add (b2);
    
     b3.setBounds(200,600 , 150, 55);
     b3.addActionListener(this);
    add (b3);
    
    
    setVisible(true);
    
    setSize(1100,700);
        setVisible(true);

        setLayout(new BorderLayout());

           JLabel background=new JLabel(new ImageIcon("D:\\OneDrive\\Pictures\\ai_main.png"));


        add(background);

        background.setLayout(new FlowLayout());
    }
    
    

    
    
    
    
    
    public static void main(String[] args) {
        Hospital5 n1=new Hospital5();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3){
        System.exit(0);}
        if(e.getSource()==b){
        setVisible(false);
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new project().setVisible(true);
            }
        });}
         if(e.getSource()==b8){
        System.exit(0);}
         
          if(e.getSource()==b1){
        setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                new patient().setVisible(true);
            }
        });}
          
          
           if(e.getSource()==b13){
        System.exit(0);}
             if(e.getSource()==b2){
        setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tests().setVisible(true);
            }
        });
        
             if(e.getSource()==b18){
        System.exit(0);}      
             }}
    
  
    
}


