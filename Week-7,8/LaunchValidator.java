interface Validator{
    String validate(String msg);
}


class PhoneNumberValidator implements Validator{

    public String validate(String msg){
        return msg;
    }
}

class EmailValidator implements Validator{

    public String validate(String msg){
        return msg;
    }
}

class PasswordValidator implements Validator{

    public String validate(String msg){
        return msg;
    }
}



public class LaunchValidator {
    public static void main(String [] args){
        PhoneNumberValidator ph = new PhoneNumberValidator();
        System.out.println(ph.validate("phone is validate successfully"));



        PasswordValidator pw = new PasswordValidator();
        System.out.println(pw.validate("pwd is validate"));

        EmailValidator ev = new EmailValidator();
        System.out.println(ph.validate("email verifies"));




        

    }
    
}
