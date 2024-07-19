package one.digitalinnovation.gof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import one.digitalinnovation.gof.model.pagamento.Boleto;
import one.digitalinnovation.gof.model.pagamento.Cartao;
import one.digitalinnovation.gof.model.pagamento.Debito;
import one.digitalinnovation.gof.model.pagamento.Pix;

@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = Cartao.class, name = "CARTAO"),
    @JsonSubTypes.Type(value = Boleto.class, name = "BOLETO"),
    @JsonSubTypes.Type(value = Pix.class, name = "PIX"),
    @JsonSubTypes.Type(value = Debito.class, name = "DEBITO")
})
public class FormaPagamento {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public double valor;
  public String descricao;
  public String type;

  public FormaPagamento() {
  }

  public FormaPagamento(double valor, String descricao, String type) {
    this.valor = valor;
    this.descricao = descricao;
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public double getValor() {
    return valor;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return "FormaPagamento [valor=" + valor + ", descricao=" + descricao + ", tipo=" + "]";
  }

}
