package org.example.Record_Return_Type;

public record Employee(int id, String fistName, String lastName) {

    public String nameSignature() {
        return fistName+" hi "+lastName;
    }
}

