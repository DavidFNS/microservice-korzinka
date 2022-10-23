package com.example.deliveryservice.controller;

import com.example.deliveryservice.dto.LandmarkDto;
import com.example.deliveryservice.service.LandmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shared.libs.dto.ResponseDto;

import java.util.List;

@RestController
@RequestMapping("/landmark")
@RequiredArgsConstructor
public class LandmarkController {

    private final LandmarkService landmarkService;

    @GetMapping("/{id}")
    public ResponseDto<List<LandmarkDto>> getAllByCityId(@PathVariable Integer id) {
        return landmarkService.getAllByCityId(id);
    }
}
