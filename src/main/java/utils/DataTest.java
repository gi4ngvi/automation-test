package utils;

import entity.Customer;

public class DataTest {

    public static Customer createRandomCustomer() {
        return new Customer.Builder()
                .name(StringUtils.getRandomCharacter(5))
                .gender("male")
                .dateOfBirth("01/01/1990")
                .address(StringUtils.getRandomCharacter(10))
                .city(StringUtils.getRandomCharacter(5))
                .state(StringUtils.getRandomCharacter(5))
                .pin(StringUtils.getRandomNumber(6))
                .mobile(StringUtils.getRandomNumber(10))
                .email("email" + StringUtils.getRandomCharacter(7) + "@yopmail.com")
                .password("password").build();
    }
}
