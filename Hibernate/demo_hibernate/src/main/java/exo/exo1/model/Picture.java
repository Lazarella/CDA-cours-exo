package exo.exo1.model;

import javax.persistence.*;

@Entity
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "picture_id", nullable = false)
    private Long id;
    private String url;
    @ManyToOne
    @JoinColumn(name="produit_id")
    private Produit produit;

    public Picture() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
