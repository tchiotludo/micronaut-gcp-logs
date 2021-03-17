package gcp.logs;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.runtime.Micronaut;

@io.micronaut.http.annotation.Controller
public class Controller {
    @Get("/ping")
    public HttpResponse<?> ping() {
        return HttpResponse.ok("pong");
    }

}
