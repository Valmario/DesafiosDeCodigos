package Desafio;

/* Autor Valmário Lopes

** programa para criar usuário e senha com caracteres mínimos*/

import java.util.Scanner;


public class questao02 {
	public static void main(String[] args) {
	try (Scanner leia = new Scanner (System.in)) {
        String senha = null;
        // criando seu usuário
        System.out.println("Crie seu usuário:");
        leia.nextLine();
        // criando sua senha
        System.out.println("Crie sua senha: ");
        senha=leia.nextLine();
        // caracteres mínimos para criação da senha
        while (true) {
        if (senha.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{6,}"))
        // caso cumpra as regras estabelecidas, cadastro realizado com sucesso
        	{
        	System.out.println("A senha está forte! Cadastro realizado com sucesso!");
        	break;
        	} 
            // caso a senha não cumpra os requisitos, tentar novamente
            else {
        		System.out.println("A senha está fraca.\nUma senha para ser considerada forte necessita:\n"
        		+ "- Possuir no mínimo 6 caracteres.\n- Conter no mínimo 1 digito.\n- Conter no mínimo 1 letra em minúsculo.\n- Conter no mínimo 1 letra em maiúsculo.\n- Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n"
        		+ "Digite a senha novamente: ");
        		senha=leia.nextLine();
        	}

        }
    }
	
}
}