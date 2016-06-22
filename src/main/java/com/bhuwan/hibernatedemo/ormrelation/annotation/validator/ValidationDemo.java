/**
 * 
 */
package com.bhuwan.hibernatedemo.ormrelation.annotation.validator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author bhuwan
 *
 */
public class ValidationDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        SessionFactory sf = configuration.configure("config/annotation.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Employee emp = new Employee();
        emp.setName("Bhuwan Gautam");
        emp.setSalary(BigDecimal.valueOf(50_000.00));
        emp.setCreatedDate(LocalDateTime.now());
        emp.setEmail("myemail@gmail.com");

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Employee>> errors = validator.validate(emp);
        if (errors.isEmpty()) {
            session.save(emp);
            transaction.commit();
        } else {
            for (ConstraintViolation<Employee> err : errors) {
                System.out.println(err.getPropertyPath() + " : " + err.getMessage());
            }
        }
        sf.close();
    }

}
