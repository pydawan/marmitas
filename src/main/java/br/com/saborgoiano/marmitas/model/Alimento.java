package br.com.saborgoiano.marmitas.model;

import jedi.db.models.CharField;
import jedi.db.models.ForeignKeyField;
import jedi.db.models.Manager;
import jedi.db.models.Model;
import jedi.db.models.TextField;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @author thiago-amm
 * @version v1.0.0 22/08/2018
 * @since v1.0.0
 */
@Getter
@Setter
@Accessors(fluent = true, chain = true)
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames = true)
public class Alimento extends Model {
   
   private static final long serialVersionUID = 1L;
   
   @NonNull
   @CharField(max_length = 255, unique = true)
   private String nome;
   
   @ForeignKeyField(required = false)
   private GrupoAlimento grupo;
   
   @TextField(required = false)
   private String descricao;
   
   @CharField(max_length = 255, required = false)
   private String imagem;
   
   @CharField(max_length = 255, required = false)
   private String thumbnail;
   
   @CharField(max_length = 7, default_value = "ATIVO")
   private String situacaoCadastro;
   
   public static Manager objects = new Manager(Alimento.class);
   
   public static Alimento of(String nome, GrupoAlimento grupo, String descricao, String imagem, String thumbnail, String situacaoCadastro) {
      return new Alimento(nome, grupo, descricao, imagem, thumbnail, SituacaoCadastro.get(situacaoCadastro).valor());
   }
   
   public static Alimento of(String nome, GrupoAlimento grupo, String descricao, String imagem, String thumbnail) {
      return new Alimento(nome, grupo, descricao, imagem, thumbnail, SituacaoCadastro.ATIVO.valor());
   }
   
   public static Alimento of(String nome, GrupoAlimento grupo, String descricao) {
      return new Alimento(nome, grupo, descricao, "", "", SituacaoCadastro.ATIVO.valor());
   }
   
   public static Alimento of(String nome, GrupoAlimento grupo) {
      return new Alimento(nome, grupo, "", "", "", SituacaoCadastro.ATIVO.valor());
   }
   
   public static Alimento of(String nome) {
      return new Alimento(nome, null, "", "", "", SituacaoCadastro.ATIVO.valor());
   }
   
   public static Alimento of() {
      return new Alimento();
   }
   
   public String getNome() {
      return nome;
   }
   
   public void setNome(String nome) {
      this.nome = nome;
   }
   
   public GrupoAlimento getGrupo() {
      return grupo;
   }
   
   public void setGrupo(GrupoAlimento grupo) {
      this.grupo = grupo;
   }
   
   public String getDescricao() {
      return descricao;
   }
   
   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }
   
   public String getImagem() {
      return imagem;
   }
   
   public void setImagem(String imagem) {
      this.imagem = imagem;
   }
   
   public String getThumbnail() {
      return thumbnail;
   }
   
   public void setThumbnail(String thumbnail) {
      this.thumbnail = thumbnail;
   }
   
   public String getSituacaoCadastro() {
      return situacaoCadastro;
   }
   
   public void setSituacaoCadastro(String situacaoCadastro) {
      this.situacaoCadastro = situacaoCadastro;
   }
   
}
