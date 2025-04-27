package com.Umar.builder;

public class Client {
    public static void main(String[] args) {
        //Everything initializing in this is manually lot of hectic and not readable
       /* Your approach: Object exists in memory before validation
        Builder: No object created if validation fails*/
//        Student student = new Student("umar " ,  20 , "morning_Batch" , "jntu" , "103" , 50.0 , 2020);
//        System.out.println(student.name);
//        System.out.println(student.age);
//        System.out.println(student.batch);
//        System.out.println(student.age);
//        System.out.println(student.batch);

        //Builder Implementation
        //Builder builder = new Builder();
//        Builder builder = Student.getBuilder();
//        builder.setName("Umar Farooq");
//        builder.setAge(25);
//        builder.setGrad_year(2025);
//        builder.setUniversity_name("JNTU");
//        builder.setBatch("April 2025 ");
//         // Student st = new Student(builder);
//          Student student = builder.build();
//        System.out.println("Debug");
 //the only thing now we have done here is clean of code and we have set the method chaining

        Student student =  Student.getBuilder()
                .setName("Umar Farooq")
                 .setAge(26)
                 .setBatch("April 2025")
                 .setGrad_year(2026)
                 .setPhone_number("123456789")
                 .setUniversity_name("University")
                 .build();

    }
}
