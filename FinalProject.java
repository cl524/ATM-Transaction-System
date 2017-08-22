import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.GridLayout;
public class FinalProject extends JFrame{
	public FinalProject(){
		
		CardLayout c1=new CardLayout();
		JPanel cardpaneL1= new JPanel();
		cardpaneL1.setLayout(c1);
		
		setTitle("ATM");
		setSize(500,300);
		
		/*login screen*/
		JPanel jpL1=new JPanel();		
		JLabel jL1=new JLabel("login");
		jpL1.add(jL1);

		JButton b1=new JButton("admin");
		JButton b2=new JButton("user");
			
		jpL1.add(jL1);
		
		jpL1.add(b1);
		jpL1.add(b2);	
		cardpaneL1.add(jpL1,"login");
		/*login screen*/
		
		/*admin login screen*/
		JLabel jL4=new JLabel("id");
		JLabel jL5=new JLabel("code");
		JTextField adminid=new JTextField();
		String adinput = adminid.getText();
		JPasswordField adpasscode=new JPasswordField();
		char[] adpassword=adpasscode.getPassword();
		
		JPanel gridpaneL4=new JPanel();
		gridpaneL4.setLayout(new GridLayout(7,7));
		cardpaneL1.add(gridpaneL4,"admi");
		JButton b9=new JButton("enter");
		gridpaneL4.add(jL4);
		gridpaneL4.add(adminid);		
		gridpaneL4.add(jL5);			
		gridpaneL4.add(adpasscode);
		gridpaneL4.add(b9);
		/*admin login screen*/
		
		/*admin function screen*/
		//JPanel jpL5=new JPanel();
		JPanel gridpaneL6=new JPanel();
		gridpaneL6.setLayout(new GridLayout(15,15));
		JLabel jL6=new JLabel("manage_account");
		JLabel jL8=new JLabel("ID");
		JLabel jL9=new JLabel("PassWord");
		JLabel jL20=new JLabel("checking_ID");
		JLabel jL21=new JLabel("savinging_ID");
		//gridpaneL6.setLayout(new GridLayout(9,15));
		cardpaneL1.add(gridpaneL6,"Enter");
		JButton b11=new JButton("add_user");
		JButton b12=new JButton("logout");
		JTextField manage_id=new JTextField();
		String m_id=manage_id.getText();
		JPasswordField managecode=new JPasswordField();
		char[] manage_code=managecode.getPassword();
		JTextField check_id=new JTextField();
		JTextField save_id=new JTextField();
		gridpaneL6.add(jL6);
		gridpaneL6.add(jL8);
		gridpaneL6.add(manage_id);
		gridpaneL6.add(jL9);
		gridpaneL6.add(managecode);
		gridpaneL6.add(jL20);
		gridpaneL6.add(check_id);
		gridpaneL6.add(jL21);
		gridpaneL6.add(save_id);
		gridpaneL6.add(b11);
		JLabel jL7=new JLabel("              ");
		gridpaneL6.add(jL7);
		gridpaneL6.add(b12);
		
		cardpaneL1.add(gridpaneL6,"add_user");
		/*admin function screen*/
		
		/*user login screen*/
		JLabel jL2=new JLabel("user_id");
		
		JTextField id=new JTextField();
		String input = id.getText();
		JLabel jL3=new JLabel("password");
		JPasswordField passcode=new JPasswordField();
		char[] password=passcode.getPassword();
		
		JPanel gridpaneL3=new JPanel();
		gridpaneL3.setLayout(new GridLayout(7,5));
		cardpaneL1.add(gridpaneL3,"Enter");
		JButton b8=new JButton("Enter");
		gridpaneL3.add(jL2);
		gridpaneL3.add(id);
		gridpaneL3.add(jL3);
		gridpaneL3.add(passcode);
		gridpaneL3.add(b8);
		/*user login screen*/
		
		/*user function screen*/
    	        JPanel jpL2=new JPanel();
		//JButton b3=new JButton("transfer");
		JButton b4=new JButton("balance");
		JButton b5=new JButton("withdraw");
		JButton b6=new JButton("deposit");
		JButton b7=new JButton("logout");
		//jpL2.add(b3);
		jpL2.add(b4);
		jpL2.add(b5);
		jpL2.add(b6);
		jpL2.add(b7);		
		cardpaneL1.add(jpL2,"user");
		/*user function screen*/
		
		/*withdraw*/
		JPanel jpL8=new JPanel();
		JLabel jL12=new JLabel("withdraw amount");
		JButton b15=new JButton("Enter");
		JTextField withdraw=new JTextField();
		String with_draw = withdraw.getText();
		jpL8.setLayout(new GridLayout(5,7));
		jpL8.add(jL12);
		jpL8.add(withdraw);
		jpL8.add(b15);
		cardpaneL1.add(jpL8,"withdraw");
		/*withdraw*/
		/*money withdrawn*/
		JPanel jpL9=new JPanel();
		JLabel jL13=new JLabel("   withdrawn");
		JButton b16=new JButton("continue transaction");
		JButton b17=new JButton("logout");
		jpL9.setLayout(new GridLayout(5,7));
		jpL9.add(jL13);
		jpL9.add(b16);
		jpL9.add(b17);
		cardpaneL1.add(jpL9,"withdrawn");
		/*money withdrawn*/
		/*deposit*/
		JPanel jpL10=new JPanel();
		JLabel jL14=new JLabel("deposit amount");
		JButton b18=new JButton("Enter");
		JTextField deposit=new JTextField();
		String depositt = deposit.getText();
		jpL10.setLayout(new GridLayout(5,7));
		jpL10.add(jL14);
		jpL10.add(deposit);
		jpL10.add(b18);
		cardpaneL1.add(jpL10,"deposit");
		/*deposit*/
		/*money deposited*/
		JPanel jpL11=new JPanel();
		JLabel jL15=new JLabel("   deposited");
		JButton b19=new JButton("continue transaction");
		JButton b20=new JButton("logout");
		jpL11.setLayout(new GridLayout(5,7));
		jpL11.add(jL15);
		jpL11.add(b19);
		jpL11.add(b20);
		cardpaneL1.add(jpL11,"deposited");
		/*money deposited*/
		/*check balance*/
		JPanel jpL7=new JPanel();
		JLabel jL11=new JLabel("Balance");
		JButton b14=new JButton("return");
		jpL7.setLayout(new GridLayout(5,7));
		jpL7.add(jL11);
		jpL7.add(b14);
		cardpaneL1.add(jpL7,"return");
		/*check balance*/
		/*add_user successfully*/
		JPanel jpL6=new JPanel();
		jpL6.setLayout(new GridLayout(7,5));
		JLabel jL10=new JLabel("Add user successfully!");
		JButton b13=new JButton("manage_account");
		jpL6.add(jL10);
		jpL6.add(b13);
		cardpaneL1.add(jpL6,"manage_account");
		/*add_user successfully*/
		
		

		
		getContentPane().add(cardpaneL1);
		
		b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "login");
            }
        });
		b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "user");
            }
        });
		b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "deposited");
            }
        });
		b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "deposit");
            }
        });
		b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "user");
            }
        });
		b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "login");
            }
        });
		b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "withdrawn");
            }
        });
		b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "withdraw");
            }
        });
		b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "user");
            }
        });
		b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "return");
            }
        });
		b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "admi");
            }
        });
		b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "Enter");
            }
        });
		b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "login");
            }
        });
		b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "user");
            }
        });
		b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "add_user");
            }
        });
		b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "login");
            }
        });
		b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "manage_account");
            }
        });
		b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
        		c1.show(cardpaneL1, "add_user");
            }
        });
	}
	
	private LayoutManager GridLayout(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
        FinalProject f1 = new FinalProject();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}
