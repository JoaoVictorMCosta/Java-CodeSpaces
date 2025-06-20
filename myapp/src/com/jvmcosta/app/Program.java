package com.jvmcosta.app;

import java.util.Locale;
import java.util.Scanner;

import com.jvmcosta.entities.People;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String name;int age; double height;
        
        People[] people = new People[n];
        
        double sumHeight=0;
        double ageUnder16Years=0;
        
        for (int i = 0; i < people.length; i++) {
            System.out.printf("Dados da %da pessoa: %n",i+1);
            System.out.print("Nome: ");
            name=sc.nextLine();
            System.out.print("Idade: ");
            age = sc.nextInt();
            System.out.print("Altura: ");
            height=sc.nextDouble();
            sc.nextLine();
            people[i]=new People(name,age,height);
            sumHeight+=people[i].getHeight();

            if(age<16){
                ageUnder16Years+=1;
            }
        }

        
        System.out.printf("%nAVERAGE HEIGHT = %.2f%n",sumHeight/people.length);
        System.out.printf("PEOPLE WHO ARE UNDER 16 YEARS OLD = %d%%%n",((int)((ageUnder16Years/people.length)*100)));
        
        for (int i = 0; i < people.length; i++) {
            if(people[i].getAge()<16){
                System.out.println(people[i].getName());
            }
        }
        sc.close();
    }
}
