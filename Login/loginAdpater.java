public class loginAdpater implements login {
    loginMethod method;

    public loginAdpater(String methodChosen){
        if(methodChosen.equalsIgnoreCase("Facebook")){
            method = new loginFacePage();
        }
        else if(methodChosen.equalsIgnoreCase("Gmail")){
            method = new loginGmailPage();
        }
        else {
            method = new loginSimplePage();
        }
    }

    @Override
    public void loginOperation(String id, String password) {
        if(method.getClass().equals(loginFacePage.class)){
            method.loginFace(id, password);
        }
        else if(method.getClass().equals(loginGmailPage.class)){
            method.loginGmail(id, password);
        }
        else{
            method.loginSimple(id, password);
        }
        
    }
    
}
