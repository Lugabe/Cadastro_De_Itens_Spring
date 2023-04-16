package Mudi.mudi.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Pedido {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameProduct;
    private String description;
    private BigDecimal priceNegociation;
    private LocalDate dateDelivery;
    private String urlProduct;
    private String urlImage;

    @Enumerated(EnumType.STRING)
    private statusPedido status;


    public statusPedido getStatus() {
        return status;
    }

    public void setStatus(statusPedido status) {
        this.status = status;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public String getUrlProduct() {
        return urlProduct;
    }

    public void setUrlProduct(String urlProduct) {
        this.urlProduct = urlProduct;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public BigDecimal getPriceNegociation() {
        return priceNegociation;
    }

    public void setPriceNegociation(BigDecimal priceNegociation) {
        this.priceNegociation = priceNegociation;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
