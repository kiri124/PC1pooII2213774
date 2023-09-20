public class SendGridAdapter implements MailAdapter{
    private SendGrid sendgrid;
    
    public SendGridAdapter(String api){
        this.sendgrid=new SendGrid();
    }

@Override
public void sendMail(String cliente, String asunto,String mensaje){
    
}

}
