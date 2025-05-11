package za.ac.cput.domain;

/*User.java
Author: SH Kgomokaboya(222152672)
Date : 11May 2025
 */
public class User {
    private String userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String age;
    private Gender gender;
    private String bio;
    private String profilePicture;
    private String university;
    private String course;
    private String yearOfStudy;
    private boolean isVerified;
    private Preference preferences;

    public User() {}

    private User(Builder builder) {
        this.userId = builder.userId;
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.gender = builder.gender;
        this.bio = builder.bio;
        this.profilePicture = builder.profilePicture;
        this.university = builder.university;
        this.course = builder.course;
        this.yearOfStudy = builder.yearOfStudy;
        this.isVerified = builder.isVerified;
        this.preferences = builder.preferences;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getBio() {
        return bio;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getUniversity() {
        return university;
    }

    public String getCourse() {
        return course;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public Preference getPreferences() {
        return preferences;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", bio='" + bio + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", university='" + university + '\'' +
                ", course='" + course + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", isVerified=" + isVerified +
                ", preferences=" + preferences +
                '}';
    }

    public static class Builder {
        private String userId;
        private String username;
        private String password;
        private String email;
        private String firstName;
        private String lastName;
        private String age;
        private Gender gender;
        private String bio;
        private String profilePicture;
        private String university;
        private String course;
        private String yearOfStudy;
        private boolean isVerified;
        private Preference preferences;

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder setBio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Builder setYearOfStudy(String yearOfStudy) {
            this.yearOfStudy = yearOfStudy;
            return this;
        }

        public Builder setIsVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public Builder setPreferences(Preference preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder copy(User user) {
            this.userId = user.userId;
            this.username = user.username;
            this.password = user.password;
            this.email = user.email;
            this.firstName = user.firstName;
            this.lastName = user.lastName;
            this.age = user.age;
            this.gender = user.gender;
            this.bio = user.bio;
            this.profilePicture = user.profilePicture;
            this.university = user.university;
            this.course = user.course;
            this.yearOfStudy = user.yearOfStudy;
            this.isVerified = user.isVerified;
            this.preferences = user.preferences;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
