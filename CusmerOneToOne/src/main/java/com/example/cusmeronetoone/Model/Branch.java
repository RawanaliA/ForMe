package com.example.cusmeronetoone.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
   @Getter
    @Setter
    @NoArgsConstructor
    @Entity
    @AllArgsConstructor
    public class Branch {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private Integer number;
        private String area;

        @ManyToOne
        @JsonIgnore
        @JoinColumn(name = "merchant_id",referencedColumnName = "id")
        private Merchant merchant;

    }
