/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo1.service.api;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Luis
 */
public interface AWSS3Service {
    
    void uploadFile(MultipartFile file);
    
}
