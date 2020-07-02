package cn.cdqf.global.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

public class MailConfig {
    @Autowired
    private JavaMailSender javaMailSender;
    @GetMapping("mail")
    public String mail() throws MessagingException {
        //建立邮件消息
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom("hyf1136153732@163.com");
        mimeMessageHelper.setTo("1136153732@qq.com");
        mimeMessageHelper.setSubject("微服务项目");
        StringBuffer sb = new StringBuffer();
        sb.append("<html><h1>大标题-h1</h1>")
                .append("<p style='color:#F00'>红色字</p>")
                .append("<p style='text-align:right'>右对齐</p></html>");
        mimeMessageHelper.setText(sb.toString());
        javaMailSender.send(mimeMessage);
        return "邮箱发送成功";
    }
}
