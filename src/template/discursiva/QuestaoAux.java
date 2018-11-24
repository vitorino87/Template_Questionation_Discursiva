package template.discursiva;

import java.util.List;
import java.util.Random;

import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.content.Context;

public class QuestaoAux {
	// esse método serve para embaralhar o array v[]

	/**
	 * Serve para embaralhar o array adicionado
	 * 
	 * @param v
	 */
	public static void embaralhar(int[] v) {

		Random random = new Random();

		for (int i = 0; i < (v.length - 1); i++) {

			// sorteia um índice
			int j = random.nextInt(v.length);

			// troca o conteúdo dos índices i e j do vetor
			int temp = v[i];
			v[i] = v[j];
			v[j] = temp;
		}
	}

	/**
	 * Serve para alimentar o array com números de 0 até o tamanho do array
	 * 
	 * @param w
	 */
	public static void alimentador(int[] w) {
		for (int i = 0; i < w.length; i++) {
			w[i] = i;
		}
	}

	// método para verificar se a resposta selecionada está correta
	// possui 3 assinaturas a primeira é o número da questão
	// a segunda é o array
	// a terceira é o objeto radio
	/**
	 * Serve para checar a resposta selecionada
	 * 
	 * @param c
	 *            número da questao
	 * @param b
	 *            array
	 * @param rd
	 *            objeto rádio
	 * @param Tela
	 *            classe
	 */
	public static void checked(int c, int b[][], RadioButton[] rd, Context Tela, List<Integer> l) {
		for (int i = 0; i < 5; i++) {
			if (rd[i].isChecked()) {
				if (l.get(i) == b[c][5]) {
					Toast.makeText(Tela, "Correto", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(Tela, "Errado", Toast.LENGTH_SHORT).show();
				}
				break;
			}
		}
	}

	public void apresentarQuestaoErrada(Context Tela, List<String> resp, boolean gab) {
		if (!gab) {
			Toast.makeText(Tela, "Errado! Resposta correta: " + resp, Toast.LENGTH_SHORT).show();					
			//System.out.println("Errado! Resposta correta: " + resp);
		} else {
			Toast.makeText(Tela, "Correto! Resposta correta: " + resp, Toast.LENGTH_SHORT).show();
			//System.out.println("Correto! ");
		}
	}

	public boolean verificarQuestaoCorreta(String respUI, List<String> resp, String linha) {
		int aux = 0;
		boolean gab = false;
		// String gab="";
		if (linha.contains(" ou "))
			aux = 1;
		else if (linha.contains(", "))
			aux = 2;
		switch (aux) {
		case 1:
			//System.out.println("posicao 0: " + resp.get(0));
			//System.out.println("posicao 1: " + resp.get(1));
			//System.out.println("posicao 2: " + resp.get(2));
			for (int i = 0; i < resp.size(); i++) {
				if (respUI.contains(resp.get(i)))
					gab = true;
			}

			//if (gab)
				//System.out.println("ok");
			break;

		case 2:
			for (int i = 0; i < resp.size(); i++) {
				if (respUI.contains(resp.get(i)))
					gab = true;
				else {
					gab = false;
					break;
				}

			}
			break;

		default:
			if (respUI.contains(resp.get(0)))
				gab = true;
			break;
		}
		return gab;
	}

	//processa a linha e armazena as respostas na variável resp
	public void processarLinha(String linha, List<String> resp) {

		if (linha.contains(" ou ") || linha.contains(", ")) { // verifica se a
																// linha tem os
																// caracteres
																// desejados

			int position = linha.indexOf(" ou "); // captura a 1ª posicao dos
													// caracteres desejados
			if (position == -1) {

				position = linha.indexOf(", ");
				resp.add(linha.substring(0, position));
				//System.out.println(resp.get(0));
				linha = linha.substring(position + 2, linha.length());
				//System.out.println(linha);
				processarLinha(linha, resp);

			} else {

				resp.add(linha.substring(0, position)); // adiciona a 1ª
														// resposta
				System.out.println(resp.get(0));
				linha = linha.substring(position + 4, linha.length());
				System.out.println(linha);
				processarLinha(linha, resp);

			}
		} else {
			resp.add(linha);
		}
	}
}
