package br.com.saborgoiano.marmitas.model;

import jedi.db.models.BooleanField;
import jedi.db.models.CharField;
import jedi.db.models.EmailField;
import jedi.db.models.Manager;
import jedi.db.models.Model;
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
public class Usuario extends Model {
   
   private static final long serialVersionUID = 1L;
   
   @NonNull
   @CharField(max_length = 50)
   private String login;
   
   @NonNull
   @CharField(max_length = 50)
   private String senha;
   
   @EmailField(unique = true)
   private String email;
   
   @CharField(max_length = 255, required = false)
   private String nome;
   
   @BooleanField(default_value = false)
   private Boolean admin;
   
   @CharField(max_length = 7, default_value = "ATIVO")
   private String situacaoCadastro;
   
   public static Manager objects = new Manager(Usuario.class);
   
   public static Usuario of(String login, String senha, String email, String nome, Boolean admin, String situacaoCadastro) {
      return new Usuario(login, senha, email, nome, admin, SituacaoCadastro.get(situacaoCadastro).valor());
   }
   
   public static Usuario of(String login, String senha, String email) {
      return new Usuario(login, senha, email, "", false, SituacaoCadastro.ATIVO.valor());
   }
   
   public static Usuario of() {
      return new Usuario();
   }
   
   public String getLogin() {
      return login;
   }
   
   public void setLogin(String login) {
      this.login = login;
   }
   
   public String getSenha() {
      return senha;
   }
   
   public void setSenha(String senha) {
      this.senha = senha;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }
   
   public Boolean getAdmin() {
      return admin;
   }
   
   public void setAdmin(Boolean admin) {
      this.admin = admin;
   }
   
   public String getSituacaoCadastro() {
      return situacaoCadastro;
   }
   
   public void setSituacaoCadastro(String situacaoCadastro) {
      this.situacaoCadastro = situacaoCadastro;
   }
   
}
