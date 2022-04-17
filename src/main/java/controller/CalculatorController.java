package controller;


import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @RequestMapping("/calculate")
    public String calculate(Model model, @RequestParam(name = "number1", defaultValue = "0") double number1,
                            @RequestParam(name = "number2", defaultValue = "0") double number2,
                            @RequestParam(name = "calculation", defaultValue = "0") String cal) {
        double result = 0;
        switch (cal) {
            case "Addition(+)":
                result = number1 + number2;

                break;
            case "Subtraction(-)":
                result = number1 - number2;
                break;
            case "Multiplication(X)":
                result = number1 * number2;
                break;
            case "Division(/)":
                result = number1 / number2;

        }
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("result", result);
        return "index";
    }
}
