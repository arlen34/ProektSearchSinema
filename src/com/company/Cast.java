package com.company;

import lombok.*;

@Data
public class Cast {
    private String actor;
    private String role;

    public Cast(String actor, String role) {
        this.actor = actor;
        this.role = role;
    }
}
