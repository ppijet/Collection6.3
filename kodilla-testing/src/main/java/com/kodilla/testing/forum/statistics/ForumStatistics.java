package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUsers;
    private double averageCommentsPerUsers;
    private double averageCommentsPerPost;


    public double getAveragePostsPerUsers() {
        return averagePostsPerUsers;
    }

    public double getAverageCommentsPerUsers() {
        return averageCommentsPerUsers;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers == 0) {
            System.out.println("If numberOfUsers is 0, no comments, no posts");
        } else {
            averagePostsPerUsers = (double) numberOfPosts / numberOfUsers;
            averageCommentsPerUsers = (double) numberOfComments / numberOfUsers;
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }


    public void showStatistics () {
            System.out.println("The last year our forum visited "+ numberOfUsers + "users, wrote "
                    + numberOfPosts +" messages and posted "+ numberOfComments+" comments");
            System.out.println("average number of posts per users: ");
            System.out.println("average number of comments per user: " + averageCommentsPerUsers);
            System.out.println("average number of comments per post: " + averageCommentsPerPost);
        }
    }

