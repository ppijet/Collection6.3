package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1,"Kaczka",'M', LocalDate.of(1999,05,10),8));
        userList.add(new ForumUser(2,"Jarosław z Warszawy",'M',LocalDate.of(2000,01,18),0));
        userList.add(new ForumUser(3,"Suchar", 'M',LocalDate.of(1959,01,14),18));
        userList.add(new ForumUser(4,"Gagarin",'M',LocalDate.of(1967,03,14),58));
        userList.add(new ForumUser(5,"Matylda",'F',LocalDate.of(1997,12,02),57));
        userList.add(new ForumUser(6,"Karolcia",'F',LocalDate.of(1985,07,25),17));
        userList.add(new ForumUser(7,"Dracula",'M',LocalDate.of(1989,02,28),32));
    }


    public List<ForumUser> getList() {
        return new ArrayList<>(userList);
    }
}
