package io.jaziu.students.model;

import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private long phoneNo;

    @CreatedDate
    @Column(name = "created")
    private LocalDate created;

    @CreatedDate
    @Column(name = "active")
    private boolean active;

    public LocalDate getCreated() {
        return created;
    }

    public Student(@NotBlank(message = "Name is mandatory") String name, @NotBlank(message = "Email is mandatory") String email, long phoneNo, LocalDate created, boolean active) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.created = created;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public String getActive(){
        if(active){
            return "Aktywny";
        }else{
            return "Nieaktywny";
        }
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Student() {}

    public Student(@NotBlank(message = "Name is mandatory") String name, @NotBlank(message = "Email is mandatory") String email, long phoneNo, LocalDate created) {
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.created = created;
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}
