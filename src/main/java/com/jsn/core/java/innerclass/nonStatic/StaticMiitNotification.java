package com.jsn.core.java.innerclass.nonStatic;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class StaticMiitNotification {

    private static String type;

      //sms related props
    private String toMobile;
    private String fromMobile;
    private String mnoHost;
    private String mnoPort;
    private String mnoName;


    @Setter
    @Getter
    static class StaticEmailNotification {

        //email related props
        private String smtpHost;
        private String smtpPort;
        private String toEmail;
        private String fromEmail;

        public String getEmailInfo(){
            return "ToEmail:"+toEmail+" ; Type:"+type;
        }

    }

    public static void main(String[] args) {

    }





}
