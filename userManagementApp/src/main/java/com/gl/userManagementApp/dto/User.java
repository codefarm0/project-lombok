package com.gl.userManagementApp.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Min(1000)
    @Max(1000000)
    private int id;

    @Length(min = 4, max = 20, message = "name length should be between 4 and 10")
    private String name;

    @NotNull
    @AddressValidation
    private String address;

    @Email
    private String email;

    /**
     * Password must be between 4 and 8 digits long and include at least one numeric digit.
     */
    @Pattern(regexp = "^(?=.*\\d).{4,8}$")
    private String password;

}
