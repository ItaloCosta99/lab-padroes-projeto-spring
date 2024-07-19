package one.digitalinnovation.gof.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@ManyToOne
	private Endereco endereco;
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<FormaPagamento> formaPagamentos;

	private Cliente() {
	}

	private Cliente(Builder builder) {
		this.nome = builder.nome;
		this.endereco = builder.endereco;
		this.formaPagamentos = builder.formaPagamentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setFormaPagamentos(List<FormaPagamento> formaPagamentos) {
		this.formaPagamentos = formaPagamentos;
	}

	public List<FormaPagamento> getFormaPagamentos() {
		return formaPagamentos;
	}

	public static class Builder {
		private String nome;
		private Endereco endereco;
		private List<FormaPagamento> formaPagamentos;

		public Builder() {
		}

		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder endereco(Endereco endereco) {
			this.endereco = endereco;
			return this;
		}

		public Builder formaPagamentos(List<FormaPagamento> formaPagamentos) {
			this.formaPagamentos = formaPagamentos;
			return this;
		}

		public Cliente build() {
			return new Cliente(this);
		}
	}
}
