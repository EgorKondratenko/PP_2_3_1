package web.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

//    @Column(name = "email")
//    private String email;
//    @Column(name = "car")
//    private String car;


    public User() {}

    public User(String firstName, String lastName,Integer age, String email, String car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
//        this.email = email;
//        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) { this.age = age; }

    public Integer getAge() { return age; }
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setCar(String car) { this.car = car; }
//
//    public String getCar() { return car; }

//    @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", firstName='" + firstName + '\''
//                + ", lastName='" + lastName + '\''
//                + ", age='" + age + '\''
//                + ", email='" + email + '\''
//                + ", car=" + car + '}';
//    }
}
