import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
    @GetMapping("/")
	public String Welcome () {
		return "Welcome String Boot!";
	}
}

