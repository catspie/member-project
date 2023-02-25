package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");
        return "hello";
    }

    //객체를 보낼 경우, json 방식(name:value)으로 출력됨, xml 거의 안씀 이제, 가장 많이 사용
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;

        public Hello(String name) {
            this.name = name;
        }

        public Hello() {

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
//    body 부분에 직접 값을 넣어주겠다는 의미의 매핑, view 필요 x, 잘 안씀
    @ResponseBody
    public String helloString(@RequestParam(name = "name") String name) {
        return "hello " + name; //"hello spring"
    }
}

