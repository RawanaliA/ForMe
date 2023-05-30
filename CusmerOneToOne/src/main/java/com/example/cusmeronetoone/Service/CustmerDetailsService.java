package com.example.cusmeronetoone.Service;

import com.example.cusmeronetoone.ApiExption.ApiExeption;
import com.example.cusmeronetoone.DTO.CustemerDeteilsDTO;
import com.example.cusmeronetoone.Model.Custmer;
import com.example.cusmeronetoone.Model.CustmerDetails;
import com.example.cusmeronetoone.Repoistory.CustmerDetailsRepoistory;
import com.example.cusmeronetoone.Repoistory.CustmerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping("/api/v1/")
@Service
@RequiredArgsConstructor
public class CustmerDetailsService {
    private final CustmerDetailsRepoistory custmerDetailsRepoistory;
    private  final CustmerRepository custmerRepository;
    public List<CustmerDetails> get1(){
        List<CustmerDetails> custmers=custmerDetailsRepoistory.findAll();

        return custmers;
    }
    public void addDetails(CustemerDeteilsDTO dto){
        Custmer custmer=custmerRepository.findCustmerById(dto.getCustmer_id());
        if (custmer == null) {
            throw new ApiExeption("Can not add Details ,custmer not found");
        }
        CustmerDetails custmerDetails =new CustmerDetails(null, dto.getGender(), dto.getAge(), dto.getEmail(), custmer);
        custmerDetailsRepoistory.save(custmerDetails);
    }
}
