package com.endgame.capturadelinea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/capturadelinea")
public class CapturaDeLineaController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value="crear",method = RequestMethod.POST)
    public String crear(@RequestParam(name="rfc",required=true) String rfc) {
        logger.info("Inicia la generación de la linea de captura");

        return "12345678901234567890 " + rfc;
    }

}
