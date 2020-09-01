import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class Calculator extends JFrame {

	private JPanel painel;
	private JTextField telinha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 493);
		painel = new JPanel();
		painel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painel);
		
		JButton zero = new JButton("0");
		zero.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton ponto = new JButton(".");
		ponto.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton div = new JButton("/");
		div.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton igual = new JButton("=");
		igual.setFont(new Font("Tahoma", Font.PLAIN, 51));
		
		JButton um = new JButton("1");
		um.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton dois = new JButton("2");
		dois.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton tres = new JButton("3");
		tres.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton mult = new JButton("*");
		mult.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton soma = new JButton("+");
		soma.setFont(new Font("Tahoma", Font.PLAIN, 51));
		
		JButton seis = new JButton("6");
		seis.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton cinco = new JButton("5");
		cinco.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton quatro = new JButton("4");
		quatro.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton sete = new JButton("7");
		sete.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton oito = new JButton("8");
		oito.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton nove = new JButton("9");
		nove.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		JButton sub = new JButton("-");
		sub.setFont(new Font("Tahoma", Font.PLAIN, 53));
		
		telinha = new JTextField();
		telinha.setColumns(10);
		GroupLayout gl_painel = new GroupLayout(painel);
		gl_painel.setHorizontalGroup(
			gl_painel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painel.createSequentialGroup()
					.addGroup(gl_painel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(telinha, Alignment.LEADING)
						.addGroup(Alignment.LEADING, gl_painel.createSequentialGroup()
							.addComponent(zero, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ponto, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(div, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(igual, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_painel.createSequentialGroup()
							.addComponent(um, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dois, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tres, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(mult, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_painel.createSequentialGroup()
							.addComponent(quatro, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(seis, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(soma, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_painel.createSequentialGroup()
							.addComponent(sete, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(oito, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(nove, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(sub, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		gl_painel.setVerticalGroup(
			gl_painel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_painel.createSequentialGroup()
					.addComponent(telinha, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.LEADING)
						.addComponent(sete, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(oito, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(nove, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(sub, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(quatro, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(cinco, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(seis, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(soma, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.BASELINE)
						.addComponent(um, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(dois, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(tres, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(mult, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painel.createParallelGroup(Alignment.LEADING)
						.addComponent(igual, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(div, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(ponto, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(zero, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		painel.setLayout(gl_painel);
	}
}
