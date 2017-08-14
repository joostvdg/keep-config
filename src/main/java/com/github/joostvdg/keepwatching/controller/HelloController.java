package com.github.joostvdg.keepwatching.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {


    private static class Dummy {
        private final String name;
        private final boolean dummy;

        public Dummy() {
            this.name = "";
            this.dummy = true;
        }

        private Dummy(String name, boolean dummy){
            this.name = name;
            this.dummy = dummy;
        }

        public String getName() {
            return name;
        }

        public boolean isDummy() {
            return dummy;
        }
    }


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Collection<Dummy>> getTools(){
        Dummy dummy = new Dummy("Dummy", true);
        List<Dummy> dummies = new ArrayList<>();
        dummies.add(dummy);
        return ResponseEntity.ok().body(dummies);
    }
}
