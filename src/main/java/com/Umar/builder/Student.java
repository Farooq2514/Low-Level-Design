package com.Umar.builder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String University_name;
    private double psp;
    private int grad_year;
    private String phone_number;


    private Student(Builder builder) {

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.University_name = builder.getUniversity_name();
        this.psp = builder.getPsp();
        this.grad_year = builder.getGrad_year();
        this.phone_number = builder.getPhone_number();
    }
    public static Builder getBuilder(){
        return new Builder();
    }


   /* public Student(String name, int age, String batch, String University_name, String phone_number ,  double psp, int grad_year) {
       //when i try to write this condition it is not going to make satisfy for this
        //but when i try this it validating after the object creation it means that even it is not valid there is still object present
        //which is not quite good if there is a failed of validation then the object should not created.
        if(grad_year < 2021){
            throw new IllegalArgumentException("grad_year must be greater than 2021");
        }
        this.name = name;
        this.age = age;
        this.batch = batch;
        this.University_name = University_name;
        this.phone_number = phone_number;
        this.psp = psp;
        this.grad_year = grad_year;

    }
    */
    public static class Builder {

        private String name;
        private int age;
        private String batch;
        private String University_name;
        private double psp;
        private int grad_year;
        private String phone_number;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getUniversity_name() {
            return University_name;
        }

        public Builder setUniversity_name(String university_name) {
            University_name = university_name;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getGrad_year() {
            return grad_year;
        }

        public Builder setGrad_year(int grad_year) {
            this.grad_year = grad_year;
            return this;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public Builder setPhone_number(String phone_number) {
            this.phone_number = phone_number;
            return this;
        }
        public  Student build() {
            if(this.getGrad_year() < 2022){
                throw new IllegalArgumentException("you are not eligible");
            }
            if(this.getAge() < 21){
                throw new IllegalArgumentException("you should not more than 30");
            }
            return new Student(this);
        }
    }

}
