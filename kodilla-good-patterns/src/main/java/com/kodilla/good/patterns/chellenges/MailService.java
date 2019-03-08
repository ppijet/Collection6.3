package com.kodilla.good.patterns.chellenges;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Sending confirmation to " + user.getName() + " " + user.getSurname());
    }

}
