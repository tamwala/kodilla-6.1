package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User anna = new YGeneration("Anna Kowalska");
        User jan = new ZGeneration("Jan Nowak");
        User marta = new Millenials("Marta Kowal");

        //When
        String annaSharedPost = anna.sharePost();
        System.out.println("Anna shared post on " + annaSharedPost);

        String janSharedPost = jan.sharePost();
        System.out.println("Jan shared post on " + janSharedPost);

        String martaSharedPost = marta.sharePost();
        System.out.println("Marta shared post on " + martaSharedPost);

        //Then
        assertEquals("Shared on Facebook", annaSharedPost);
        assertEquals("Shared on Snapchat", janSharedPost);
        assertEquals("Shared on Twitter", martaSharedPost);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User anna = new YGeneration("Anna Kowalska");

        //When
        String annaSharedPost = anna.sharePost();
        System.out.println("Anna shared post on " + annaSharedPost);
        anna.setSocialPublisher(new SnapchatPublisher());
        annaSharedPost = anna.sharePost();
        System.out.println("Anna now shared post on " + annaSharedPost);

        //Then
        assertEquals("Shared on Snapchat", annaSharedPost);
    }
}
