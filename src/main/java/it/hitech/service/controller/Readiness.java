package it.hitech.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping( value = "/")
@RestController
public class Readiness {

    private static final Logger log = LoggerFactory.getLogger(Readiness.class);

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getReadiness() {
        try {
            log.debug("START - Readiness");
            log.debug("END - Readiness");
            return new ResponseEntity<>("Hello world!", HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error recupero pro");
            return new ResponseEntity<>("test errore", HttpStatus.BAD_REQUEST);
        }
    }

}