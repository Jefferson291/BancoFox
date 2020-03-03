package BancoFox;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int valor;
		JOptionPane.showMessageDialog(null,
				"------------------------------------\n | Bem vindo o Banco Fox | \n------------------------------------");
		String nome = JOptionPane.showInputDialog(null, "Para prosseguir, digite seu nome");
		Saque s1 = new Saque(nome);
		Conta c1 = new Conta(nome);
		Object[] opcoes = { "Conta BancoFox ", "Loterica BancoFOX" };
		valor = JOptionPane.showOptionDialog(null, "Qual tipo de Acesso deseja", "Acesso BancoFox",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, "Membro BancoFox");
		switch (valor) {
		case 0:
			JOptionPane.showMessageDialog(null, "Bem vindo a sessão membro Banco fox");
			Object[] OpcoesMembro = { "Login ", "Cadastro", "Sair" };
			valor = JOptionPane.showOptionDialog(null, "Acesso BancoFox", "BancoFox", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.WARNING_MESSAGE, null, OpcoesMembro, "Sair");
			switch (valor) {
			case 0:
				c1.login();
				s1.SaqueDeposito();
				break;
			case 1:
				c1.Cadastro();
				break;
			case 2:
				System.exit(0);
				break;
			}
			break;
		case 1:
			Loteria l1 = new Loteria();
			l1.Loterica();		
			break;
		}
		}
}
