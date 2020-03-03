package BancoFox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Loteria {
	void Loterica() {

		int Resposta;
		String nome;

		nome = JOptionPane.showInputDialog("Digite seu nome ");

		JOptionPane.showMessageDialog(null, " bem vindo " + nome);

		Resposta = JOptionPane.showConfirmDialog(null, "voce quer apostar? ");

		if (Resposta == JOptionPane.YES_OPTION) {
			int op;
			Object[] opcoes = { "lotofacil", "Quina", "MegaSena" };
			op = JOptionPane.showOptionDialog(null, "Qual tipo de Acesso deseja", "Acesso BancoFox",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, "MegaSena");
			if(op == 0 ){
				int x;
				// int y;

				JOptionPane.showMessageDialog(null, nome + " Voc� Selecionou LotoF�cil ");
				x = Integer.parseInt(JOptionPane.showInputDialog(null, " informe 18 numeros diferentes (entre 0 e 25) "));
			
				if (x >= 18) {
					JOptionPane.showMessageDialog(null, " os numeros digitados foram " + x);
				} else {
					JOptionPane.showMessageDialog(null,
							"Voc� passou do limite de numero ou N�o digitou numeros suficentes", null,
							JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "fechando programa", null, JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
				JOptionPane.showInternalMessageDialog(null, nome + " Voc� digitou os Seguintes numeros" + x);
				JOptionPane.showInternalMessageDialog(null, " Os numeros Sorteados Foram ");
				List<Integer> possiveis1 = new ArrayList<Integer>();
				// Inclui os 25 n�meros poss�veis
				for (int i = 0; i < 25; i++) {
					possiveis1.add(i);
				}
				// Embaralha a lista de n�meros
				Collections.shuffle(possiveis1);

				List<Integer> possiveis2 = new ArrayList<Integer>();
				// Lista os numeros possiveis
				for (int i = 0; i < 25; i++) {
					possiveis2.add(i);
				}

				Collections.shuffle(possiveis2);

				List<Integer> possiveis3 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis3.add(i);
				}
				Collections.shuffle(possiveis3);

				List<Integer> possiveis4 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis4.add(i);
				}

				Collections.shuffle(possiveis4);

				List<Integer> possiveis5 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis5.add(i);
				}

				Collections.shuffle(possiveis5);

				List<Integer> possiveis6 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis6.add(i);
				}

				Collections.shuffle(possiveis6);

				List<Integer> possiveis7 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis7.add(i);
				}

				Collections.shuffle(possiveis7);

				List<Integer> possiveis8 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis8.add(i);
				}

				Collections.shuffle(possiveis8);

				List<Integer> possiveis9 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis9.add(i);
				}

				Collections.shuffle(possiveis9);

				List<Integer> possiveis10 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis10.add(i);
				}

				Collections.shuffle(possiveis10);

				List<Integer> possiveis11 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis11.add(i);
				}

				Collections.shuffle(possiveis11);

				List<Integer> possiveis12 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis12.add(i);
				}

				Collections.shuffle(possiveis12);

				List<Integer> possiveis13 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis13.add(i);
				}

				Collections.shuffle(possiveis13);

				List<Integer> possiveis14 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis14.add(i);
				}

				Collections.shuffle(possiveis14);

				List<Integer> possiveis15 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis15.add(i);
				}

				Collections.shuffle(possiveis15);

				List<Integer> possiveis16 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis16.add(i);
				}

				Collections.shuffle(possiveis16);

				List<Integer> possiveis17 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis17.add(i);
				}

				Collections.shuffle(possiveis17);

				List<Integer> possiveis18 = new ArrayList<Integer>();

				for (int i = 0; i < 25; i++) {
					possiveis18.add(i);
				}

				Collections.shuffle(possiveis18);

				for (int i = 0; i < 1; i++) {
					JOptionPane.showMessageDialog(null,
							possiveis1.get(i) + " - " + possiveis2.get(i) + " - " + possiveis3.get(i) + " - "
									+ possiveis4.get(i) + " - " + possiveis5.get(i) + " - " + possiveis6.get(i) + " - "
									+ possiveis7.get(i) + " - " + possiveis8.get(i) + " - " + possiveis9.get(i) + " - "
									+ possiveis10.get(i) + " - " + possiveis11.get(i) + " - " + possiveis12.get(i)
									+ " - " + possiveis13.get(i) + " - " + possiveis14.get(i) + " - "
									+ possiveis15.get(i) + " - " + possiveis16.get(i) + " - " + possiveis17.get(i)
									+ " - " + possiveis18.get(i) + " - ");

					if (x == i) {
						JOptionPane.showConfirmDialog(null, "Parabens voc� venceu ");
					} else {

						JOptionPane.showConfirmDialog(null, "Voc� n�o ganhou");
					}

				}
			}
			if (op ==1) {

				int u;
				JOptionPane.showInternalMessageDialog(null, nome + " Voc� Selecionou Quina ");

				u = Integer.parseInt(
						JOptionPane.showInputDialog(null, " informe 5 numeros diferentes Para fazer o Sorteio "));

				if (u >= 5) {

					JOptionPane.showMessageDialog(null, " os numeros digitados foram " + u);
				} else {
					JOptionPane.showMessageDialog(null,
							"Voc� passou do limite de numero ou N�o digitou numeros suficentes", null,
							JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "fechando programa", null, JOptionPane.ERROR_MESSAGE);
					System.exit(0);

				}

				JOptionPane.showInternalMessageDialog(null, nome + " Voc� digitou os Seguintes numeros " + u);
				JOptionPane.showInternalMessageDialog(null, " Os numeros Sorteados Foram ");

				List<Integer> possiveis25 = new ArrayList<Integer>();
				// Inclui os 80 n�meros poss�veis
				for (int i = 0; i < 80; i++) {
					possiveis25.add(i);
				}
				// Embaralha a lista de n�meros
				Collections.shuffle(possiveis25);

				List<Integer> possiveis26 = new ArrayList<Integer>();

				for (int i = 0; i < 80; i++) {
					possiveis26.add(i);
				}

				Collections.shuffle(possiveis26);

				List<Integer> possiveis27 = new ArrayList<Integer>();

				for (int i = 0; i < 80; i++) {
					possiveis27.add(i);
				}

				Collections.shuffle(possiveis27);

				List<Integer> possiveis28 = new ArrayList<Integer>();

				for (int i = 0; i < 80; i++) {
					possiveis28.add(i);
				}

				Collections.shuffle(possiveis28);

				List<Integer> possiveis29 = new ArrayList<Integer>();

				for (int i = 0; i < 80; i++) {
					possiveis29.add(i);
				}

				Collections.shuffle(possiveis29);

				for (int i = 0; i < 1; i++) {
					JOptionPane.showMessageDialog(null, possiveis25.get(i) + " - " + possiveis26.get(i) + " - "
							+ possiveis27.get(i) + " - " + possiveis28.get(i) + " - " + possiveis29.get(i));

					if (u == i) {
						JOptionPane.showInternalMessageDialog(null, "Parabens voc� venceu ");
					} else {

						JOptionPane.showInternalMessageDialog(null, "Voc� n�o ganhou");
					}
				}
			}
			if (op==2) {

				int o;
				JOptionPane.showInternalMessageDialog(null, nome + " Voc� Selecionou MegaCena ");

				o = Integer.parseInt(
						JOptionPane.showInputDialog(null, " informe 6 numeros diferentes Para fazer o Sorteio "));

				if (o >= 6) {

					JOptionPane.showMessageDialog(null, " os numeros digitados foram " + o);
				} else {
					JOptionPane.showMessageDialog(null,
							"Voc� passou do limite de numero ou N�o digitou numeros suficentes", null,
							JOptionPane.ERROR_MESSAGE);
					JOptionPane.showMessageDialog(null, "fechando programa", null, JOptionPane.ERROR_MESSAGE);
					System.exit(0);

				}

				JOptionPane.showInternalMessageDialog(null, nome + " Voc� digitou os Seguintes numeros" + o);
				JOptionPane.showInternalMessageDialog(null, " Os numeros Sorteados Foram ");

				List<Integer> possiveis19 = new ArrayList<Integer>();
				// Inclui os 60 n�meros poss�veis
				for (int i = 0; i < 60; i++) {
					possiveis19.add(i);
				}
				// Embaralha a lista de n�meros
				Collections.shuffle(possiveis19);

				List<Integer> possiveis20 = new ArrayList<Integer>();
				// Inclui os 60 n�meros poss�veis
				for (int i = 0; i < 60; i++) {
					possiveis20.add(i);
				}

				Collections.shuffle(possiveis20);

				List<Integer> possiveis21 = new ArrayList<Integer>();

				for (int i = 0; i < 60; i++) {
					possiveis21.add(i);
				}

				Collections.shuffle(possiveis21);

				List<Integer> possiveis22 = new ArrayList<Integer>();

				for (int i = 0; i < 60; i++) {
					possiveis22.add(i);
				}

				Collections.shuffle(possiveis22);

				List<Integer> possiveis23 = new ArrayList<Integer>();

				for (int i = 0; i < 60; i++) {
					possiveis23.add(i);
				}

				Collections.shuffle(possiveis23);

				List<Integer> possiveis24 = new ArrayList<Integer>();

				for (int i = 0; i < 60; i++) {
					possiveis24.add(i);
				}

				Collections.shuffle(possiveis24);

				// Os sorteados agora s�o os 6 primeiros
				for (int i = 0; i < 1;) {
					JOptionPane.showMessageDialog(null,
							possiveis19.get(i) + " - " + possiveis20.get(i) + " - " + possiveis21.get(i) + " - "
									+ possiveis22.get(i) + " - " + possiveis23.get(i) + " - " + possiveis24.get(i));
					if (o == i) {
						JOptionPane.showInternalMessageDialog(null, "Parabens voc� venceu ");
					} else {

						JOptionPane.showInternalMessageDialog(null, "Voc� n�o ganhou");
					}
				}
			}
		}
	}
}
//deep learning 4j
//visão computacional
//cnn