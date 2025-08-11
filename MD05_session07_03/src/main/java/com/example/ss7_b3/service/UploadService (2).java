package com.example.ss7_b3.service;


import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class UploadService {
    @Autowired
    private ServletContext servletContext;

    public String uploadFile(MultipartFile file){
        if(file!=null && !file.isEmpty()){
            String realPath = "D:\\Model05_JavaWeb\\ss07\\ss7_b3\\src\\main\\resources\\uploads";

            File f = new File(realPath);
            if(!f.exists()){
                f.mkdirs();
            }
            String pathUpload = f.getAbsolutePath()+"/images/"+file.getOriginalFilename();

            try {
                file.transferTo(new File(pathUpload));
                return file.getOriginalFilename();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "";
    }
}
