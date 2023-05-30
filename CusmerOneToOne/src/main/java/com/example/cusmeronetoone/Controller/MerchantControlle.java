package com.example.cusmeronetoone.Controller;

import com.example.cusmeronetoone.ApiResponce.ApiResponce;
import com.example.cusmeronetoone.Model.Branch;
import com.example.cusmeronetoone.Model.Merchant;
import com.example.cusmeronetoone.Service.BranchServices;
import com.example.cusmeronetoone.Service.MerchantServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/merchant")
@RequiredArgsConstructor
public class MerchantControlle {
    private final MerchantServices merchantServices ;
    @GetMapping("/get")
    public ResponseEntity getAllCustomers(){
        List<Merchant> customerList=merchantServices.getAllTeachers();
        return ResponseEntity.status(200).body(customerList);
    }


    @PostMapping("/add")
    public ResponseEntity addCustomer(@Valid @RequestBody Merchant merchant){
        merchantServices.addBranch(merchant);
        return ResponseEntity.status(200).body(new ApiResponce("Merchant added"));
    }
}
