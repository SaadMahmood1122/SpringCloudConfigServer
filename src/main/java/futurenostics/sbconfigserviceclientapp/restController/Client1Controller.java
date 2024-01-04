package futurenostics.sbconfigserviceclientapp.restController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class Client1Controller {
   @Value("${msg:Properties not loaded from the github plz try again}")
    String msg;
    @GetMapping("/")
    public ResponseEntity<String> showMsg(){
        return new ResponseEntity<String>(msg, HttpStatus.OK);
    }
}
