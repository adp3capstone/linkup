package za.ac.cput.adp3capstone.linkup.domain;

public class EmergencyContact {
    private long contactId;
    private User user;
    private String name;
    private String phoneNumber;
    private String email; // Optional

    public EmergencyContact() {}

    private EmergencyContact(Builder builder) {
        this.contactId = builder.contactId;
        this.user = builder.user;
        this.name = builder.name;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
    }

    public long getContactId() {
        return contactId;
    }

    public User getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public static class Builder {
        private long contactId;
        private User user;
        private String name;
        private String phoneNumber;
        private String email;

        public Builder setContactId(long contactId) {
            this.contactId = contactId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(EmergencyContact contact) {
            this.contactId = contact.contactId;
            this.user = contact.user;
            this.name = contact.name;
            this.phoneNumber = contact.phoneNumber;
            this.email = contact.email;
            return this;
        }

        public EmergencyContact build() {
            return new EmergencyContact(this);
        }
    }
}
