package com.basaki.udon.service.controller;

import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code UdonController} for anonymizing and deanonymizing data.
 * <p/>
 *
 * @author Indra Basak
 * @since 08/25/20
 */
@RestController
@Slf4j
public class UdonController {

    @GetMapping(value = "/udon/anonymize/**",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String anonymize(HttpServletRequest request) {
        return "hello";
    }

    @GetMapping(value = "/udon/deanonymize/**",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public String deanonymize(HttpServletRequest request) {
        return "hello";
    }
}
