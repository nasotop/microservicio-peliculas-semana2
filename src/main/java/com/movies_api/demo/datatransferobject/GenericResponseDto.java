package com.movies_api.demo.datatransferobject;

import java.util.List;

public class GenericResponseDto<T> {
    private boolean Status;
    private String ErrorMessage;
    private List<T> Content;  
    
    public GenericResponseDto(){
        Status = true;
    }

    public void setStatus(boolean status){
        Status = status;
    }
    public void setErrorMessage(String errorMessage){
        ErrorMessage = errorMessage;
    }
    public void setContent(List<T> content){
        Content = content;
    }

  
    public boolean getStatus(){
        return this.Status;
    }
    
    public String getErrorMessage(){
        return this.ErrorMessage;
    }
    
    public List<T> getContent(){
        return this.Content;
    }

    public void loadError(String errorMessage){
        Status = false;
        ErrorMessage =  errorMessage;
    }

}
