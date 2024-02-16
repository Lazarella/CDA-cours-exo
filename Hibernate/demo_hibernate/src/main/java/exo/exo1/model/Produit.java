package exo.exo1.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String reference;
    private Date dateAchat;
    private Double prix;
    private int stock;
    @OneToMany(mappedBy = "produit", cascade= CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Picture> pictures;

    @OneToMany(mappedBy ="produit", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Comment> comments;

    public Produit() {
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Produit : " +
                "id =" + id +
                ", marque ='" + marque + '\'' +
                ", reference ='" + reference + '\'' +
                ", dateAchat =" + dateAchat +
                ", prix =" + prix +
                ", stock actuel =" + stock +
                '}';
    }
}
