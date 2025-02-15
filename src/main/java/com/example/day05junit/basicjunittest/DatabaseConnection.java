package com.example.day05junit.basicjunittest;

public class DatabaseConnection {
    private boolean isConnected;

    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    public boolean isConnected() {
        return isConnected;
    }

    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        System.out.println("Is connected? " + db.isConnected());
        db.disconnect();
        System.out.println("Is connected? " + db.isConnected());
    }
}

