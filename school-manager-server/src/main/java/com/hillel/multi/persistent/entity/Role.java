package com.hillel.multi.persistent.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "authorities")
@AllArgsConstructor
@NoArgsConstructor
public class Role implements GrantedAuthority {
    public static final List<String> ROLES = new ArrayList<>();
    public static final String USER = "USER";
    public static final String SUPER_USER = "SUPER_USER";
    static {
        ROLES.add(USER);
        ROLES.add(SUPER_USER);
    }
    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    private String authority;
    @Override
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public Role(String authority) {
        this.authority = authority;
    }
}
