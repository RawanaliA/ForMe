package com.example.cusmeronetoone.Controller;

import com.example.cusmeronetoone.DTO.CustemerDeteilsDTO;
import com.example.cusmeronetoone.Model.CustmerDetails;
import com.example.cusmeronetoone.Service.CustmerDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/custmerdetails")
@RequiredArgsConstructor
public class CustmerDetailsController {
    private final CustmerDetailsService custmerDetailsService;
    @GetMapping("/get")
    public ResponseEntity getDtalisOfCustmer(){
        List<CustmerDetails> AllDeOfService=custmerDetailsService.get1();
        return ResponseEntity.status(200).body(AllDeOfService);


    }
    @PostMapping("/add")
    public ResponseEntity adDetailsToCustmer(@RequestBody CustemerDeteilsDTO dto){
        custmerDetailsService.addDetails(dto);
        return ResponseEntity.status(200).body("add Sucssfuly");
    }

}
