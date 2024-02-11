package com.singu.keycloak.microservices.api.controllers.mongo;

import com.singu.keycloak.microservices.api.domains.requests.DomainRequest;
import com.singu.keycloak.microservices.api.domains.responses.DomainResponse;
import com.singu.keycloak.microservices.api.services.mongo.DomainService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Tag(name = "Domain MongoDB")
@RequestMapping("/api/v1/mongo/domains")
public class DomainController {

    private final DomainService service;

    @GetMapping("/{name}")
    public ResponseEntity<DomainResponse> getByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(service.getByName(name));
    }

    @GetMapping
    public ResponseEntity<List<DomainResponse>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<DomainResponse> create(@RequestBody DomainRequest request) {
        return ResponseEntity.ok(service.create(request));
    }

}
