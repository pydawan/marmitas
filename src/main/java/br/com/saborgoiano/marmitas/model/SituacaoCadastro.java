package br.com.saborgoiano.marmitas.model;

/**
 * <p>
 * Representa as situações cadastrais possíveis para
 * um registro no banco de dados desse sistema de informação.
 * </p>
 * 
 * @author thiago-amm
 * @version v1.0.0 22/08/2018
 * @since v1.0.0
 */
public enum SituacaoCadastro {
   
   ATIVO("Ativo", "ATIVO"), 
   INATIVO("Inativo", "INATIVO");
   
   private final String nome;
   private final String valor;
   
   private SituacaoCadastro(final String nome, final String valor) {
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
   
   public static SituacaoCadastro get(String situacaoCadastro) {
      SituacaoCadastro retorno = SituacaoCadastro.INATIVO;
      situacaoCadastro = situacaoCadastro == null ? "" : situacaoCadastro.trim().toUpperCase();
      if (situacaoCadastro.matches("^(ATIVO|INATIVO)$")) {
         if (situacaoCadastro.equals("ATIVO")) {
            retorno = SituacaoCadastro.ATIVO;
         } else {
            retorno = SituacaoCadastro.INATIVO;
         }
      }
      return retorno;
   }
   
   public static String get(SituacaoCadastro situacaoCadastro) {
      String retorno = situacaoCadastro == null ? SituacaoCadastro.INATIVO.valor() : SituacaoCadastro.ATIVO.valor();
      return retorno;
   }
   
   @Override
   public String toString() {
      return String.format("SituacaoCadastro(nome=%s, valor=%s)", nome, valor);
   }
   
}
