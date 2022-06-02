package com.example.demo.entities;
import javax.persistence.*;

@Entity

public class ProductStock{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(60)", nullable = false)
    private String name;
    @Column(name = "quantity", columnDefinition = "varchar(60)", nullable = false)
    private String quantity;

    @Column(name = "country_from", columnDefinition = "varchar(40)", nullable = false)
    private String country_from;

    @Column(name = "country_to", columnDefinition = "varchar(40)", nullable = false)
    private String country_to;
    public String getCountry_to() {
        return country_to;
    }

    public void setCountry_to(String country_to) {
        this.country_to = country_to;
    }


    public String getCountry_from() {
        return country_from;
    }

    public void setCountry_from(String country_from) {
        this.country_from = country_from;
    }



    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
