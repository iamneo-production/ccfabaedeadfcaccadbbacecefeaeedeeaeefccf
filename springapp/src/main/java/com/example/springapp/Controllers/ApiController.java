

@RestController
public class ApiController{

	@GetMapping("/")
	public String Welcome(){
		return "Welcome String Boot!";
	}
}
