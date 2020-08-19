package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import entity.Customer;

public class DataTest {
    private static final String STORE_CUSTOMER_FILE_PATH = System.getProperty("user.dir") + "/src/test/resources/com/data/customer.json";
    private static FileUtils fileUtils;

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

    public static void storeCustomerInfo(Customer customer) {
        fileUtils = new FileUtils();
        String jsonCustomerInfo = "";
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode customerNode = mapper.createObjectNode();
        customerNode.put("id", customer.getId());
        customerNode.put("name", customer.getName());
        customerNode.put("email", customer.getEmail());
        try {
            jsonCustomerInfo = mapper.writeValueAsString(customerNode);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        fileUtils.writeFile(STORE_CUSTOMER_FILE_PATH, jsonCustomerInfo);
    }
}
