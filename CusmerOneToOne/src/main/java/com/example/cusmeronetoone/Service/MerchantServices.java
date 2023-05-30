package com.example.cusmeronetoone.Service;

import com.example.cusmeronetoone.Model.Branch;
import com.example.cusmeronetoone.Model.Merchant;
import com.example.cusmeronetoone.Repoistory.BranchRepository;
import com.example.cusmeronetoone.Repoistory.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MerchantServices {
    private final MerchantRepository merchantRepository ;
    public List<Merchant> getAllTeachers(){
        return merchantRepository.findAll();
    }
    public void addBranch(Merchant merchant  ){
        merchantRepository.save(merchant);
    }
}
