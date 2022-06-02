package com.example.demo.entities;
import javax.persistence.*;

@Entity

public class Suplier{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", columnDefinition = "varchar(60)", nullable = false)
    private String name;
    @Column(name = "country", columnDefinition = "varchar(60)", nullable = false)
    private String country;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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