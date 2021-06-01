package Login;
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
            this.loginAdapter.loginOperation(id, password);
        }
        else if(method.equalsIgnoreCase("Gmail")){
            loginAdapter = new loginAdpater("Gmail");
            this.loginAdapter.loginOperation(id, password);

        }
        else{
            loginAdapter = new loginAdpater("String");
            this.loginAdapter.loginOperation(id, password);

        }
        
    }
    
}
