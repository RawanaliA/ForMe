package com.example.cusmeronetoone.Controller;

import com.example.cusmeronetoone.ApiResponce.ApiResponce;
import com.example.cusmeronetoone.Model.Custmer;
import com.example.cusmeronetoone.Service.CustomerService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/custmer")
public class CustmerController {
    private final CustomerService customerService;
    @GetMapping("/get")
    public ResponseEntity getAllCustomers(){
        List<Custmer> customerList=customerService.get();
        return ResponseEntity.status(200).body(customerList);
    }


    @PostMapping("/add")
    public ResponseEntity addCustomer(@Valid @RequestBody Custmer customer){
        customerService.addCustmer(customer);
        return ResponseEntity.status(200).body(new ApiResponce("customer added"));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity updateCustomer(@Valid @RequestBody Custmer customer, @PathVariable Integer id){
        customerService.updateCustmer(customer,id);
        return ResponseEntity.status(200).body("customer Updated");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustmer(id);
        return ResponseEntity.status(200).body("customer deleted");
    }
}
