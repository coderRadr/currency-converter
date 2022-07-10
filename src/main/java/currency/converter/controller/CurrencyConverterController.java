package currency.converter.controller;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.HttpClient;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@Controller
public class CurrencyConverterController {

    @Inject
    HttpClient client;
    
    @Get("/getExchangeRates")
    public Object getRates() {
        HttpRequest<Object> request = HttpRequest.GET("https://api.exchangerate.host/latest");
        Object response = client.toBlocking().exchange(request, Object.class).body();
        return response;
    }

//    @View("index")
//    @Get("/")
//    public void showHomePage() {
//
//    }
}
