package com.singu.keycloak.microservices.api.domains.mongo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "domains")
public class Domain {

    @Id
    private String id;

    private String name;

}
