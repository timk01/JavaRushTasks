package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        //public static final int HUMAN_COUNT = 0;
        private int passportId;
        private char sex;
        private String credentials;
        private short age;
        private String job;
        private boolean isSingle;

        public Human() {
        }

        public Human(int passportId) {
            this.passportId = passportId;
        }

        public Human(int passportId, String credentials) {
            this.passportId = passportId;
            this.credentials = credentials;
        }

        public Human(int passportId, char sex) {
            this.passportId = passportId;
            this.sex = sex;
        }

        public Human(int passportId, char sex, String credentials, short age) {
            this.passportId = passportId;
            this.sex = sex;
            this.credentials = credentials;
            this.age = age;
        }

        public Human(int passportId, char sex, String credentials, short age, String job, boolean isSingle) {
            this.passportId = passportId;
            this.sex = sex;
            this.credentials = credentials;
            this.age = age;
            this.job = job;
            this.isSingle = isSingle;
        }

        public Human(String credentials, short age, String job, boolean isSingle, int passportId, char sex) {
            this.credentials = credentials;
            this.age = age;
            this.job = job;
            this.isSingle = isSingle;
            this.passportId = passportId;
            this.sex = sex;
        }

        public Human(char sex, short age, String job) {
            this.sex = sex;
            this.age = age;
            this.job = job;
        }

        public Human(char sex, boolean isSingle) {
            this.sex = sex;
            this.isSingle = isSingle;
        }

        public Human(String credentials) {
            this.credentials = credentials;
        }
    }
}

///Human mother, human father... etc
