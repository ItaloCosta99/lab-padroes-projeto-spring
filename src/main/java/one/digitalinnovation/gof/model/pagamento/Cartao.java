package one.digitalinnovation.gof.model.pagamento;

import one.digitalinnovation.gof.model.FormaPagamento;

public class Cartao extends FormaPagamento {

  public String numero;
  public String dataExpiracao;
  public String cvv;

  public Cartao() {
  }

  public Cartao(double valor, String descricao, String type, String numero, String dataExpiracao, String cvv) {
    super(valor, descricao, type);
    setId(super.getId());
    this.numero = numero;
    this.dataExpiracao = dataExpiracao;
    this.cvv = cvv;
  }

  @Override
  public String toString() {
    return "Cartao [numero=" + numero + ", dataExpiracao=" + dataExpiracao + ", cvv=" + cvv + "]";
  }

}
