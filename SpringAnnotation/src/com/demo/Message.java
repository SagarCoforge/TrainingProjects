package com.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Message {
	 

    private String id;
    private String message;
 
    //create setter method for this to inject the dependency  has-relationship
    @Autowired
    WriteMessage writeMessage;
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 

 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    
    //calling another class mehtod from here   injection dependeny here
    public void show() {
        writeMessage.WriteMessage();

    }
}
