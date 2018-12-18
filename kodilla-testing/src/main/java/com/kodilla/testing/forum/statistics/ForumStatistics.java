package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private int averagePostsPerUsers;
    private int averageCommentsPerUsers;
    private double averageCommentsPerPost;

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return  numberOfPosts;
    }

    public int getNumberOfComments(){
        return numberOfComments;
    }

    public int getAveragePostsPerUsers() {
        return averagePostsPerUsers;
    }

    public int getAverageCommentsPerUsers() {
        return averageCommentsPerUsers;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers > 0 && numberOfPosts > 0) {
            averagePostsPerUsers =  numberOfPosts / numberOfUsers;
            averageCommentsPerUsers =  numberOfComments / numberOfUsers;
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }


    public void showStatistics () {
            System.out.println("The last year our forum visited "+ numberOfUsers + " users, whose wrote "
                    + numberOfPosts +" messages and posted "+ numberOfComments+" comments.");
            System.out.println("average number of posts per users: " + averagePostsPerUsers);
            System.out.println("average number of comments per user: " + averageCommentsPerUsers);
            System.out.println("average number of comments per post: " + averageCommentsPerPost);
        }
    }

