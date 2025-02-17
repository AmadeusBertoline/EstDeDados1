package controller;

public class SomatorioController {

	public SomatorioController() {
		super();
	}

	public int Somar(int n) {
		if (n < 0) {
			return 0;
		} else {

			return n + Somar(n - 1);
		}
	}

}

//Condição de parada: caso o valor seja menor que 0, não haverá somatória pois
//números negativos não são naturais, e subtraem.

//Relação de chamada dos passos: o código irá somar o maior valor com seu antecessor
//sucessivamente até que não exista mais nenhum valor natural para ser somado, "0".