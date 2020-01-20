package pl.wylezek.creational.builder;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private Gender gender;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public static class Builder {
        private String name;
        private String lastName;
        private int age;
        private Gender gender;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {

            if(name == null || lastName.isEmpty()) {
                throw new IllegalStateException("Name cannot be empty");
            }

            Person person = new Person();
            person.name = this.name;
            person.lastName = this.lastName;
            person.age = this.age;
            person.gender = this.gender;
            return person;
        }
    }
}
