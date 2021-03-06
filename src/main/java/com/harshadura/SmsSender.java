package com.harshadura;

import java.util.Map;
import java.util.HashMap;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;
import com.twilio.sdk.resource.factory.SmsFactory;
import com.twilio.sdk.resource.instance.Sms;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SmsSender extends HttpServlet {

    public static String ACCOUNT_SID;
    public static String AUTH_TOKEN;

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        String ACCOUNT_SID = request.getParameter("twilioAccSID");
        String AUTH_TOKEN = request.getParameter("twilioAuthToken");

        String smsTo = request.getParameter("smsTo");
        String smsFrom = request.getParameter("smsFrom");
        String smsText = request.getParameter("smsText");

        try {
            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
            Account account = client.getAccount();
            SmsFactory smsFactory = account.getSmsFactory();
            Map<String, String> smsParams = new HashMap<String, String>();
            smsParams.put("To", smsTo);
            smsParams.put("From", smsFrom);
            smsParams.put("Body", smsText);
            Sms sms = smsFactory.create(smsParams);

            response.getWriter().print("<h2>SMS sent successfully!</h2>\n\nStatus: " + sms.getStatus());
        }
        catch (Exception e){
            response.getWriter().print("<h2>Error occurred while sending SMS!</h2>\n\nError: " + e.getMessage());
        }
    }
}