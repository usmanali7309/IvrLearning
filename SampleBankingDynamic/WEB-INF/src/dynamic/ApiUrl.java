package dynamic;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Global")
public class ApiUrl {

    private String languagePreferenceUrl;
    private String checkAccountBalanceUrl;
    private String changeAtmPinUrl;
    private String sendValidateOtpUrl;
    private int time;

    @XmlElement(name = "LanguagePreferenceUrl")
    public String getLanguagePreferenceUrl() {
        return languagePreferenceUrl;
    }

    public void setLanguagePreferenceUrl(String languagePreferenceUrl) {
        this.languagePreferenceUrl = languagePreferenceUrl;
    }

    @XmlElement(name = "ChechAccountBalanceUrl")
    public String getCheckAccountBalanceUrl() {
        return checkAccountBalanceUrl;
    }

    public void setCheckAccountBalanceUrl(String checkAccountBalanceUrl) {
        this.checkAccountBalanceUrl = checkAccountBalanceUrl;
    }

    @XmlElement(name = "ChangeAtmPinUrl")
    public String getChangeAtmPinUrl() {
        return changeAtmPinUrl;
    }

    public void setChangeAtmPinUrl(String changeAtmPinUrl) {
        this.changeAtmPinUrl = changeAtmPinUrl;
    }

    @XmlElement(name = "SendValidateOtpUrl")
    public String getSendValidateOtpUrl() {
        return sendValidateOtpUrl;
    }

    public void setSendValidateOtpUrl(String sendValidateOtpUrl) {
        this.sendValidateOtpUrl = sendValidateOtpUrl;
    }

    @XmlElement(name = "Time")
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "GlobalConfig [languagePreferenceUrl=" + languagePreferenceUrl + ", checkAccountBalanceUrl="
                + checkAccountBalanceUrl + ", changeAtmPinUrl=" + changeAtmPinUrl + ", sendValidateOtpUrl="
                + sendValidateOtpUrl + ", time=" + time + "]";
    }
}

