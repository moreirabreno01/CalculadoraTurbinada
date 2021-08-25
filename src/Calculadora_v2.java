import java.awt.*;
import javax.swing.*;

public class Calculadora_v2 extends TelaBase
{
	Calculadora_v2()
	{
		JPanel PainelBotoes =new JPanel();
		PainelBotoes.setLayout(new GridLayout(6,4));
		
		PainelBotoes.add(new JButton ("%"));
		PainelBotoes.add(new JButton ("CE"));
		PainelBotoes.add(new JButton ("C"));
		PainelBotoes.add(new JButton ("Back"));
		
		
		PainelBotoes.add(new JButton ("1/2"));
		PainelBotoes.add(new JButton ("X^2"));
		PainelBotoes.add(new JButton ("Raiz"));
		PainelBotoes.add(new JButton ("/"));
		
		PainelBotoes.add(new JButton ("7"));
		PainelBotoes.add(new JButton ("8"));
		PainelBotoes.add(new JButton ("9"));
		PainelBotoes.add(new JButton ("X"));
		
		PainelBotoes.add(new JButton ("4"));
		PainelBotoes.add(new JButton ("5"));
		PainelBotoes.add(new JButton ("6"));
		PainelBotoes.add(new JButton ("-"));
		
		PainelBotoes.add(new JButton ("1"));
		PainelBotoes.add(new JButton ("2"));
		PainelBotoes.add(new JButton ("3"));
		PainelBotoes.add(new JButton ("+"));
		
		PainelBotoes.add(new JButton ("+/-"));
		PainelBotoes.add(new JButton ("0"));
		PainelBotoes.add(new JButton (","));
		PainelBotoes.add(new JButton ("="));
		
		
		JTextField txtVisor = new JTextField("0");
		
		txtVisor.setHorizontalAlignment(SwingConstants.RIGHT);
		txtVisor.setFont(new Font("Arial",0,50));
		add(BorderLayout.NORTH, txtVisor);
		add(BorderLayout.CENTER,PainelBotoes);
	}
	
	public static void main(String[] args) {
		Calculadora_v2 calculadora = new Calculadora_v2();
		calculadora.setTitle("Calculadora");
		calculadora.setSize(240,400);
		calculadora.setVisible(true);
	}

}