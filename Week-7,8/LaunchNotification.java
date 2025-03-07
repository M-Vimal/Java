interface Notification{
    String sendNotification(String message);
    void getStatus();
}

class EmailNotification implements Notification{
    public String sendNotification(String msg){
        return msg;
    }

    public void getStatus(){
        System.out.println("received from email");
    }

}


class SmsNotification implements Notification{
    public String sendNotification(String msg){
        return msg;
    }

    public void getStatus(){
        System.out.println("received from sms");
    }

}

public class LaunchNotification {
    public static void main(String[] args){
        EmailNotification em = new EmailNotification();
        System.out.println(em.sendNotification("one msg from email"));
        em.getStatus();

        SmsNotification sm=new SmsNotification();
        System.out.println(sm.sendNotification("msg from sms"));
        sm.getStatus();

    }
    
}
