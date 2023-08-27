package com.hillel.multi.presentetion.controller;

import com.hillel.multi.persistent.MyTestObject;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@Validated
public class MyTestController {


    @PostMapping(value = "/create")
    public ResponseEntity<MyTestObject> create(@RequestBody MyTestObject object) {
        MyTestObject testObject = new MyTestObject();
        testObject.setName(object.getName());
        testObject.setLength(object.getLength());
        testObject.setWidth(object.getWidth());
        return ResponseEntity.ok()
                .body(testObject);
    }

    @GetMapping(value = "/read/{name}")
    public ResponseEntity<MyTestObject> read(@PathVariable String name,
                                             @RequestParam(value = "length") Integer length,
                                             @RequestParam(value = "width") Integer width) {
        MyTestObject testObject = new MyTestObject();
        testObject.setName(name);
        testObject.setLength(length);
        testObject.setWidth(width);
        return ResponseEntity.ok().body(testObject);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            value = "delete/{name}",
            produces = {"application/json"},
            consumes= {"application/json"}
    )
    public String delete(@PathVariable String name) {
        return String.format("Test object with name %s was deleted successfully", name);
    }

}
