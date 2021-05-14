package sorteio.ods;

import java.util.*;

public class ListaOds extends Pacotao {

	public ArrayList<String> ods = new ArrayList<>();
	

	public void listaCompleta() {

		String ods1 = "Erradica��o da probleza";
		ods.add(ods1);
		String ods2 = "Fome zero e agricultura sustent�vel";
		ods.add(ods2);
		String ods3 = "Sa�de e Bem-estar";
		ods.add(ods3);
		String ods4 = "Educa��o de qualidade";
		ods.add(ods4);
		/*String ods5 = "Igualdade de G�nero";
		ods.add(ods5);
		String ods6 = "�gua pot�vel e Saneamento";
		ods.add(ods6);
		String ods7 = "Energia Acessivel e Limpa";
		ods.add(ods7);
		String ods8 = "Trabalho decente e crescimento econ�mico";
		ods.add(ods8);
		String ods9 = "Ind�stria, Inova��o e Infra-estrutra";
		ods.add(ods9);
		String ods10 = "Redu��o das desigualdades";
		ods.add(ods10);
		String ods11 = "Cidades e comunidades sustent�veis";
		ods.add(ods11);
		String ods12 = "Consumo e produ��o respons�veis";
		ods.add(ods12);
		String ods13 = "A��o contra a mudan�a global do clima";
		ods.add(ods13);
		String ods14 = "Vida na �gua";
		ods.add(ods14);
		String ods15 = "Vida terrestre";
		ods.add(ods15);
		String ods16 = "Paz, justi�a e intitui��es eficazes";
		ods.add(ods16);
		String ods17 = "Parcerias e meios de implementa��o";
		ods.add(ods17);*/

	}
	
	public void playOds() {
		Collections.shuffle(ods);
		System.out.println(ods.get(1));
	}
 
	public ArrayList<String> getOds() {
		return ods;
	}

	public void setOds(ArrayList<String> ods) {
		this.ods = ods;
	}

	public void mostrar() {
		for (int contador = 0; contador < 17; contador++) {
			System.out.println(ods.get(contador));
		}

	}

}