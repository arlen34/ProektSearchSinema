package com.company;

import lombok.*;

@Data
public class Director {
    private String directorName;
    private String directorLastName;

    public Director(String directorName, String directorLastName) {
        this.directorName = directorName;
        this.directorLastName = directorLastName;
    }
}
