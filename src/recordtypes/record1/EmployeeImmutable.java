package recordtypes.record1;

import java.util.Objects;

/*
Dataları transfer etmek için:DTO(Data Transefer Object) ve dataları
saklamak için basit ilkel classlar oluştururuz.
Bazı durumlarda thread güvenliği(thread-safe), cachede veri tutarlılığı,
test kolaylığı vb sebeplerle immutable(değiştirilemez) classlar tanımlamak isteyebiliriz.
 */
public class EmployeeImmutable {

    private final String firstname;
    private final String lastname;
    private final String email;

    //param const
    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter: read-only
    //setter: final olduğu için, değiştirilemesin diye setter metodlarını yazmıyoruz
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    //toString
    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;

        if (obj==null || this.getClass()!=obj.getClass()){
            return false;
        }

        EmployeeImmutable emp= (EmployeeImmutable) obj;

        return Objects.equals(this.firstname,emp.firstname) &&
                Objects.equals(this.lastname,emp.lastname) &&
                Objects.equals(this.email,emp.email);
    }

    //objeler için unique kodlar üretir
    @Override
    public int hashCode() {
        return Objects.hash(firstname,lastname,email);
    }

}
