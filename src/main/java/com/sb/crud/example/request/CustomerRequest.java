package com.sb.crud.example.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder(toBuilder = true)
public class CustomerRequest {
    private String customerName;
    private int customerAge;
    private String customerMobileNumber;
    private String customerEmailAddress;
    private String customerAddress;
}
