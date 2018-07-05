package demo.springboot.chapter2springbootconfig.web;

import demo.springboot.chapter2springbootconfig.config.BookProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBookController
{
    @Autowired
    BookProperties bookProperties;

    @GetMapping("/book/hello")
    public String sayHello()
    {
        return "hello," + bookProperties.getWriter() + " is writing"
                + bookProperties.getName() + "!";
    }

}
