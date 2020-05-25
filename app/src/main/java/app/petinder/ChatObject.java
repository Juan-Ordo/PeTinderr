package app.petinder;

public class ChatObject {

    private String message;
    private Boolean current_User;



    public ChatObject(String message, Boolean current_User){

        this.message = message;
        this.current_User = current_User;


    }

    public String getMessage(){
        return message;
    }

    public  void setMessage(String message){
        this.message = message;
    }

    public Boolean getCurrentUser(){
        return current_User;
    }

    public  void setCurrentUser(Boolean current_User){
        this.current_User = current_User;
    }


}
