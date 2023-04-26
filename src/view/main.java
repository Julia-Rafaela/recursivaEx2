package view;

import controller.vet;

public class main {
	public static void main(String[] args) {
		vet ControllerVet= new vet();
		int [] vt = {79,3,9,5,19};
		int tam = vt.length;
		int Ultmenor=vt[tam -1];
		int menor = ControllerVet.menorvalor(vt, tam,Ultmenor );
		System.out.println("Menor valor do vetor é " + menor);
		
	}
}
