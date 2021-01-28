package calculator;

import org.springframework.web.bind.annotation.*;

@RestController
class ArithmeticRestController {


    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2) {
        num1 += num2;
        return "" + num1;
    }

    @GetMapping("/substract")
    public String substract(@RequestParam int num1, @RequestParam int num2) {
        num1 -= num2;
        return "" + num1;
    }

    @GetMapping("/mult")
    public String mult(@RequestParam int num1, @RequestParam int num2) {
        num1 *= num2;
        return "" + num1;
    }

    @GetMapping("/*")
    public String error() {
        return "Unknown operation";
    }
}