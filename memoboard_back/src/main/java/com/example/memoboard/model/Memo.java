package com.example.memoboard.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Memo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    public Memo(String name) {
        this.name = name;
    }
}
