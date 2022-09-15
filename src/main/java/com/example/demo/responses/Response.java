package com.example.demo.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Response {
    private String fileName;
    private String downloadUri;
    private String fileType;
    private long size;
//    public Response(String fileName,String downloadUri,String fileType,long size){
//        this.fileName=fileName;
//        this.downloadUri=downloadUri;
//        this.fileType=fileType;
//        this.size=size;
//
//    }




}
