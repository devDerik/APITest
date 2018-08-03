package com.sandbox.heroku.test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author dfischer on 2018-08-01.
 */
@RestController
public class TestController {

  @RequestMapping(value = "/test")
  public ResponseEntity setDiagnostics(HttpServletRequest httpRequest) {
    return new ResponseEntity("test OK", HttpStatus.OK);
  }
}
