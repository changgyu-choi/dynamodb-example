package com.amazonaws.codesamples.file;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

@RestController
@Slf4j
public class FileUploadController {
    @Autowired private AmazonS3 amazonS3;

    @GetMapping("/internal/api")
    public String send(){
        return "API CALL";
    }

    @PostMapping("/internal/upload")
    public String upload(@RequestParam(value = "file") MultipartFile multipartFile) throws IOException {

        String s3FileName = "suser/images/" + UUID.randomUUID() + "-" + multipartFile.getName();
        ObjectMetadata objMeta = new ObjectMetadata();
        objMeta.setContentLength(Long.valueOf(multipartFile.getInputStream().available()));

        String bucket = "dynamodb-file-upload-kai";
        amazonS3.putObject(bucket, s3FileName, multipartFile.getInputStream(), objMeta);

        System.out.println("file::name " + s3FileName);

        return amazonS3.getUrl(bucket, s3FileName).toString();
    }
}
