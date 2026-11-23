package br.com.dio.dao;

import java.time.OffsetDateTime;
import java.util.Objects;

public class UserModel{
	
	
	private long id;
	private String nome;
	private String email;
	private OffsetDateTime niver;
	
	public UserModel() {
		
	}
	
	
	
	public UserModel(long id, String nome, String email, OffsetDateTime niver) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.niver = niver;
	}



	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public OffsetDateTime getNiver() {
		return niver;
	}
	public void setNiver(OffsetDateTime niver) {
		this.niver = niver;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(niver, other.niver)
				&& Objects.equals(nome, other.nome);
	} 
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, email,niver);
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + 
				", nome=" + nome + 
				", email=" + email + 
				", niver=" + niver + "]";
	}
	
	
	
	
	
	

}
