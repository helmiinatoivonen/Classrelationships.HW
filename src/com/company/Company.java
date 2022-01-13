package com.company;

public class Company
{
    static class Project
    {

        public Project (int identifier, String project)
        {
            this.identifier = identifier;
            this.project = project;
        }

        public String toString ()
        {
            return identifier + " has project: " + project;
        }


        int identifier;
        String project;
    }

    static class Task
    {
        public Task(String name1, String Workers)
        {
            this.name1 = name1;
            this.Workers = Workers;
        }

        public String toString () { return name1 + " is being worked on by: " + Workers; }

        String name1;
        String Workers;
    }

    static class Worker
    {

        public Worker (String name2, boolean employee)
        {

            this.name2 = name2;
            this.employee = employee;
        }

        public String toString () { return "name of worker: " + name2 + ", are they an employee? " + employee; }

        String name2;
        boolean employee;

    }
}
