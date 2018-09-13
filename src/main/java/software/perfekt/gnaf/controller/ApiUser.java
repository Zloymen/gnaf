package software.perfekt.gnaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import software.perfekt.gnaf.service.UserService;

/*@RestController
@RequestMapping(value = "/users")*/
public class ApiUser {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET, consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity refreshPayBorrow() {
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

}
