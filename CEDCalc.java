import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
 
@SuppressWarnings("serial")
public class CEDCalc extends JFrame {
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btnSub,btnMuti,
    				btndiv,btnequ,btnac,btn0,btns;
    private JTextArea  txtArea;
    private int count = 0;
    private double a=0,b=0,result=0;
    
    
   
    public CEDCalc () {
        super("CEDCalc");
   
        
        Container cp = getContentPane();
        Panel panelRe = new Panel();
       cp.setLayout(new FlowLayout());
      panelRe.setBackground(Color.darkGray);
        
       
      Panel pannelButton = new Panel(new GridLayout(6,3));
       
       pannelButton.setBackground(Color.ORANGE);
       cp.setLayout(new GridLayout(6,3));
        this.txtArea = new JTextArea("",6,25);
        txtArea.setEditable(false);
       
        txtArea.setForeground ( Color.black );  // ColorFontTextArea
        
       
        //create Object of each Component
     
         this.btn0    = new JButton("0");
         this.btn1    = new JButton("1");
         this.btn2    = new JButton("2");
         this.btn3    = new JButton("3");
         this.btn4    = new JButton("4");
         this.btn5    = new JButton("5");
         this.btn6    = new JButton("6");
         this.btn7    = new JButton("7");
         this.btn8    = new JButton("8");
         this.btn9    = new JButton("9");
         this.btnplus = new JButton("+");
         this.btnSub  = new JButton("-");
         this.btnMuti = new JButton("X");
         this.btndiv  = new JButton("/");
         this.btnequ  = new JButton("=");
         this.btnac   = new JButton("AC");
         this.btns    = new JButton(".");
         
         //Add panel
         panelRe.add(this.txtArea);
         
         //Add Button
         
         pannelButton.add(btn7); 
         pannelButton.add(btn8);
         pannelButton.add(btn9);
         pannelButton.add(btn4);
         pannelButton.add(btn5);
         pannelButton.add(btn6);
         pannelButton.add(btn1); 
         pannelButton.add(btn2);
         pannelButton.add(btn3);
         pannelButton.add(btn0);
         pannelButton.add (btnac);
         pannelButton.add(btns);
         pannelButton.add (btnequ);
         pannelButton.add(btnplus);
         pannelButton.add(btnSub);
         pannelButton.add(btnMuti);
         pannelButton.add (btndiv);
       
        							        
        // add ActionListener
        
       this.btn0.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("0"));  //0
    	   }
       });
        
       this.btn1.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("1")); //1
    	   }
       });
       
       this.btn2.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("2")); //2
    	   }
       });
        
       this.btn3.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("3")); //3
    	   }
       });
       this.btn4.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("4")); //4
    	   }
       });
       
       this.btn5.addActionListener(new ActionListener(){
	   
	   public void actionPerformed(ActionEvent e){
		   txtArea.setText(txtArea.getText().concat("5")); //5
	   }
       });
       
       this.btn6.addActionListener(new ActionListener(){
	   
	   public void actionPerformed(ActionEvent e){
		   txtArea.setText(txtArea.getText().concat("6")); //6
	   }
       }); 
       
       this.btn7.addActionListener(new ActionListener(){
	   
	   public void actionPerformed(ActionEvent e){
		   txtArea.setText(txtArea.getText().concat("7")); //7
	   }
       });
       
       this.btn8.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("8")); //8
    	   }
           });
      
       this.btn9.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat("9")); //9
    	   }
           });
       
       this.btns.addActionListener(new ActionListener(){
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText(txtArea.getText().concat(".")); //.
    		   
    	   }
           });
       
       
       this.btnac.addActionListener(new ActionListener(){  
    	   
    	   public void actionPerformed(ActionEvent e){
    		   txtArea.setText("");  //AC
    	   }
           });
      
       
       this.btnplus.addActionListener(new ActionListener(){   //+
    	   
    	   public void actionPerformed(ActionEvent e){
    		   a = Double.parseDouble(txtArea.getText());
	           count =1;
	           txtArea.setText("");
    	   }
           });
       
       this.btnSub.addActionListener(new ActionListener(){   //-
    	   
    	   public void actionPerformed(ActionEvent e){
    		   a = Double.parseDouble(txtArea.getText());
	           count =2;
	           txtArea.setText("");
    	   }
           });
       
       this.btnMuti.addActionListener(new ActionListener(){   //X
    	   
    	   public void actionPerformed(ActionEvent e){
    		   a = Double.parseDouble(txtArea.getText());
	           count =3;
	           txtArea.setText("");
    	   }
           });
       
       this.btndiv.addActionListener(new ActionListener(){   //   >> / 
    	   
    	   public void actionPerformed(ActionEvent e){
    		   a = Double.parseDouble(txtArea.getText());
	          count =4;
	           txtArea.setText("");
    	   }
           });
       this.btnequ.addActionListener(new ActionListener(){   // =  total
    	   
    	   public void actionPerformed(ActionEvent e){
    		   b=Double.parseDouble(txtArea.getText());
	            switch(count)
	            {
	                case 1: result=a+b;
	                    break;
	        
	                case 2: result=a-b;
	                    break;
	        
	                case 3: result=a*b;
	                    break;
	        
	                case 4: result=a/b;
	                    break;
	        
	                default: result=0;
	            }
	        
	            txtArea.setText(""+result);
    	   }
           });
      
       
       
       
    // Frame sets to BorderLayout
        cp.setLayout(new BorderLayout());  
	   cp.add(panelRe, BorderLayout.NORTH);
	   cp.add(pannelButton, BorderLayout.CENTER);
	    
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,500);
        this.setVisible(true);
    }
   
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable(){
 
            @Override
            public void run() {
            new CEDCalc ();
        }
 
      });
    }
}

//นาย ภศิน  ปรีชาธนาคุณ  เลขประจำตัว 5702041620115