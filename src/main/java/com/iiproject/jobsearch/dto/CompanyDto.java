package com.iiproject.jobsearch.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyDto {
    private int userId;

    private String companyName;

    @NotBlank(message = "Enter the email!!!")
    @Pattern(regexp = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$", message = "Email has to match with the format: abc@xyz.oiu!!!")
    private String companyEmail;

    private String companyAddress;

    private String companyPhoneNumber;

    private String companyDescription;
}
