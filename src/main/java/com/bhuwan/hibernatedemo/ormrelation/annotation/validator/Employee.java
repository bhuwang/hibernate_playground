/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.annotation.validator;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author bhuwan
 *
 */
@Entity
@Table(name = "ann_employee_val")
public class Employee {

    @Id
    @GeneratedValue
    private int id;

    @NotEmpty
    private String name;

    @NotEmpty
    @Email(message = "Enter the valid email format")
    private String email;

    private LocalDateTime createdDate;

    @Min(value = 10_000, message = "Salary should be minimum of 10,000")
    @Max(value = 50_000, message = "Salary should not be above 50,000")
    private BigDecimal salary;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the createdDate
     */
    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdDate
     *            the createdDate to set
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * @return the salary
     */
    public BigDecimal getSalary() {
        return salary;
    }

    /**
     * @param salary
     *            the salary to set
     */
    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
