import java.util.Scanner;

public class Main {

	private int menor = 0;
	private int mayor = 0;
	private float beneficios = 0;


	public static void main(String args[]) {
		Main m = new Main();

		//1 2 3,3 4 5
		Scanner n = new Scanner(System.in);
		String entrada = n.nextLine();
		n.close();

		String[] cortes = entrada.split("\\s+");
		//float[] cortesNum = m.cambiar(0, cortes, new float[cortes.length]);

		//int i = m.menorPos(0,cortesNum,0);
		//int j = m.mayorPos(0,cortesNum,0);
		//int k = m.menorBeneficio(0, cortesNum, 0);
		/*
		 * Sabiendo las posiciones donde esta el valor maximo y el valor minimo 
		 * solo habria que sacar la diferencia de de los valores que ocupan esas diferencias
		 * diferencia = arrayValores[j] - arrayValores[i];
		 */

		//System.out.printf("%d %d %.02f\n",i+1,j+1, cortesNum[j]-cortesNum[i]);

		/*
		 * Para cuando el valor del beneficio es negativo
		 * 
		 * No me guarda el valor de maximo en el menorBeneficio 
		 * Mirar las condiciones ¿Se puede guardar el valir de menorPos desde menorBeneficio?
		 * 
		 * 
		 * en vez de buscar el valor maximo o el minimo, buscar la mayor diferencia entre dos valores del array
			probrar este caso 3 7 9 2 8 1 4

		 */

		//System.out.println(cortesNum[k]);
		//System.out.printf("%d %d %.02f\n",i+1,k+1, cortesNum[i]-cortesNum[k]);

	}

	/**
	 * (contador, condicion final, incremento)
	 *  
	 * @param i = 0
	 * @param cortes = [esta lleno de strings]
	 * @param relleno = [esta vacio]
	 * @return relleno
	 */
	/*private float[] cambiar(int i, String[] cortes, float[] relleno) {
		if(i == cortes.length){
			return relleno;
		}

		cortes[i] = cortes[i].replace(',', '.');
		relleno[i] = Float.parseFloat( cortes[i] );

		return cambiar(i+1, cortes, relleno);
	}

	public int menorPos(int i, float arrayPrueba[], int posMenor){
		if(i == arrayPrueba.length){
			return posMenor;
		}

		if (i == 0){
			posMenor = i;
			return menorPos(i+1, arrayPrueba, posMenor);
		}else{
			if(arrayPrueba[posMenor] >= arrayPrueba[i]){
				posMenor = i;
				return menorPos(i+1, arrayPrueba, posMenor);
			}else{
				return menorPos(i+1, arrayPrueba, posMenor);
			}
		}
	}

	public int mayorPos(int i, float arrayPrueba[], int posMayor){
		if(i == arrayPrueba.length){
			return posMayor;
		}

		if (i == 0){
			posMayor = i;
			return mayorPos(i+1, arrayPrueba, posMayor);
		}else{
			if(arrayPrueba[posMayor] < arrayPrueba[i]){
				posMayor = i;
				return mayorPos(i+1, arrayPrueba, posMayor);
			}else{
				return mayorPos(i+1, arrayPrueba, posMayor);
			}
		}
	}*/


	public int maxBeneficio(int i, int arrayPrueba[], int n){


		float aux = 0;
		if(i == arrayPrueba.length){
			return menor;
		}
		
		if(i == 0){
			menor = mayor = i;
		}else{
			if(arrayPrueba[mayor] < arrayPrueba[i]){
				mayor = i;
				return 
			}
			}
		if(arrayPrueba[mayor] < arrayPrueba[i+1]){
			mayor = i+1;
			beneficios = arrayPrueba[mayor] - arrayPrueba[menor];

			aux = arrayPrueba[i+1]-arrayPrueba[i];
			if(aux > beneficios){
				beneficios = aux;
				mayor = arrayPrueba[i+1];
				menor = arrayPrueba[i];
			}
		}
			/*
			 * if(i == arrayPrueba.length){
			return menor;
		}else{
			if(arrayPrueba[mayor] < arrayPrueba[i]){
				mayor = i;
				return posiciones(i+1, arrayPrueba, mayor);
			}else if(arrayPrueba[menor] > arrayPrueba[i]){
				menor = i;
				return posiciones(i+1, arrayPrueba, menor);
			}else{
				return posiciones(i+1, arrayPrueba, n);
			}

			beneficios = arrayPrueba[mayor] - arrayPrueba[menor];

			 */		

		}
	}





































	/*int posMenor = m.menorPos(0,cortesNum,0);
		int posMayor = m.mayorPos(0,cortesNum,0);

		int posMenor = 0;
		int posMayor = 0;

		if(i == arrayPrueba.length){
			return posBeneficio;
		}

		if(i == 0){
			posBeneficio = i;
			return menorPos(i+1, arrayPrueba, posMenor);
		}else{
			if(arrayPrueba[posMenor] > arrayPrueba[i]){ //Guarda el menor valor en posMenor
				posMenor = i;
				return menorPos(i+1, arrayPrueba, posMenor);
			}else if(arrayPrueba[posMayor] < arrayPrueba[i]){ //Guarda el mayor valor en posMayor
				posMayor = i;
				return mayorPos(i+1, arrayPrueba, posMayor);
			}else if(arrayPrueba[posMayor] <= arrayPrueba[i] && arrayPrueba[i] > arrayPrueba[posMenor]){ //
				posBeneficio = i;
				return menorBeneficio(i+1, arrayPrueba, posBeneficio);
			}
		}
		return posBeneficio;*/
}



