public class loginDoing implements login {
    loginAdpater loginAdapter;
    String method;
    public loginDoing(String name){
        method = name;
    }
    @Override
    public void loginOperation(String id, String password) {
        if(method.equalsIgnoreCase("Facebook")){
            loginAdapter = new loginAdpater("Facebook");
        }
        else if(method.equalsIgnoreCase("Gmail")){
            loginAdapter = new loginAdpater("Gmail");
        }
        else{
            loginAdapter = new loginAdpater("String");
        }
        
    }
    
}
