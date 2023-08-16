import org.springframework.web.bind.annotation.GetMapping;

public class ApiController {
    @GetMapping("disp")
	public String Welcome() {
		return "Hello World !!";
	}
}

