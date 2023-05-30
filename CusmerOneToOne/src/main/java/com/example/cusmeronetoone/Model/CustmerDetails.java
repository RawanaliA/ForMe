package com.example.cusmeronetoone.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table
public class CustmerDetails {
    @Id
    private Integer id;
    @Column(columnDefinition = "varchar(20 )not null")
    private String gender;
    @Column(columnDefinition = "varchar(20 )not null")
    private Integer age;
    private String email;
    @OneToOne
    @MapsId
    @JsonIgnore
    private Custmer custmer;

}
