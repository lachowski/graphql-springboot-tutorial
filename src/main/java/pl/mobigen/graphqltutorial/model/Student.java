package pl.mobigen.graphqltutorial.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private String name;
    private Integer age;
    private String phone;
    private Address address;
}
