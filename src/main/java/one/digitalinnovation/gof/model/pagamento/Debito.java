package one.digitalinnovation.gof.model.pagamento;

import one.digitalinnovation.gof.model.FormaPagamento;

public class Debito extends FormaPagamento {

  public String numero;
  public String cvv;

  public Debito() {
  }

  public Debito(double valor, String descricao, String type, String numero, String cvv) {
    super(valor, descricao, type);
    this.numero = numero;
    this.cvv = cvv;
  }

  @Override
  public String toString() {
    return "Debito [numero=" + numero + ", cvv=" + cvv + "]";
  }

}
