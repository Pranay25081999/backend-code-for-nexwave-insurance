package com.example.nexwaveinsurance.service;

import com.example.nexwaveinsurance.entity.RegisterForm;
import com.example.nexwaveinsurance.repository.NexwaveInsuranceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NexwaveInsuranceService {

    private final NexwaveInsuranceRepository nexwaveInsuranceRepository;

    public NexwaveInsuranceService(NexwaveInsuranceRepository nexwaveInsuranceRepository) {
        this.nexwaveInsuranceRepository = nexwaveInsuranceRepository;
    }


    public RegisterForm add(RegisterForm registerForm){

        return nexwaveInsuranceRepository.save(registerForm);
    }

    public void updated(int id, RegisterForm registerForm){
        nexwaveInsuranceRepository.save(registerForm);
    }

    public List<RegisterForm>  get(){
      return  nexwaveInsuranceRepository.findAll();
    }

    public void del(String id){
        nexwaveInsuranceRepository.deleteById(id);
    }

}
