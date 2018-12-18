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
        for(int n = 0; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(50, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0,forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerUsers());
    }

    @Test
    public void testThousandPosts(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 0; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(50, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(100, forumStatistics.getNumberOfComments());
        Assert.assertEquals(20, forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0.1,forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerUsers());
    }

    @Test
    public void testZeroComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 0; n <  50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(50, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(1000, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(20, forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerUsers());
    }

    @Test
    public void testMorePostThanComments(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 0; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(200);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(50, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(600, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(200, forumStatistics.getNumberOfComments());
        Assert.assertEquals(12,forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0.33, forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsPerUsers());
    }

    @Test
    public void testMoreCommentsThanPost(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 0; n < 50 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(600);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //
        Assert.assertEquals(50, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(200, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(600, forumStatistics.getNumberOfComments());
        Assert.assertEquals(4,forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(3, forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(12,forumStatistics.getAverageCommentsPerUsers());
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
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(0, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(0, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(0, forumStatistics.getNumberOfComments());
        Assert.assertEquals(0 ,forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(0,forumStatistics.getAverageCommentsPerUsers());
    }

    @Test
    public void testHundredUsers(){

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> forumUserList = new ArrayList<>();
        String user = "User no. ";
        for(int n = 0; n < 100 ; n++){
            user = user + n;
            forumUserList.add(user);
        }
        when(statisticsMock.userNames()).thenReturn(forumUserList);
        when(statisticsMock.postCount()).thenReturn(600);
        when(statisticsMock.commentsCount()).thenReturn(200);

        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();

        //Then
        Assert.assertEquals(100, forumStatistics.getNumberOfUsers());
        Assert.assertEquals(600, forumStatistics.getNumberOfPosts());
        Assert.assertEquals(200, forumStatistics.getNumberOfComments());
        Assert.assertEquals(6, forumStatistics.getAveragePostsPerUsers());
        Assert.assertEquals(0.3,forumStatistics.getAverageCommentsPerPost(),0.1);
        Assert.assertEquals(2, forumStatistics.getAverageCommentsPerUsers());
    }
}

