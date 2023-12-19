package guru.springframework.spring6webapp;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 

@RestController
@RequestMapping(path="/api", produces="application/json")
@CrossOrigin(origins="*") 
public class RestApiTest {

	
	@GetMapping( "/ola")
	public String coucou(){
		return "Olaaaaaaaaaaaaaaaa";
	}
	
	@GetMapping("/dingdong")
	public ResponseEntity<String> name() {
		return ResponseEntity.ok(LocalDateTime.now().toString());
		
	}	
}
