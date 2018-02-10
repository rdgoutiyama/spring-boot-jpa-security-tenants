package br.com.rutiyama;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ORDER_T")
@Entity
public class Order {
    private static final String GENERATOR = "ORDER_ID_GENERATOR";
    private static final String SEQUENCE = "ORDER_SEQ";

    @Id
    @SequenceGenerator(name = GENERATOR, sequenceName = SEQUENCE, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENERATOR)
    @Column(name = "ID", updatable = false)
    private Long id;

    private String nome;

    private Date date;

    public Order() {

    }
    public Order(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDate() {
        return date;
    }
}
