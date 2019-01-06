package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[]args) {

        Forum theForum = new Forum();
        theForum.getList().stream()
                .filter(s -> s.getUserSex()=='M')
                .filter(s -> Period.between(s.getUserDateOfBirth(), LocalDate.now()).getYears()>=20)
                .filter(s -> s.getPostCount()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser))
                .entrySet().stream()
                .map(s -> s.getKey() + ": " + s.getValue())
                .forEach(System.out::println);
    }
}
