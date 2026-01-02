package car.example.bean;

import org.apache.logging.log4j.message.Message;

public class MyBean {
   private String message;

    public void setMessage(String message){
        this.message=message;
    }

    public void showMessage(){
        System.out.println("Message: " + message);
    }
    @Override
    public String toString(){
     return "MyBean{"+"message='"+ message+'\''+'}';
    }
}
