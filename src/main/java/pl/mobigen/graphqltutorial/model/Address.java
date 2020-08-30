package pl.mobigen.graphqltutorial.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String street;
    private String city;
    private Integer zipCode;
}
