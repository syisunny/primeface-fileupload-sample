package com.sample.bean;

import org.primefaces.event.FileUploadEvent;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean(name = "fileUploadController")
public class FileUploadController {

    public void onStartFunction() {
        System.out.println("Start uploading files");
    }

    public void onCompleteFunction() {
        System.out.println("Finish uploading files");
        displayResult();
    }

    public void displayResult() {
            FacesMessage msg = new FacesMessage("File(s) upload finish");
            FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void handleFileUpload(FileUploadEvent event) {
        String fileName = event.getFile().getFileName();
        System.out.println("Handle a file:" + fileName);

    }

}