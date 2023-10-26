package Lesson14.Task1Human;
//Завдання 1: Реалізуйте клас «Людина».
// Збережіть в полях класу: ПІБ, дату народження, контактний телефон,
// місто, країну, домашню адресу. Реалізуйте методи класу для введення даних, виведення даних.
// Реалізуйте доступ до окремих полів через методи класу.
public class Human {
    String PIB;
    String birthday;
    int number;
    String city;
    String country;
    String address;

    public void setPIB(String PIB) {
        this.PIB = PIB;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}