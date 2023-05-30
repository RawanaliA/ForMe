package com.example.cusmeronetoone.Controller;

import com.example.cusmeronetoone.ApiResponce.ApiResponce;
import com.example.cusmeronetoone.Model.Branch;
import com.example.cusmeronetoone.Model.Custmer;
import com.example.cusmeronetoone.Service.BranchServices;
import com.example.cusmeronetoone.Service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/branch")
@RequiredArgsConstructor
public class BranchController {
    private final BranchServices branchServices;
    @GetMapping("/get")
    public ResponseEntity getAllCustomers(){
        List<Branch> customerList=branchServices.getAllTeachers();
        return ResponseEntity.status(200).body(customerList);
    }


    @PostMapping("/add")
    public ResponseEntity addCustomer(@Valid @RequestBody Branch branch){
        branchServices.addBranch(branch);
        return ResponseEntity.status(200).body(new ApiResponce("Branch added"));
    }
    @PutMapping("/{merchnt_id}/assign/{branch_id}")
    public ResponseEntity assighnMerchantToBranch(@Valid @PathVariable Integer merchnt_id,@PathVariable Integer branch_id){
        branchServices.assighnMerchantToBranch(merchnt_id, branch_id);
        return ResponseEntity.status(200).body(new ApiResponce("Merchant assighn to Branch "));
    }

}
