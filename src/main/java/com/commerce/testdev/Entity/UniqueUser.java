package com.commerce.testdev.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class UniqueUser {
    String name;
    String email;
}
