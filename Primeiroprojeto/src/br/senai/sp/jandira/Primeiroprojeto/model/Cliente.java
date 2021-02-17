package br.senai.sp.jandira.Primeiroprojeto.model;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {

	 private String name;
	 private LocalDate dataDeNascimento;
	 private String sexo;
	 private double peso;
	 private double altura;
	 private double nivelAtividade;
	 
public void setName(String name) {
   this.name = name;
}

public String getName() {
	   return this.name;
	}

public void setDatadenascimento(LocalDate datadenascimento) {
		this.dataDeNascimento = datadenascimento;
}

public LocalDate getDatadenascimento() {
	   return this.dataDeNascimento;
}

public void setSexo(String sexo ) {
	this.sexo = sexo;
	
}

public String getSexo() {
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

public void setNiveldeatividade(double niveldeatividade ) {
	this.nivelAtividade = niveldeatividade;
}

public double getNiveldeativade() {
	   return this.nivelAtividade;
}

//* Obter a idade de nascimento

public int getIdade() {
  LocalDate hoje = LocalDate.now();
 Period periodo = Period.between(this.dataDeNascimento, hoje);
 return periodo.getYears();
}

//*Calcular IMC da pessoas
public double getImc() {
	return this.peso/(this.altura* this.altura);
	
}

public String getStatusImc() {
	if (this.getImc() < 18.5) {
		return "Abaixo do peso";
	} else if (this.getImc() > 18.5 && this.getImc() < 25) {
		return "Peso Ideal";
	} else if (this.getImc() > 25 && this.getImc() < 30) {
		return "Levemente acima do peso";
	} else if (this.getImc() > 30 && this.getImc() < 35) {
		return "Obesidade grau I";
	} else if (this.getImc() > 35 && this.getImc() < 40) {
		return "Obesidade grau II";
	} else {
		return "Obesidade Grau III";
	}
}

//Calcular Ncd Homem
public double getNcd() {
	  double ncd = 0;
	  
	  if (this.sexo == "Masculino") {
		 // Em relação a idade
	  if(this.getIdade() >= 18 && this.getIdade() <30) {
		  ncd = 15.3 * this.peso + 679;
	  } else if (this.getIdade() >=31 && this.getIdade() <61) {
		  ncd = 11.6 + this.peso + 879;
	  } else {
		   ncd = 13.5 * this.peso + 489; 
	  }

	  
	  if (this.nivelAtividade == NivelAtividade.LEVE1) {
		  ncd *= 1.5;
	  } else if (this.nivelAtividade == NivelAtividade.MODERADO1) {
		  ncd *= 1.8;
	  } else if (this.nivelAtividade == NivelAtividade.INTENSO1) {
		 ncd *= 2.1; 
	  }
		  
}

if (this.sexo == "Feminino") {
	 // Em relação a idade
 if(this.getIdade() >= 18 && this.getIdade() < 30) {
	  ncd = 14.7 * this.peso + 496;
 } else if (this.getIdade() >=31 && this.getIdade() <=61) {
	  ncd = 8.7 + this.peso + 829;
 } else {
	   ncd = 10.5 * this.peso + 596; 
 }
 
 
 if (this.nivelAtividade == NivelAtividade.LEVE1) {
	  ncd *= 1.6;
 } else if (this.nivelAtividade == NivelAtividade.MODERADO1) {
	  ncd *= 1.6;
 } else if (this.nivelAtividade == NivelAtividade.INTENSO) {
	 ncd *= 1.8; 
 }
	  
 }
    return ncd;
    
}
	  
}

   
   
   
   
   
   



























































