package com.kb.mensagem;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MensagemApplication {

	public static void main(String[] args) {
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(MensagemApplication.class, args);
		//System.out.println("ALEXANDRE Pai grande");
	JOptionPane.showMessageDialog(null, "Alexandre");	
	}

}
