import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class calculator extends JFrame  {
	 public String s,s1,s2,s4,s9;
	 public Double s8;
	private TextField t;
	 //private TextField t;
	 calculator(){
			JFrame frame=new JFrame();
			frame.setBounds(30,50, 420, 600);
			frame.setTitle("S15014_Darshana_calculator");
			
			 //JPanel bottom = new JPanel();
			 
			TextField t = new TextField();
			t.setFont(new Font("Arial", Font.PLAIN, 40));
			frame.getContentPane().add(t, BorderLayout.NORTH);
			
			JLabel l1= new JLabel(" It is Simple calculator calculate two numbers easily");
			l1.setFont(new Font("Serif", Font.PLAIN, 19));
			//l1.setBackground(Color.RED);
			frame.getContentPane().add(l1, BorderLayout.SOUTH);
			
	        JPanel firstPanel = new JPanel();
	        //firstPanel.setSize(500,300);
	        firstPanel.setLayout(new GridLayout(5, 3));
	        JButton btn ;
	        JButton act1;JButton act2;JButton act3;
	       
	        for (int i=1; i<=9; i++) {
	        	    this.t=t;
	        	    //btn.setFont(Font.PLAIN,20);
	                btn = new JButton(String.valueOf(i));
	                btn.setFont(new Font("Arial", Font.PLAIN, 40));
	                btn.setBackground(Color.WHITE);
	                btn.setPreferredSize(new Dimension(50, 50));
	                firstPanel.add(btn);  
	                btn.addActionListener(new ActionListener() {
	    	    		public void actionPerformed(ActionEvent e) {
							s = e.getActionCommand();
							s9=t.getText();
							t.setText(t.getText()+s);
	   	    		  
			    		     try{
			    		    	 System.out.println(s2);
			    		     }catch(Exception e1){
			    		    	 System.out.println("Something went wrong.");
			    		     }
	    	    		}
	    	    	});
	        }
	        btn =new JButton("0");firstPanel.add(btn);
	        btn.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			 s = e.getActionCommand();
	    		     t.setText(t.getText()+s);
	    		     s9=t.getText();
		    		     try{
		    		    	 System.out.println(s2);
		    		     }catch(Exception e1){
		    		    	 System.out.println("Something went wrong.");
		    		     }
	    		}
	    	});
	        btn.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        btn =new JButton(".");firstPanel.add(btn);
	        btn.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
					s = e.getActionCommand();
					t.setText(t.getText()+s);
					s9=t.getText();
		    		     try{
		    		    	 System.out.println(s2);
		    		     }catch(Exception e1){
		    		    	 System.out.println("Something went wrong.");
		    		     }
	    		}
	    	});
	        btn.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        btn =new JButton("| |");firstPanel.add(btn);
	    	btn.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    			if (s8 <0) {
	    				t.setText(String.valueOf((-1*s8)));
	    			}

	    		}
	    	});
	    	btn.setFont(new Font("Arial", Font.PLAIN, 40));
	    	
	    	JPanel downPanel = new JPanel();
	        downPanel.setLayout(new GridLayout(5, 1));
	        JButton opt1;JButton opt2;JButton opt3;JButton opt4;JButton opt5;
	        
	        opt1 =new JButton("+");downPanel.add(opt1);
	        opt1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {		
	        		s1= e.getActionCommand();
					s2=t.getText();
					t.setText(t.getText()+s1);
	        		t.setText("");
	        		try {
	        			//s3 = Double.valueOf(s)+ Double.valueOf(s2);
	        			//System.out.print(s4);
	        		}catch(Exception e3) {
	        			System.out.print("error in+");
	        		}
	        	}
	        });
	        opt1.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        opt2 =new JButton("-");downPanel.add(opt2);
	        opt2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		s1= e.getActionCommand();
					s2=t.getText();
					t.setText(t.getText()+s1);
	        		t.setText("");    
	        	}
	        });
	        opt2.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        opt3 =new JButton("*");downPanel.add(opt3);
	        opt3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		s1= e.getActionCommand();
					s2=t.getText();
					t.setText(t.getText()+s1);
	        		t.setText("");
	        	}
	        });
	        opt3.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        opt4 =new JButton("/");downPanel.add(opt4);
	        opt4.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		s1= e.getActionCommand();
					s2=t.getText();
					t.setText(t.getText()+s1);
	        		t.setText("");
	        	}
	        });
	        opt4.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        opt5 =new JButton("squre");downPanel.add(opt5);
	        opt5.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		//s1=e.getActionCommand() ;
	        		try {
	        			System.out.print("he he");
	        		}catch(Exception e4) {
	        			System.out.print("error in square");
	        		}
					s2=t.getText();
					try {
	        			System.out.print("he he"+s2);
	        		}catch(Exception e41) {
	        			System.out.print("error in square");
	        		}
					double s5 = Double.parseDouble(s2);
					double s7 = s5*s5;
					try {
	        			System.out.print("he he"+String.valueOf(s7));
	        		}catch(Exception e411) {
	        			System.out.print("error in square");
	        		}
					t.setText(String.valueOf(s7));
					s9=t.getText();
					//t.setText("");
	        	}
	        });
	        opt5.setFont(new Font("Arial", Font.PLAIN, 40));
	        
	        act3 =new JButton("=");firstPanel.add(act3);
	        act3.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		s4=t.getText();
	        		
	        		  if (s1.equals("+"))
	                      s8 = (Double.parseDouble(s2) + Double.parseDouble(s4));
	                  else if (s1.equals("-"))
	                      s8 = (Double.parseDouble(s2) - Double.parseDouble(s4));
	                  else if (s1.equals("/"))
	                      s8 = (Double.parseDouble(s2) / Double.parseDouble(s4));
//	                  else if(s1.equals("*"))
	                 else
	                      s8 = (Double.parseDouble(s2) * Double.parseDouble(s4));
//	                  else if (s1.equals("!"))
//	                	  if(s4=="0") {
//	                		  s8=1.00;
//	                	  }  
//	                	  else {
//	                		  s5=Integer.parseInt(s4);
//	                		  for(int j=1; j<=s5;j++) {
//	                			  s6=s6*j;
//	                			  s8=Double.parseDouble("s6");
//	                		  }
//	                		  }
//	        		  
//	                  else t.setText("enter the digits");
//	        		  
	        		  t.setText(String.valueOf(s8));
	        	}
	        });
	        act3.setFont(new Font("Arial", Font.PLAIN, 40));
		    
	        
	        act1 =new JButton("cancle");
	        act1.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		t.setText(s9);    
	        	}
	        });
	        act1.setFont(new Font("Arial", Font.PLAIN, 12));
	        
	        firstPanel.add(act1);
	        act2 =new JButton("del");firstPanel.add(act2);
	        act2.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	     t.setText("");
	        	}
	        });
	        act2.setFont(new Font("Arial", Font.PLAIN, 40));

	        frame.getContentPane().add(firstPanel);
	        frame.getContentPane().add(downPanel, BorderLayout.EAST);
	        frame.setVisible(true);

	}

	public static void main(String[] args) {
		new calculator();
		// TODO Auto-generated method stub

	}

}
