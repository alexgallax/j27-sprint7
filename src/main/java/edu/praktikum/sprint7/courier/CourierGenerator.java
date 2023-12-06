package edu.praktikum.sprint7.courier;

import edu.praktikum.sprint7.models.Courier;

import static edu.praktikum.sprint7.utils.Utils.randomString;

public class CourierGenerator {

    public static Courier randomCourier() {
        return new Courier()
                .withLogin(randomString(8))
                .withPassword(randomString(16))
                .withFirstName(randomString(10));
    }
}
