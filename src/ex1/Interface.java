package ex1;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	JLabel lbltexto = new JLabel("Fórmula de Baskara");
	JLabel lblformula = new JLabel("ax'' + bx + c = 0");
	
	JLabel lblVA = new JLabel("Valor de a");
	JLabel lblVB = new JLabel("Valor de b");
	JLabel lblVC = new JLabel("Valor de c");
	JLabel lblX1 = new JLabel("x'");
	JLabel lblX2 = new JLabel("x''");
	
	JTextField txtVA = new JTextField();
	JTextField txtVB = new JTextField();
	JTextField txtVC = new JTextField();
	JTextField txtX1 = new JTextField();
	JTextField txtX2 = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	double a,b,c;
	public Interface(){
		super("Baskara");
		Calculo calc = new Calculo();
		
		Container paine = this.getContentPane();
		
		paine.add(lblVA); // label
		lblVA.setBounds(20,60,245,40);
		
		paine.add(txtVA);// caixa
		txtVA.setBounds(80,70,140,20);
		
		paine.add(lblVB);// label
		lblVB.setBounds(20,100,245,40);
		
		paine.add(txtVB);// caixa
		txtVB.setBounds(80,110,140,20);
		
		paine.add(lblVC);// label
		lblVC.setBounds(20,140,245,40);
		
		paine.add(txtVC);// caixa
		txtVC.setBounds(80,150,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 a = Double.parseDouble(txtVA.getText());
				 b = Double.parseDouble(txtVB.getText());
				 c = Double.parseDouble(txtVC.getText());
				 
				 txtX1.setText("" + calc.x1(a, b, c));
				 txtX2.setText("" + calc.x2(a, b, c));
			 }
		 });
		btnCalculo.setBounds(90,200,90,20);
		
		paine.add(lblX1); // label
		lblX1.setBounds(120,220,245,40);
		
		paine.add(txtX1);// caixa
		txtX1.setBounds(150,230,100,20);
		
		paine.add(lblX2); // label
		lblX2.setBounds(120,250,245,40);
		
		paine.add(txtX2);// caixa
		txtX2.setBounds(150,260,100,20);
		
		paine.add(lbltexto); // label
		lbltexto.setBounds(50,04,245,40);
		lbltexto.setFont(new Font("Dialog", Font.PLAIN, 22));
		
		paine.add(lblformula); // label
		lblformula.setBounds(90,30,245,40);
		lblformula.setFont(new Font("Dialog", Font.PLAIN, 14));
		
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
