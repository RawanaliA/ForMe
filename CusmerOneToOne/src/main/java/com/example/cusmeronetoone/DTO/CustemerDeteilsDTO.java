package com.example.cusmeronetoone.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustemerDeteilsDTO {
    private Integer custmer_id;

    private String gender;
    private Integer age;
    private String email;
}
