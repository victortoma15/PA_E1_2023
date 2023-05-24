<<<<<<< HEAD
package com.example.compulsory;

import jakarta.persistence.*;

@Entity
@Table(name="player")
public class Player {
    @Id
    private Long id;
    @Column(name="name")
    private String name;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Player(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
=======
package com.example.compulsory;

import jakarta.persistence.*;

@Entity
@Table(name="player")
public class Player {
    @Id
    private Long id;
    @Column(name="name")
    private String name;

    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Player(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
>>>>>>> 54bbad2d4db5bceef095e7b6145b52a531aaaf18
}