package BancoFox;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conta extends Pessoa{
 
	public Conta(String nome) {
		this.Nome = nome;
	}

	void Cadastro() {

		JTextField field1 = new JTextField();
		JTextField field2 = new JTextField();
		JTextField field3 = new JTextField();
		JTextField field4 = new JTextField();
		JTextField field5 = new JTextField();
		JTextField field6 = new JTextField();
		JTextField field7 = new JTextField();
		//JTextField field8 = new JTextField();
		JTextField field9 = new JTextField();
		JTextField field10 = new JTextField();

		Object[] message = { "Digite Seu Nome :", field1, "Digite sua idade", field2, "Digite sua cidade:", field3,
				"Digite seu bairro:", field4, "Digite seu email:", field5, "Digite seu Telefone :", field6,
				"Digite seu Endere�o", field7, /* "Digite seu emprego ",field8 */
				"Digite sua senha", field9, "Digite seu login", field10 };
		int option = JOptionPane.showConfirmDialog(null, message, "CadastroBancoFox", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			this.Nome = field1.getText();
			this.idade = field2.getText();
			this.cidade = field3.getText();
			this.Bairro = field4.getText();
			this.Email = field5.getText();
			this.Tel = field6.getText();
			this.END = field7.getText();
			this.Senha = field9.getText();
			this.Login = field10.getText();
		}
	}

	void login() {
		JTextField field1 = new JTextField();// instanciei JTextField
		JTextField field2 = new JTextField();

		Object[] message = { "Login:", field1, "Senha :", field2 };// vetor
		int option = JOptionPane.showConfirmDialog(null, message, "Banco FOX", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			this.Login = field1.getText();
			this.Senha = field2.getText();
			if (Login.equals("123") && Senha.equals("123")) {
				JOptionPane.showMessageDialog(null, "Login efetuado com sucesso! ");

			} else {
				JOptionPane.showMessageDialog(null, "Login ou senha invalido! ");
				System.exit(0);
			}
		}
	}
}