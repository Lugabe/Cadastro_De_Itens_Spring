package Mudi.mudi.dto;

import Mudi.mudi.model.Pedido;
import Mudi.mudi.model.statusPedido;
import jakarta.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {

    @NotBlank
    private String nomeProduto;
    @NotBlank
    private String urlProduto;
    @NotBlank
    private String urlImagem;
    @NotBlank
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {

        Pedido pedido = new Pedido();
        pedido.setDescription(descricao);
        pedido.setUrlImage(urlImagem);
        pedido.setUrlProduct(urlProduto);
        pedido.setNameProduct(nomeProduto);
        pedido.setStatus(statusPedido.AGUARDANDO);

        return pedido;
    }
}

