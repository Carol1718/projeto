package br.com.Primeiroprojeto.gui;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.LocalDate;

import javax.naming.ldap.Rdn;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import br.senai.sp.jandira.Primeiroprojeto.model.Cliente;


public class FrameTela {
	

	public void criarTela() {
		
	
	
	JFrame telaCliente = new JFrame ();
	telaCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	telaCliente.setTitle("Calculando o IMC E NCD");
	telaCliente.setSize(600, 550);
	Color verde = new Color (153, 234, 191);
	
	//Nome do Cliente
	
	 JLabel labelNome = new JLabel();
	 labelNome.setText("Nome do Cliente: ");
	 labelNome.setBounds(10, 20, 120, 30);
	 labelNome.setFont(new Font ("Arial", Font.BOLD, 13));
	 
	 JTextField textNome = new JTextField();
	 textNome.setBounds(120, 20, 150, 30);
	 
	
	 
	 // idade
	 
	 JLabel labelIdade = new JLabel ();
	 labelIdade.setText(" Idade: ");
	 labelIdade.setBounds(10, 70, 50, 30);
	 labelIdade.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JTextField textIdade = new JTextField();
	 textIdade.setBounds(170, 70, 90, 30);
	 
	 
      // sexo
	 
	 JLabel labelSexo = new JLabel();
	 labelSexo.setText("Sexo: ");
	 labelSexo.setBounds(10, 120, 80, 30);
	 labelSexo.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JRadioButton radioMasculino = new JRadioButton("Masculino");
	 radioMasculino.setBounds(200, 120, 120, 30);
	 JRadioButton radioFeminino = new JRadioButton("Feminino");
	 radioFeminino.setBounds(100, 120, 80, 30);
	 ButtonGroup bg = new ButtonGroup();
	 bg.add(radioMasculino);bg.add(radioFeminino);
	 Color green = new Color(153, 234, 191);
	 radioMasculino.setBackground(verde);
	 radioFeminino.setBackground(verde);
	 
 	 //Peso
	 
	 JLabel labelPeso = new JLabel ();
	 labelPeso.setText("Peso: ");
	 labelPeso.setBounds(10, 160, 80, 30);
	 labelPeso.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JTextField textPeso = new JTextField();
	 textPeso.setBounds( 80, 160, 80, 30);
	 
	 //Altura
	 
	 JLabel labelAltura = new JLabel ();
	 labelAltura.setText("Altura: ");
	 labelAltura.setBounds(10, 220, 80, 30);
	 labelAltura.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JTextField textAltura = new JTextField();
	 textAltura.setBounds(80, 210, 80, 30);
	 
	 //Atividade fisica
	 
	 JLabel labelAtividade = new JLabel();
	 labelAtividade.setText("Atividade Física: ");
	 labelAtividade.setBounds(10, 275, 120, 30);
	 labelAtividade.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JComboBox<String> box = new JComboBox<String>();
	 box.setBounds(120, 275, 120, 30);
	 
	 JPanel container = new JPanel();
	 

	 box.addItem("Leve");
	 box.addItem("Moderado");
	 box.addItem("Intenso");
	 container.add(box);
	 
	 //Button
	 
	 JButton buttonCalcular = new JButton();
	 buttonCalcular.setText("Calcular");
	 buttonCalcular.setBounds(150, 400, 110, 30);
	 Color verdebebe = new Color (217, 234, 153);
	 buttonCalcular.setBackground(verdebebe);
	 buttonCalcular.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JButton buttonLimpar = new  JButton();
	 buttonLimpar.setText("Limpar");
	 buttonLimpar.setBounds(275, 400, 110, 30);
	 Color azul = new Color(153, 217, 234);
	 buttonLimpar.setBackground(azul);
	 buttonLimpar.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 
	 //Valores
	 
	 JLabel labelValores = new JLabel ();
	 labelValores.setText("Resultado ");
	 labelValores.setFont(new Font ("Arial", Font.BOLD,16));
	 labelValores.setBounds(400, 50, 100, 60);
	 
	 //IMC
	 
	 JLabel labelImc = new JLabel ();
	 labelImc.setText("IMC: ");
	 labelImc.setBounds(400, 80, 160, 30);
	 labelImc.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JTextField textImc = new JTextField();
	 
	 
	 //NCD
	 JLabel labelNCD = new JLabel ();
	 labelNCD.setText("NCD: ");
	 labelNCD.setBounds(400, 180, 80, 30);
	 labelNCD.setFont(new Font ("Arial", Font.BOLD,13));
	 
	 JTextField textNCD = new JTextField();
	 
	 

    telaCliente.getContentPane().add(textNCD);
    
    telaCliente.getContentPane().add(labelNCD);
    
    telaCliente.getContentPane().add(textImc);
   
    telaCliente.getContentPane().add(labelImc);
    
    telaCliente.getContentPane().add(labelValores);
    
    telaCliente.getContentPane().add(buttonLimpar);
    
    telaCliente.getContentPane().add(buttonCalcular);
   
    telaCliente.getContentPane().add(labelAtividade);
   
    telaCliente.getContentPane().add(container);
   
    telaCliente.getContentPane().add(box);
   
    telaCliente.getContentPane().add(textAltura);
   
    telaCliente.getContentPane().add(labelAltura);
   
    telaCliente.getContentPane().add(textPeso);
    
    telaCliente.getContentPane().add(labelPeso);
     
    telaCliente.getContentPane().add(radioFeminino);
    
    telaCliente.getContentPane().add(radioMasculino);
    
    telaCliente.getContentPane().add(labelSexo);
   
  
    
    telaCliente.getContentPane().add(textIdade);
    
    telaCliente.getContentPane().add(labelIdade);
    
    telaCliente.getContentPane().add(textNome);
  
    telaCliente.getContentPane().add(labelNome);
   
    telaCliente.getContentPane().setBackground(azul);
    telaCliente.setLayout(null);
    telaCliente.setVisible(true);
    
 // *** Ouvintes de açoes/eventos
 // *** Ouvintes de açoes/eventos
    buttonCalcular.addActionListener(new ActionListener() {
    	
   	 @Override
   		public void actionPerformed(ActionEvent e) {
   			
   			
   			Cliente aluno = new Cliente();
   			aluno.setPeso(Double.parseDouble(textPeso.getText()));
			aluno.setAltura(Double.parseDouble(textAltura.getText()));
			aluno.setSexo(String.valueOf(radioMasculino.isSelected()?"Masculino":"Feminino"));
			aluno.setIdade(Integer.parseInt(textIdade.getText()));
			aluno.setNivelDeAtividade(String.valueOf(box.getSelectedItem().toString()));
			
			labelImc.setText("IMC: " + String.valueOf(aluno.getImc()));
			labelNCD.setText("NCD: " + String.valueOf(aluno.getNcd()));
		}
	});


    //Botão limpar
    
    buttonLimpar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			textNome.setText("");
			textAltura.setText("");
			textIdade.setText("");
			textPeso.setText("");
			labelImc.setText("");
			labelNCD.setText("");
			labelAtividade.setText("Nenhuma Atividade");
		}
	});
	}
}
    	
    
    
    
    
		

	
    
   	

    
	
	
