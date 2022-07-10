package currency.converter.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrencyConverterGetResponse {
    private boolean success;
    private CurrencyEnum base;
    private Date date;
    private Rates rates;

    public CurrencyConverterGetResponse() {
    }

    public CurrencyConverterGetResponse(boolean success, CurrencyEnum base, Date date, Rates rates) {
        this.success = success;
        this.base = base;
        this.date = date;
        this.rates = rates;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public CurrencyEnum getBase() {
        return base;
    }

    public void setBase(CurrencyEnum base) {
        this.base = base;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }
}
