package com.example.caution.controller;

import com.example.caution.domain.CautionQa;
import com.example.caution.repository.CautionQaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/caution")
@CrossOrigin(origins = "*") // 아임웹에서 호출할 수 있도록 설정
public class CautionQaController {

    private final CautionQaRepository repository;

    public CautionQaController(CautionQaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<CautionQa> getCautions(
            @RequestParam(required = false) String chainType,
            @RequestParam(defaultValue = "Y") String isVisible
    ) {
        if (chainType != null) {
            return repository.findByChainTypeAndIsVisible(chainType, isVisible);
        }
        return repository.findAll();
    }
}
