package za.ac.cput.adp3capstone.linkup.Domain;

import za.ac.cput.adp3capstone.linkup.domain.Gender;

import java.util.List;

/**
 * User.java
 * Author: Hope Kgomokaboya(222152672)
 * Date: 17/05/2025.
 */
public class User {

    /* -------------------- Instance fields -------------------- */
    private int userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String age;
    private Gender gender;
    private String bio;
    private List<String> university;
    private List<String> course;
    private String yearOfStudy;
    private boolean isVerified;
    private Preference preferences;
    private List<String> likes;
    private List<String> matches;
    private List<String> images;

    /* -------------------- Constructors -------------------- */
    private User() { /* for JPA / serialization */ }

    private User(Builder builder) {
        this.userId      = builder.userId;
        this.username    = builder.username;
        this.password    = builder.password;
        this.email       = builder.email;
        this.firstName   = builder.firstName;
        this.lastName    = builder.lastName;
        this.age         = builder.age;
        this.gender      = builder.gender;
        this.bio         = builder.bio;
        this.university  = builder.university;
        this.course      = builder.course;
        this.yearOfStudy = builder.yearOfStudy;
        this.isVerified  = builder.isVerified;
        this.preferences = builder.preferences;
        this.likes       = builder.likes;
        this.matches     = builder.matches;
        this.images      = builder.images;
    }

    /* -------------------- Getters -------------------- */
    public int getUserId()               { return userId; }
    public String getUsername()          { return username; }
    public String getPassword()          { return password; }
    public String getEmail()             { return email; }
    public String getFirstName()         { return firstName; }
    public String getLastName()          { return lastName; }
    public String getAge()               { return age; }
    public Gender getGender()            { return gender; }
    public String getBio()               { return bio; }
    public List<String> getUniversity()  { return university; }
    public List<String> getCourse()      { return course; }
    public String getYearOfStudy()       { return yearOfStudy; }
    public boolean isVerified()          { return isVerified; }
    public Preference getPreferences()   { return preferences; }
    public List<String> getLikes()       { return likes; }
    public List<String> getMatches()     { return matches; }
    public List<String> getImages()      { return images; }

    /* -------------------- toString -------------------- */
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", bio='" + bio + '\'' +
                ", university=" + university +
                ", course=" + course +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", isVerified=" + isVerified +
                ", preferences=" + preferences +
                ", likes=" + likes +
                ", matches=" + matches +
                ", images=" + images +
                '}';
    }

    /* =========================================================
       =====================   BUILDER   =======================
       ========================================================= */
    public static class Builder {
        private int userId;
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String age;
        private Gender gender;
        private String bio;
        private List<String> university;
        private List<String> course;
        private String yearOfStudy;
        private boolean isVerified;
        private Preference preferences;
        private List<String> likes;
        private List<String> matches;
        private List<String> images;

        /* ---- Setter‑style methods ---- */
        public Builder setUserId(int userId)                   { this.userId = userId; return this; }
        public Builder setUsername(String username)            { this.username = username; return this; }
        public Builder setPassword(String password)            { this.password = password; return this; }
        public Builder setEmail(String email)                  { this.email = email; return this; }
        public Builder setFirstName(String firstName)          { this.firstName = firstName; return this; }
        public Builder setLastName(String lastName)            { this.lastName = lastName; return this; }
        public Builder setAge(String age)                      { this.age = age; return this; }
        public Builder setGender(Gender gender)                { this.gender = gender; return this; }
        public Builder setBio(String bio)                      { this.bio = bio; return this; }
        public Builder setUniversity(List<String> university)  { this.university = university; return this; }
        public Builder setCourse(List<String> course)          { this.course = course; return this; }
        public Builder setYearOfStudy(String yearOfStudy)      { this.yearOfStudy = yearOfStudy; return this; }
        public Builder setVerified(boolean verified)           { this.isVerified = verified; return this; }
        public Builder setPreferences(Preference preferences)  { this.preferences = preferences; return this; }
        public Builder setLikes(List<String> likes)            { this.likes = likes; return this; }
        public Builder setMatches(List<String> matches)        { this.matches = matches; return this; }
        public Builder setImages(List<String> images)          { this.images = images; return this; }

        /**
         * Copy all fields from an existing {@code User} into this builder.
         */
        public Builder copy(User user) {
            this.userId      = user.userId;
            this.username    = user.username;
            this.password    = user.password;
            this.email       = user.email;
            this.firstName   = user.firstName;
            this.lastName    = user.lastName;
            this.age         = user.age;
            this.gender      = user.gender;
            this.bio         = user.bio;
            this.university  = user.university;
            this.course      = user.course;
            this.yearOfStudy = user.yearOfStudy;
            this.isVerified  = user.isVerified;
            this.preferences = user.preferences;
            this.likes       = user.likes;
            this.matches     = user.matches;
            this.images      = user.images;
            return this;
        }

        public static Builder builder() {
            return new Builder();
        }


        public User build() {
            return new User(this);
        }
    }
}
