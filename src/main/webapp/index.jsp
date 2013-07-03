<html>
<body>

<center>
    <h1>Twilio SMS Sending test!</h1>
    <br/>
    <form action="sms" method="post">

        <h3>Twilio Config</h3>
        <br/><br/>

        <table border="1">

            <tr>
                <td>Twilio-ACCOUNT_SID</td>
                <td><INPUT TYPE=TEXT NAME="twilioAccSID"></td>
            </tr>
            <tr>
                <td>Twilio-AUTH_TOKEN</td>
                <td><INPUT TYPE=TEXT NAME="twilioAuthToken"></td>
            </tr>

        </table>

        <br/><br/>

        <h3>Send SMS</h3>

        <table border="1">
            <tr>
                <td>SMS-To (eg:+94724417633)</td>
                <td><INPUT TYPE=TEXT NAME="smsTo"></td>
            </tr>
            <tr>
                <td>SMS-From [eg:(830) 584-1770]</td>
                <td><INPUT TYPE=TEXT NAME="smsFrom"></td>
            </tr>
            <tr>
                <td>SMS-Text:</td>
                <td><INPUT TYPE=TEXT NAME="smsText"></td>
            </tr>
        </table>

        <br/><br/>
        <INPUT TYPE=SUBMIT VALUE="Send SMS!">

    </form>
</center>
</body>
</html>
