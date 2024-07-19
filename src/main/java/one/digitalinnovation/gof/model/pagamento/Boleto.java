package one.digitalinnovation.gof.model.pagamento;

import one.digitalinnovation.gof.model.FormaPagamento;

public class Boleto extends FormaPagamento {

  public String codigoBarras;

  public Boleto() {
  }

  public Boleto(double valor, String descricao, String type, String codigoBarras) {
    super(valor, descricao, type);
    this.codigoBarras = codigoBarras;
  }

  @Override
  public String toString() {
    return "Boleto [codigoBarras=" + codigoBarras + "]";
  }

}
