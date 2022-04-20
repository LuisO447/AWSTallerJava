/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo1.service.api.AWSS3Service;

/**
 *
 * @author Luis
 */
@RestController
@RequestMapping("/s3")
public class UploadFileController {
    
    @Autowired
    private AWSS3Service awss3Service;
    
    @PostMapping(value = "/upload")
    public ResponseEntity<String> uploadFile(@RequestPart(value="file") MultipartFile file){
        
        awss3Service.uploadFile(file);
        String response = "El archivo "+file.getOriginalFilename()+" Fue subido correctamente al s3";
        return new ResponseEntity<String>(response, HttpStatus.OK);
            
    }
    
}
