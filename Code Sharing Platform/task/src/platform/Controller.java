package platform;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("code")
    public String getAPIInterface() {
        return "<html>\n" +
                "<head>\n" +
                "    <title>Code</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <pre>\n" +
                "public static void main(String[] args) {\n" +
                "    SpringApplication.run(CodeSharingPlatform.class, args);\n" +
                "}</pre>\n" +
                "</body>\n" +
                "</html>";
    }

    @GetMapping("api/code")
    public String getWebInterface() {
        return "{\n"   +
                "\"code\": \"public static void main(String[] args) {\\n    SpringApplication.run(CodeSharingPlatform.class, args);\\n}\"\n"
                + "}";
    }
}
