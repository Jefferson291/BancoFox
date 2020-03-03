package BancoFox;
import javax.swing.JOptionPane;

public class Saque extends Pessoa{
	public Saque(String nome) {
		this.Nome = nome;
	}

	void  SaqueDeposito () {

		int valor=0;
		do {
		
		Object[] opcoes= { "Deposito","saque","saldo","Sair"};
		 valor = JOptionPane.showOptionDialog(null,"Qual tipo de Acesso deseja","Acesso BancoFox",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,opcoes, "Sair");
		 
		
			 switch (valor) {
				case 0:
					
					double D = Integer.parseInt(JOptionPane.showInputDialog("Quanto deseja Depositar ?"));
					if(D>0) {
					 R = this.Saldo + D;
					 Saldo=R;
					JOptionPane.showMessageDialog(null, "Saldo depositado com Sucesso"+"\nValor depositado: R$ "+ D +" Saldo Total: R$"+ R);
					}else {
						JOptionPane.showMessageDialog(null, "N�o foi possivel fazer o Deposito ");
					}
					break;
				case 1:
					double ValorS = Double.parseDouble(JOptionPane.showInputDialog("Quanto deseja sacar ?"));
					if (ValorS<Saldo) {
						R =this.Saldo - ValorS; 
						Saldo=R;
						JOptionPane.showMessageDialog(null, "Saldo Retirado com Sucesso"+"\nValor Retirado: R$ "+ ValorS +"Saldo Total: R$"+ R);
					}else {						
						JOptionPane.showMessageDialog(null, "Saldo insuficiente");
					}						
					break;
				case 2:
					
					JOptionPane.showMessageDialog(null, "Seu saldo sera de "+ Saldo);
					break;
				case 3:
					
					System.exit(1);
					
					break;
				case 4:
					break;
			 }

		} while (valor !=3);
		 
						
		 }
	
}
	


