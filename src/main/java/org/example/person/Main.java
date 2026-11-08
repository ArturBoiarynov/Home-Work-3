package org.example.person;


public class Main {
       public static void main(String[] args) {
              Person person1 = new Person("Владислав", 28, "Ветеринар");
              Person person2 = new Person("Анастасія", 31, "Дизайнер");
              Person person3 = new Person("Станислав", 45, "Хірург");

        System.out.println("Інформація про осіб: ");
           person1.printInfo();
           person2.printInfo();
           person3.printInfo();

           System.out.println();

           Person Борис = new Person("Борис", 45 , "Водій далекобійник");
           System.out.println("До оновлення професії :");
           Борис.printInfo();

           Борис.setProfession("Будівельник");
           System.out.println("Після оновлення професії: ");
           Борис.printInfo();




          }
       }