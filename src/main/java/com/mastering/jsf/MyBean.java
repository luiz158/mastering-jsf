package com.mastering.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class MyBean {

	private String nome = "Alexandre Gama";
			
	public String getNome() {
		return nome;
	}
	
}
