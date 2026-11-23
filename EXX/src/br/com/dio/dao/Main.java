package br.com.dio.dao;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	private final static UserDAO dao = new UserDAO();
	private final static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("Bem-Vindo ao cadastro de usuarios, selecione a operacao desejada");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Deletar");
			System.out.println("4 - Buscar por ID");
			System.out.println("5 - Listar");
			System.out.println("6 - Sair");
			var userInput = sc.nextInt();
			var selectedOption = MenuOption.values()[userInput - 1];
			switch (selectedOption) {
				case SAVE -> {
					var user = dao.save(requestToSave());
					System.out.printf("Usuario cadastrado %s", user);
					
				}
				case UPDATE -> {
					var user =dao.update(requestToUpdate());
					System.out.printf("Usuario Atualizado %s", user);
					
				}
				case DELETE -> {
					dao.delete(requestId());
					System.out.println("Usuario excluido!");
				}
				case FIND_BY_ID -> {
					var id = requestId();
					var user = dao.findById(id);
					System.out.printf("Usuario com ID %s ", id);
					System.out.println(user);
					
				}
				case FIND_ALL -> {
					var users = dao.findAll();
					System.out.println("Usuarios cadastrados: %s");
					users.forEach(System.out::println);
					
				}
				case EXIT -> System.exit(0);
					
					
					
				
			
			
			
			}
		}
	}

	private static long requestId() {
		System.out.println("ID do usuario: ");
		return  sc.nextLong();
		
	}
	private static UserModel requestToSave() {
		System.out.println("Nome do usuario: ");
		var name = sc.nextLine();
		System.out.println("e-mail do usuario: ");
		var email = sc.nextLine();
		System.out.println("Data de nascimento do usuario: (dd/MM/yyyy)");
		var niverString = sc.nextLine();
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		var niver = OffsetDateTime.parse(niverString, formatter);
		return  new UserModel(0, name, email,niver);
	}
	private static UserModel requestToUpdate() {
		System.out.println("ID do usuario: ");
		var id = sc.nextLong();
		System.out.println("Nome do usuario: ");
		var name = sc.nextLine();
		System.out.println("e-mail do usuario: ");
		var email = sc.nextLine();
		System.out.println("Data de nascimento do usuario: (dd/MM/yyyy)");
		var niverString = sc.nextLine();
		var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		var niver = OffsetDateTime.parse(niverString, formatter);
		return  new UserModel(0, name, email,niver);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
