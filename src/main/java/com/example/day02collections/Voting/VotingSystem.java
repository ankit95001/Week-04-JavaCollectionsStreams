package com.example.day02collections.Voting;

import java.util.*;

class VotingSystem {
    Map<String, Integer> voteCount;
    LinkedHashMap<String, Integer> voteOrder;

    public VotingSystem() {
        voteCount = new HashMap<>();
        voteOrder = new LinkedHashMap<>();
    }


    public void castVote(String candidate) {
        voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteCount.get(candidate));
    }


    public void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteCount);
        System.out.println("Election Results (Sorted by Candidate Name):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }


    public void displayVoteOrder() {
        System.out.println("Votes in Order of Reception:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }


    public void displayFinalResults() {
        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(voteCount.entrySet());
        resultList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort by votes descending

        System.out.println("Final Results (Sorted by Votes):");
        for (Map.Entry<String, Integer> entry : resultList) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " votes");
        }
    }
}
