package com.springreact.react.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReactEntity {

    @Id
    @GeneratedValue
    public Long id;

    @Column(name = "fullName")
    public String fullName;

    @Column(name = "email")
    public String email;


    public ReactEntity(String fName, String e){
        this.fullName = fName;
        this.email = e;

    }
    
}
