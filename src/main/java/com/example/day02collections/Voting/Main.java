package com.example.day02collections.Voting;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        votingSystem.castVote("Ankit");
        votingSystem.castVote("Anand");
        votingSystem.castVote("Avinash");
        votingSystem.castVote("Ankit");
        votingSystem.castVote("Aakrati");
        votingSystem.castVote("Anand");

        // Display results
        votingSystem.displaySortedResults();
        System.out.println();
        votingSystem.displayVoteOrder();
        System.out.println();
        votingSystem.displayFinalResults();
    }
}
