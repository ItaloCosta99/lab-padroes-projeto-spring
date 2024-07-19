package one.digitalinnovation.gof.model.pagamento;

import one.digitalinnovation.gof.model.FormaPagamento;

public class Pix extends FormaPagamento {

  public String chave;

  public Pix() {
  }

  public Pix(double valor, String descricao, String type, String chave) {
    super(valor, descricao, type);
    this.chave = chave;
  }


  @Override
  public String toString() {
    return "Pix [chave=" + chave + "]";
  }

}
