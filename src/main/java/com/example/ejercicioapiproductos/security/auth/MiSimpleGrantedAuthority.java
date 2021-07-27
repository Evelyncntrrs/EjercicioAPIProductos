package com.example.ejercicioapiproductos.security.auth;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "authorities")
public class MiSimpleGrantedAuthority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer authority_id;


    @Override
    public String getAuthority() {
        return null;
    }
}
