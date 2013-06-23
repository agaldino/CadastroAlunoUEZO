package com.br.cadastrodealunosuezo;

public class Aluno {
	
	private int id;
	private String nome;
	private String endereco;
	private String tel;
	private String email;
	
	public Aluno(){
		
	}
	
	public Aluno(String nome, String endereco, String tel, String email){
		
		this.nome = nome;
		this.endereco = endereco;
		this.tel = tel;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getTel() {
		return tel;
	}

	public String getEmail() {
		return email;
	}
	
	public int getId(){
		return id;
	}
	
}
