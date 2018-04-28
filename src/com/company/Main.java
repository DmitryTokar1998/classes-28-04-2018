package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++)
        {
            students[i] = Student.create();
            //System.out.println(students[i]);
        }
        System.out.println("Select action:");
        System.out.println("1-Output list of students");
        System.out.println("2-Output list of students,sorted by name");
        System.out.println("3-Output list of students,sorted by age");
        System.out.println("4-Search 1 student");
        System.out.println("5-Search students");
        System.out.println("0-Exit of program");
        int action=in.nextInt();
        switch(action)
        {
            case 1:
            {
                System.out.println();
                System.out.println("List of Students");
                System.out.println("-----------------------");
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(students[i]);
                }
                break;
            }
            case 2:
            {
                System.out.println();
                System.out.println("Sorted students by name");
                System.out.println("-----------------------");
                for (int i = 0; i < 10; i++)
                {
                    bubbleSortName(students);
                }
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(students[i]);
                }
                break;
            }
            case 3:
            {
                System.out.println();
                System.out.println("Sorted students by age");
                System.out.println("-----------------------");
                for (int i = 0; i < 10; i++)
                {
                    bubbleSortAge(students);
                }
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(students[i]);
                }
                break;
            }
            case 4:
            {
                System.out.println();
                System.out.println("List of students");
                System.out.println("-----------------------");
                System.out.println();
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(students[i]);
                }
                System.out.print("Input key of search:");
                String strn="";
                strn=in.next();
                Student foundStudent = SearchOneStudent(students,strn);
                System.out.println(foundStudent);
                break;
            }
            case 5:
            {
                System.out.println();
                System.out.println("List of students");
                System.out.println("-----------------------");
                System.out.println();
                for (int i = 0; i < 10; i++)
                {
                    System.out.println(students[i]);
                }
                System.out.print("Input key of search:");
                String str="";
                str=in.next();
                Student[] students1 = SearchStudents(students, str);
                for(int i=0;i<students1.length;i++)
                {
                    System.out.println(students1[i]);
                }

                break;
            }
            case 0:
                break;
            default:
                System.out.println("Error,invalid value!");
        }


       /* for (int i = 0; i < 10; i++)
        {
            System.out.println(students[i]);
        }

        for (int i = 0; i < 10; i++)
        {
            bubbleSortAge(students);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(students[i]);
        }*/
    }
    public static void bubbleSortName (Student[]arr)
    {
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                Student left=arr[j];
                Student right=arr[j+1];
                int al=left.name.compareTo(right.name);
                //int ar=right.name.compareTo(left.name);
                if (al > 0)           //(al > ar)
                {
                    Student tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static void bubbleSortAge (Student[]arr)
    {
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                Student al=arr[j];
                Student ar=arr[j+1];
                if (al.age > ar.age)
                {
                    Student tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    public static Student[] SearchStudents(Student[]arr,String key)
    {
        Student[] result=new Student[arr.length];
        int cn=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].name.contains(key))
            {
                result[i] = arr[i];
                cn++;
            }

        }
        return result;
    }
    public static Student SearchOneStudent(Student[]arr,String key)
    {
        Student result=null;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].name.contains(key))
            {
                result = arr[i];
                break;
            }

        }
        return result;
    }

}