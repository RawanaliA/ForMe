package com.example.cusmeronetoone.Service;

import com.example.cusmeronetoone.ApiExption.ApiExeption;
import com.example.cusmeronetoone.Model.Custmer;
import com.example.cusmeronetoone.Repoistory.CustmerRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustmerRepository custmerRepository ;
    //crud
    public List<Custmer>get(){
        List<Custmer> custmers=custmerRepository.findAll();

        return custmers;
    }
    public Custmer addCustmer(Custmer custmer){
        Custmer custmer1=custmerRepository.save(custmer);
        return  custmer1;
    }
    public Custmer updateCustmer(Custmer custmer, Integer id) {
        Custmer custmer1=custmerRepository.getById(id);
        if (custmer1 == null) {
            throw new ApiExeption("Enter correct id");
        }
        custmer1.setName(custmer.getName());
        custmerRepository.save(custmer1);
        return custmer1;}
    public Custmer deleteCustmer(Integer id){
            Custmer custmer2 = custmerRepository.getById(id);
            if (custmer2 == null) {
                throw new ApiExeption("Enter correct id");
            }
            custmerRepository.deleteById(id);
            return custmer2;
        }
}
