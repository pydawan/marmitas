package br.com.saborgoiano.marmitas.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jedi.db.models.CharField;
import jedi.db.models.DateTimeField;
import jedi.db.models.DecimalField;
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
public class Pedido extends Model {
   
   private static final long serialVersionUID = 1L;
   
   @NonNull
   @ForeignKeyField
   private Cliente cliente;
   
   @DateTimeField(auto_now_add = true, auto_now = true)
   private Date data;
   
   @DecimalField(scale = 5, precision = 2, default_value = "0")
   private BigDecimal preco;
   
   @NonNull
   @TextField
   private String descricao;
   
   @TextField(required = false)
   private String observacoes;
   
   @CharField(max_length = 10, default_value = "REGISTRADO")
   private String situacaoPedido;
   
   private List<Alimento> itens = new ArrayList<>();
   
   public static final List<Alimento> LISTA_ALIMENTOS_VAZIA = new ArrayList<>(0);
   
   public static Manager objects = new Manager(Pedido.class);
   
   public static Pedido of(Cliente cliente, Date data, BigDecimal preco, String descricao, String observacoes, String situacao, List<Alimento> itens) {
      return new Pedido(cliente, data, preco, descricao, observacoes, SituacaoPedido.get(situacao).valor(), itens);
   }
   
   public static Pedido of(Cliente cliente, Date data, BigDecimal preco, String descricao, String observacoes, String situacao) {
      return new Pedido(cliente, data, preco, descricao, observacoes, SituacaoPedido.get(situacao).valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, BigDecimal preco, String descricao, String observacoes) {
      return new Pedido(cliente, data, preco, descricao, observacoes, SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, BigDecimal preco, String descricao) {
      return new Pedido(cliente, data, preco, descricao, "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, BigDecimal preco) {
      return new Pedido(cliente, data, preco, "", "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, BigDecimal preco) {
      return new Pedido(cliente, new Date(), preco, "", "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, Double preco, String descricao, String observacoes, String situacao, List<Alimento> itens) {
      return new Pedido(cliente, data, new BigDecimal(preco), descricao, observacoes, SituacaoPedido.get(situacao).valor(), itens);
   }
   
   public static Pedido of(Cliente cliente, Date data, Double preco, String descricao, String observacoes, String situacao) {
      return new Pedido(cliente, data, new BigDecimal(preco), descricao, observacoes, SituacaoPedido.get(situacao).valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, Double preco, String descricao, String observacoes) {
      return new Pedido(cliente, data, new BigDecimal(preco), descricao, observacoes, SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, Double preco, String descricao) {
      return new Pedido(cliente, data, new BigDecimal(preco), descricao, "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Date data, Double preco) {
      return new Pedido(cliente, data, new BigDecimal(preco), "", "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente, Double preco) {
      return new Pedido(cliente, new Date(), new BigDecimal(preco), "", "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of(Cliente cliente) {
      return new Pedido(cliente, new Date(), new BigDecimal(5.00), "", "", SituacaoPedido.REGISTRADO.valor(), LISTA_ALIMENTOS_VAZIA);
   }
   
   public static Pedido of() {
      return new Pedido();
   }
   
   public Cliente getCliente() {
      return cliente;
   }
   
   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }
   
   public Date getData() {
      return data;
   }
   
   public void setData(Date data) {
      this.data = data;
   }
   
   public BigDecimal getPreco() {
      return preco;
   }
   
   public void setPreco(BigDecimal preco) {
      this.preco = preco;
   }
   
   public void setPreco(Double preco) {
      setPreco(new BigDecimal(preco));
   }
   
   public Pedido preco(Double preco) {
      setPreco(preco);
      return this;
   }
   
   public String getDescricao() {
      return descricao;
   }
   
   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }
   
   public String getObservacoes() {
      return observacoes;
   }
   
   public void setObservacoes(String observacoes) {
      this.observacoes = observacoes;
   }
   
   public String getSituacaoPedido() {
      return situacaoPedido;
   }
   
   public void setSituacaoPedido(String situacaoPedido) {
      this.situacaoPedido = situacaoPedido;
   }
   
}
