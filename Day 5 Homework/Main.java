package com.company.day5;

public class Main {

    public static void main(String[] args) {
		Person p1 = new Person("Artak", 24, "Bangladesh");
		Person p2 = new Person("David", 22, "New York");
		Person p3 = new Person();
		p1.personInfo();
		p2.personInfo();
		p3.personInfo();

		Employee em1 = new Employee("19011919", "Ani", "Healthcare", 35, 'F');
		Employee em2 = new Employee("18820909", "Gevorg", "Police", 31, 'M');
		Employee em3 = new Employee("19422401", "Ara", "Fire Department", 27, 'M');
		Employee em4 = new Employee("16752292", "Anna", "Police", 26, 'F');
		Employee em5 = new Employee("71276185", "Armen", "Police", 33, 'M');
		em1.employeeInfo();
		em2.employeeInfo();
		em3.employeeInfo();
		em4.employeeInfo();
		em5.employeeInfo();

		Author au1 = new Author("Hovhannes Tumanyan", "hovhannestumanyan@mail.ru", 'M');
		au1.authorInfo();

		Book b1 = new Book("Reee", "John Smith", 15.5);
		Book b2 = new Book("Raaa", "John Smith", 13.7);
		b1.bookPrice();
		b1.bookAuthor();
		b2.bookPrice();
		b2.bookAuthor();
    }
}
