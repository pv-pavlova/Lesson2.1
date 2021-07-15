package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.LocalTime;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private static final String tempdata = "%s";
    private static final String temptime = "%s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/date")
    public DataTime time() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        return new DataTime(String.format(tempdata, date), String.format(temptime, time));
    }
}
