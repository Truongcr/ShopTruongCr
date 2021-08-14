package com.shoptruongcr.model;

import com.shoptruongcr.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {

    private String jwt;
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
}
