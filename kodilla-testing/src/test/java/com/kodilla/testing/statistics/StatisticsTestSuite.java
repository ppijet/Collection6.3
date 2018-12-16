package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testsCounter = 0;

    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("The tests are beggining");
    }

    @AfterClass
    public static void afterAllTests(){
        System.out.println("The tests have been completed");
    }

    @Before
    public void beforeTest(){
        testsCounter++;
        System.out.println("Test number: " + testsCounter);
    }

    @After
    public void afterTest(){
        System.out.println("End of the test number: " + testsCounter);
    }
    @Test
    public void testZeroPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUsers(),0);
    }

    @Test
    public void testThousandPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(20, forumStatistics.getAveragePostsPerUsers(),20);
    }

    @Test
    public void testZeroComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAverageCommentsPerPost(),0);
    }

    @Test
    public void testMorePostThanComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(200);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0.33, forumStatistics.getAverageCommentsPerPost(),0.33);
    }

    @Test
    public void testMoreCommentsThanPost(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(600);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(3, forumStatistics.getAverageCommentsPerPost(),3);
    }

    @Test
    public void testZeroUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();

        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumStatistics.getAveragePostsPerUsers(),0);
    }

    @Test
    public void testHundredUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 1; n < 100 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(200);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(6, forumStatistics.getAveragePostsPerUsers(),6);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerUsers(),2);
    }
}

