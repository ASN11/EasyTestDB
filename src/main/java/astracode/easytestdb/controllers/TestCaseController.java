package astracode.easytestdb.controllers;

import astracode.easytestdb.model.TestCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestCaseController {

    @PostMapping
    public ResponseEntity<HttpStatus> addTestCase(@RequestBody TestCase testCase) {
        System.out.println("Пришел запрос");
        System.out.println(testCase);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
