package com.example.cusmeronetoone.Service;

import com.example.cusmeronetoone.ApiExption.ApiExeption;
import com.example.cusmeronetoone.Model.Branch;
import com.example.cusmeronetoone.Model.Merchant;
import com.example.cusmeronetoone.Repoistory.BranchRepository;
import com.example.cusmeronetoone.Repoistory.MerchantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BranchServices {
    private final BranchRepository branchRepository;
    private final MerchantRepository merchantRepository;
    public List<Branch> getAllTeachers(){
        return branchRepository.findAll();}
    public void addBranch(Branch branch ){
        branchRepository.save(branch);
    }
    //Assign New
    public void assighnMerchantToBranch(Integer merchant_id,Integer branch_id){
        Merchant merchant=merchantRepository.findMerchantById(merchant_id);
        Branch branch=branchRepository.findBranchByid(branch_id);
        if(merchant==null||branch==null){
            throw new ApiExeption("Merchant Or Branch are Null");
        }
        branch.setMerchant(merchant);
        branchRepository.save(branch);
    }
    public void updateBranch(Branch branch,Integer id){
        Branch branch1= branchRepository.getById(id);
        if(branch1==null){
            throw new ApiExeption("Branch not found");
        }
       branch1.setArea(branch.getArea());
        branch1.setNumber(branch.getNumber());
        branchRepository.save(branch1);

    }
    public void deleteBranch(Integer id){
        Branch branch = branchRepository.findBranchByid(id);
        if(branch==null){
            throw new ApiExeption("teacher not found");
        }

        branchRepository.delete(branch);
    }
}
