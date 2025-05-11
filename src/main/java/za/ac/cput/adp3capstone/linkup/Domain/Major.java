package za.ac.cput.adp3capstone.linkup.Domain;

/* Major.java
Major enum
Author: Brezano Liebenberg (230463886)
Date:9 May 2025
*/

public enum Major {
    BA_IN_PSYCHOLOGY("BA in Psychology"),
    BA_IN_POLITICAL_SCIENCE("BA in Political Science"),
    BA_IN_SOCIOLOGY("BA in Sociology"),
    BA_IN_INTERNATIONAL_RELATIONS("BA in International Relations"),

    BCOM_IN_ACCOUNTING("BCom in Accounting"),
    BCOM_IN_ECONOMICS("BCom in Economics"),
    BCOM_IN_FINANCE("BCom in Finance"),
    BCOM_IN_MARKETING("BCom in Marketing"),

    BSC_IN_COMPUTER_SCIENCE("BSc in Computer Science"),
    BSC_IN_MATHEMATICS("BSc in Mathematics and Statistics"),
    BSC_IN_PHYSICS("BSc in Physics"),
    BSC_IN_CHEMISTRY("BSc in Chemistry"),

    BACHELOR_OF_ENGINEERING_IN_CIVIL_ENGINEERING("Bachelor of Engineering in Civil Engineering"),
    BACHELOR_OF_ENGINEERING_IN_MECHANICAL_ENGINEERING("Bachelor of Engineering in Mechanical Engineering"),
    BACHELOR_OF_ENGINEERING_IN_ELECTRICAL_AND_ELECTRONIC("Bachelor of Engineering in Electrical and Electronic"),
    BACHELOR_OF_ENGINEERING_IN_CHEMICAL_ENGINEERING("Bachelor of Engineering in Chemical Engineering"),

    MBChB("Bachelor of Medicine and Bachelor of Surgery"),
    BNurs("Bachelor of Nursing"),
    BPharm("Bachelor of Pharmacy"),
    BOccTher("Bachelor of Occupational Therapy"),

    BACHELOR_OF_EDUCATION_IN_FOUNDATION_PHASE("Foundation Phase"),
    BACHELOR_OF_EDUCATION_IN_INTERMEDIARY_PHASE("Intermediate Phase"),
    BACHELOR_OF_EDUCATION_IN_SENOIR_AND_FET_PHASE("Senior & FET Phase"),
    BACHELOR_OF_EDUCATION_IN_HONOURS_IN_EDUCATIONAL_PSYCHOLOGY("Honours in Educational Psychology"),

    LLB("Bachelor of Laws"),
    BA_IN_LAW("Bachelor of Arts with Law as a major"),
    BCom_IN_LAW("Bachelor of Commerce with Law as a major");

    private final String displayName;

    Major(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}