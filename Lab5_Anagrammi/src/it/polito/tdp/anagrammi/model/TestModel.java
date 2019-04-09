package it.polito.tdp.anagrammi.model;


public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Model model = new Model();
		
		model.trova("eta");
		
		System.out.println(model.getListaParole().size());

	}

}
