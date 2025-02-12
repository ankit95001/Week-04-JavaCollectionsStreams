package com.example.day02collections.Voting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class VotingSystemTest {
    private VotingSystem votingSystem;

    @BeforeEach
    void setUp() {
        votingSystem = new VotingSystem();
    }

    @Test
    void testCastVote() {
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Anand");
        votingSystem.castVote("Ankit");

        assertEquals(2, votingSystem.voteCount.get("Ankit"));
        assertEquals(1, votingSystem.voteCount.get("Anand"));
    }

    @Test
    void testVoteOrderPreserved() {
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Anand");
        votingSystem.castVote("Avinash");

        List<String> expectedOrder = Arrays.asList("Ankit", "Anand", "Avinash");
        assertEquals(expectedOrder, new ArrayList<>(votingSystem.voteOrder.keySet()));
    }

    @Test
    void testSortedResults() {
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");

        TreeMap<String, Integer> sortedResults = new TreeMap<>(votingSystem.voteCount);
        List<String> sortedCandidates = new ArrayList<>(sortedResults.keySet());

        assertEquals(Arrays.asList("Alice", "Bob", "Charlie"), sortedCandidates);
    }

    @Test
    void testFinalResultsSorting() {
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Anand");
        votingSystem.castVote("Aakrati");
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Anand");

        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(votingSystem.voteCount.entrySet());
        resultList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        assertEquals("Ankit", resultList.get(0).getKey()); // Most votes
        assertEquals("Anand", resultList.get(1).getKey()); // Second most votes
    }
}
