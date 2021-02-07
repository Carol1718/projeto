package br.senai.sp.jandira.Primeiroprojeto.model;

import java.time.LocalDate;

public class Cliente {

	 private String name;
	 private LocalDate datadenascimento;
	 private char sexo;
	 private double peso;
	 private double altura;
	 private int niveldeatividade;
	 
public void setName(String name) {
   this.name = name;
}

public String getName() {
	   return this.name;
	}

public void setDatadenascimento(LocalDate datadenascimento) {
	this.datadenascimento = datadenascimento;
}

public LocalDate getDatadenascimento() {
	   return this.datadenascimento;
}

public void setSexo(char sexo ) {
	this.sexo = sexo;
	
}

public char getSexo() {
	   return this.sexo;
}

public void setPeso(double peso ) {
	this.peso = peso;
}

public double getPeso() {
	   return this.peso;
}

public void setAltura(double altura ) {
	this.altura = altura;
}

public double getaltura() {
	   return this.altura;
}

public void setNiveldeatividade(int niveldeatividade ) {
	this.niveldeatividade = niveldeatividade;
}

public int getNiveldeativade() {
	   return this.niveldeatividade;
}

public double calcularImc() {

	return this.peso/ this.altura * this.altura;
	
}
 public double calcularNcd() {
	 
	 if (this.sexo == 'M') {
		 if (this.getDatadenascimento() >= 18 && this.getDatadenascimento() < 31) {
			 double calcularNcd = 15.3 * this.peso + 679;
	  } else if (this.getDatadenascimento() >= 31 && this.getDatadenascimento() <= 60) 
		 double calcularNcd = 11.6 * this.peso + 879;
	  } else {
		  double calcularNcd = 13.5 * this.peso + 487;  
	  }
 }
	 
 
}
}






















































