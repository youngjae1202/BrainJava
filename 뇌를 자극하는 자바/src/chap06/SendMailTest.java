package chap06;

import java.util.Date;
import java.util.Properties;   //�������� �����ϴ� Ŭ����

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMailTest {
   public static void main(String[] args) {

      Properties p = System.getProperties();
      p.put("mail.smtp.starttls.enable", "true"); // gmail�� ������ true ����
      p.put("mail.smtp.host", "smtp.gmail.com"); // smtp ���� �ּ�
      p.put("mail.smtp.auth", "true"); // gmail�� ������ true ����
      p.put("mail.smtp.port", "587"); // gmail ��Ʈ
      

      Authenticator auth = new MyAuthentication();

      // session ���� �� MimeMessage����
      Session session = Session.getDefaultInstance(p, auth);
      MimeMessage msg = new MimeMessage(session);

      try {
         // ���������ð�
         msg.setSentDate(new Date());

         InternetAddress from = new InternetAddress();

         from = new InternetAddress("kosea<test-mail@gmail.com>");   //�������� ������ ������ �������� ������.

         // �̸��� �߽���
         msg.setFrom(from);

         // �̸��� ������
         InternetAddress to = new InternetAddress("zz1004dog@naver.com");
         msg.setRecipient(Message.RecipientType.TO, to);

         // �̸��� ����
         msg.setSubject("���� ���� �׽�Ʈ", "UTF-8");

         // �̸��� ����
         msg.setText("Gmail API���� �����׽�Ʈ��", "UTF-8");

         // �̸��� ���
         msg.setHeader("content-Type", "text/html");

         // ���Ϻ�����
         javax.mail.Transport.send(msg);
         System.out.println("���� ���� �Ϸ�");

      } catch (AddressException addr_e) {
         addr_e.printStackTrace();
      } catch (MessagingException msg_e) {
         msg_e.printStackTrace();
      }
   }

}


class MyAuthentication extends Authenticator {

   PasswordAuthentication pa;

   public MyAuthentication() {

      String id = "Youngjae941202@gmail.com"; // ���� ID
      String pw = "Yj254136!"; // ���� ��й�ȣ

      // ID�� ��й�ȣ�� �Է��Ѵ�.
      pa = new PasswordAuthentication(id, pw);

   }

   // �ý��ۿ��� ����ϴ� ��������
   public PasswordAuthentication getPasswordAuthentication() {
      return pa;
   }
}

