package com.example.nexwaveinsurance.controller;

import com.example.nexwaveinsurance.entity.RegisterForm;
import com.example.nexwaveinsurance.service.NexwaveInsuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class NexwaveInsuranceController {

    private final NexwaveInsuranceService nexwaveInsuranceService;

    public NexwaveInsuranceController(NexwaveInsuranceService nexwaveInsuranceService) {
        this.nexwaveInsuranceService = nexwaveInsuranceService;
    }

@PostMapping("/add")
    public RegisterForm addNexwave(@RequestBody RegisterForm registerForm){
        return nexwaveInsuranceService.add(registerForm);
    }
@PutMapping("/update/{id}")
    public void updNexwave(@PathVariable int id,@RequestBody RegisterForm registerForm){
        nexwaveInsuranceService.updated(id,registerForm);
    }

@GetMapping("/get")
    public List<RegisterForm> getNexwave(){

    return   nexwaveInsuranceService.get();

    }
@DeleteMapping("del/{id}")
    public void delNexwave(@PathVariable String id){
        nexwaveInsuranceService.del(id);

    }

}



