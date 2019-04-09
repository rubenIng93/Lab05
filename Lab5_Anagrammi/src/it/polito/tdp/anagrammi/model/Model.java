package it.polito.tdp.anagrammi.model;

import java.util.ArrayList;
import java.util.List;

import it.polito.tdp.anagrammi.db.DizionarioDAO;

public class Model {
	
	private List<String> listaParoleGiuste;
	private List<String> paroleSbagliate = new ArrayList<String>();
	

	public void trova(String s) {
		String parziale = "";
		this.listaParoleGiuste = new ArrayList<String>();
		this.paroleSbagliate = new ArrayList<String>();
		this.recursive(s, 0, parziale, listaParoleGiuste, paroleSbagliate);
	}
	
	public void recursive(String iniziale, int livello, String parziale, List<String> soluzioni, List<String> errori) {
		
		DizionarioDAO dao = new DizionarioDAO();
		
		if(livello == iniziale.length()) {
			if(!soluzioni.contains(parziale)) {
				if(dao.esisteParola(parziale) == true)
					soluzioni.add(parziale);
				else
					errori.add(parziale);
			}
			
			return;
			
		}
		
		for(int i = 0; i < iniziale.length(); i++) {
			char c = iniziale.charAt(i);
			
			if(contaLettere(c, iniziale) > contaLettere(c, parziale)) {
				parziale += c;
				
				recursive(iniziale, livello + 1, parziale, soluzioni, errori);
				parziale = parziale.substring(0, parziale.length() - 1);
			}
		}
	}
	
	public int contaLettere(char c, String iniziale) {
		
		int cont = 0;
		for(int i = 0; i < iniziale.length(); i++) {
			if(iniziale.charAt(i) == c) {
				cont ++;
			}
		}
		return cont;
	}

	public List<String> getListaParole() {
		return listaParoleGiuste;
	}

	public List<String> getParoleSbagliate() {
		return paroleSbagliate;
	}
	
	
	
	
	
	

}
