package software.perfekt.gnaf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import software.perfekt.gnaf.param.AdressParam;
import software.perfekt.gnaf.service.FullAdressService;

/**
 * Created by Zloy on 03.04.2018.
 */
@RestController
@RequestMapping(value = "/address")
@RequiredArgsConstructor
public class ApiFullAdress {

    private final FullAdressService fullAdressService;

    @RequestMapping(value = "/", method = RequestMethod.POST, consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity fetchAdress(@RequestBody AdressParam param) {
        return new ResponseEntity<>(fullAdressService.fetchAdress(param), HttpStatus.OK);
    }
}
