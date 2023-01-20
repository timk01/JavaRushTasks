package com.javarush.task.pro.task09.task0912;

/* 
Проверка URL-адреса
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com",
                "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        if (url.startsWith("https:")) {
            return "https";
        } else {
            return url.startsWith("http:") ? "http" : "неизвестный";
        }
    }

    public static String checkDomain(String url) {
        String[] splittedUrl = url.split("\\.");
        switch (splittedUrl[splittedUrl.length - 1]) {
            case "com" -> {
                return "com";
            }
            case "net" -> {
                return "net";
            }
            case "org" -> {
                return "org";
            }
            case "ru" -> {
                return "ru";
            }
            default -> {
                return "неизвестный";
            }
        }
    }
}

/*
if (url.endsWith("com")) {
            return "com";
        } else if (url.endsWith("net")) {
            return "net";
        } else if (url.endsWith("org")) {
            return "org";
        } else if (url.endsWith("ru")) {
            return "ru";
        } else {
            return "неизвестный";
        }
 */
