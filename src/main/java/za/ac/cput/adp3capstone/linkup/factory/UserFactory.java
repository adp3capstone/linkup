package za.ac.cput.adp3capstone.linkup.factory;

/**
 * UserFactory.java
 * Author: Hope Kgomokaboya(222152672)
 * Date: 17/05/2025
 */

import za.ac.cput.adp3capstone.linkup.Domain.Gender;
import za.ac.cput.adp3capstone.linkup.Domain.Preference;
import za.ac.cput.adp3capstone.linkup.Domain.User;

import java.util.List;

public class UserFactory {
    public static User createUser(int userId, String username, String password, String email,
                                  String firstName, String lastName, String age, Gender gender,
                                  String bio, List<String> university, List<String> course,
                                  String yearOfStudy, boolean isVerified, Preference preferences,
                                  List<String> likes, List<String> matches, List<String> images) {

        if (userId <= 0 || Helper.isNullOrEmpty(username) || Helper.isNullOrEmpty(password) ||
                Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(age) || gender == null) {
            return null;
        }

        if (!Helper.isValidEmail(email)) {
            return null;
        }

        try {
            int ageValue = Integer.parseInt(age);
            if (ageValue <= 16 || ageValue > 120) {  // Assuming reasonable age limits
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        return new User.Builder()
                .setUserId(userId)
                .setUsername(username)
                .setPassword(password)
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setGender(gender)
                .setBio(bio)
                .setUniversity(university)
                .setCourse(course)
                .setYearOfStudy(yearOfStudy)
                .setIsVerified(isVerified)
                .setPreferences(preferences)
                .setLikes(likes)
                .setMatches(matches)
                .setImages(images)
                .build();
    }

    public static User createBasicUser(int userId, String username, String password,
                                       String email, String firstName, String lastName,
                                       String age, Gender gender) {

        if (userId <= 0 || Helper.isNullOrEmpty(username) || Helper.isNullOrEmpty(password) ||
                Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName) || Helper.isNullOrEmpty(age) || gender == null) {
            return null;
        }

        if (!Helper.isValidEmail(email)) {
            return null;
        }

        try {
            int ageValue = Integer.parseInt(age);
            if (ageValue <= 16 || ageValue > 120) {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }

        return new User.Builder()
                .setUserId(userId)
                .setUsername(username)
                .setPassword(password)
                .setEmail(email)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setAge(age)
                .setGender(gender)
                .build();
    }
}