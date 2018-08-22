package br.com.saborgoiano.marmitas.model;

/**
 * @author thiago-amm
 * @version v1.0.0 22/08/2018
 * @since v1.0.0
 */
public enum SituacaoPedido {
   
   REGISTRADO("Registrado", "REGISTRADO"),
   ATENDIDO("Atendido", "ATENDIDO"),
   ENVIADO("Enviado", "ENVIADO"),
   PAGO("Pago", "PAGO"),
   CANCELADO("Cancelado", "CANCELADO");
   
   private final String nome;
   private final String valor;
   
   private SituacaoPedido(final String nome, final String valor) {
      this.nome = nome;
      this.valor = valor;
   }
   
   public String getNome() {
      return nome;
   }
   
   public String getValor() {
      return valor;
   }
   
   public String nome() {
      return nome;
   }
   
   public String valor() {
      return valor;
   }
   
   public static SituacaoPedido get(String situacaoPedido) {
      SituacaoPedido retorno = SituacaoPedido.REGISTRADO;
      situacaoPedido = situacaoPedido == null ? "" : situacaoPedido.trim().toUpperCase();
      if (situacaoPedido.matches("^(REGISTRADO|ATENDIDO|ENVIADO|PAGO|CANCELADO)$")) {
         retorno = SituacaoPedido.get(situacaoPedido);
      }
      return retorno;
   }
   
   public static String get(SituacaoPedido situacaoPedido) {
      String retorno = SituacaoPedido.REGISTRADO.valor();
      if (situacaoPedido != null) {
         for (SituacaoPedido sp : SituacaoPedido.values()) {
            if (sp.equals(situacaoPedido)) {
               retorno = sp.getValor();
               break;
            }
         }
      }
      return retorno;
   }
   
   @Override
   public String toString() {
      return String.format("SituacaoPedido(nome=%s, valor=%s)", nome, valor);
   }
   
}
