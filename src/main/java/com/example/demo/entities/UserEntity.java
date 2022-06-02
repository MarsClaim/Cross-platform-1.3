package com.example.demo.entities;
import javax.persistence.*;

@Entity

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq_gen" )
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_id_seq", allocationSize = 1)
    @Column(name="id")
    private Integer id;
    @Column(name="matricula", columnDefinition = "varchar(20)", nullable = false)
    private String matricula;

    @Column(name="name", columnDefinition = "varchar(60)", nullable = false)
    private String firstname;

    @Column(name="lastname", columnDefinition ="varchar(60)", nullable = false)
    private String lastname;

    public UserEntity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
