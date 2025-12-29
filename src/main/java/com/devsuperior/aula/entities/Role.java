package com.devsuperior.aula.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authoridy;



    public Role(){}

    public Role(Long id, String authoridy) {
        this.id = id;
        this.authoridy = authoridy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthoridy() {
        return authoridy;
    }

    public void setAuthoridy(String authoridy) {
        this.authoridy = authoridy;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(authoridy, role.authoridy);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(authoridy);
    }
}
