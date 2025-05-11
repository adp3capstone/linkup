package za.ac.cput.adp3capstone.linkup.domain;
/* Institution.java
Institution enum
Author: Ethan Le Roux (222622172)
Date:7 May 2025
*/
public enum Institution {
    UNIVERSITY_OF_CAPE_TOWN("University of Cape Town"),
    UNIVERSITY_OF_THE_WITWATERSRAND("University of the Witwatersrand"),
    UNIVERSITY_OF_JOHANNESBURG("University of Johannesburg"),
    UNIVERSITY_OF_PRETORIA("University of Pretoria"),
    UNIVERSITY_OF_KWAZULU_NATAL("University of KwaZulu-Natal"),
    STELLENBOSCH_UNIVERSITY("Stellenbosch University"),
    RHODES_UNIVERSITY("Rhodes University"),
    NORTH_WEST_UNIVERSITY("North-West University"),
    UNIVERSITY_OF_SOUTH_AFRICA("University of South Africa"),
    UNIVERSITY_OF_THE_WESTERN_CAPE("University of the Western Cape"),
    NELSON_MANDELA_UNIVERSITY("Nelson Mandela University"),
    UNIVERSITY_OF_LIMPOPO("University of Limpopo"),
    UNIVERSITY_OF_FORT_HARE("University of Fort Hare"),
    UNIVERSITY_OF_THE_FREE_STATE("University of the Free State"),
    MANGOSUTHU_UNIVERSITY_OF_TECHNOLOGY("Mangosuthu University of Technology"),

    CAPE_PENINSULA_UNIVERSITY_OF_TECHNOLOGY("Cape Peninsula University of Technology"),
    DURBAN_UNIVERSITY_OF_TECHNOLOGY("Durban University of Technology"),
    TSHWANE_UNIVERSITY_OF_TECHNOLOGY("Tshwane University of Technology"),
    VAAL_UNIVERSITY_OF_TECHNOLOGY("Vaal University of Technology"),

    FALSE_BAY_TVET_COLLEGE("False Bay TVET College"),
    NORTHLINK_COLLEGE("Northlink College"),
    COLLEGE_OF_CAPE_TOWN("College of Cape Town"),
    BOLAND_COLLEGE("Boland College"),
    WEST_COAST_COLLEGE("West Coast College"),
    ELANGENI_TVET_COLLEGE("Elangeni TVET College"),
    MAJUBA_TVET_COLLEGE("Majuba TVET College"),
    KING_HINTSA_TVET_COLLEGE("King Hintsa TVET College"),
    BUFFALO_CITY_TVET_COLLEGE("Buffalo City TVET College"),
    CENTRAL_JOHANNESBURG_TVET_COLLEGE("Central Johannesburg TVET College"),
    EKURHULENI_EAST_TVET_COLLEGE("Ekurhuleni East TVET College"),
    SOUTH_WEST_GAUTENG_TVET_COLLEGE("South West Gauteng TVET College"),
    LETABA_TVET_COLLEGE("Letaba TVET College"),
    MOPANI_SOUTH_EAST_TVET_COLLEGE("Mopani South East TVET College"),
    WATERBERG_TVET_COLLEGE("Waterberg TVET College"),

    STADIO_HIGHER_EDUCATION("STADIO Higher Education"),
    MILPARK_EDUCATION("Milpark Education"),
    VEGA_SCHOOL("Vega School"),
    REGENT_BUSINESS_SCHOOL("Regent Business School"),
    BOSTON_CITY_CAMPUS("Boston City Campus"),
    DAMELIN_COLLEGE("Damelin College"),
    CTI_EDUCATION_GROUP("CTI Education Group"),
    EDUCOR("Educor"),
    AAA_SCHOOL_OF_ADVERTISING("AAA School of Advertising"),
    AFDA("AFDA – The School for the Creative Economy"),
    INTERNATIONAL_HOTEL_SCHOOL("International Hotel School"),
    IIE_MSA("IIE MSA (formerly Monash South Africa)"),
    VARSITY_COLLEGE("Varsity College"),
    RICHFIELD_GRADUATE_INSTITUTE("Richfield Graduate Institute"),
    IMM_GRADUATE_SCHOOL("IMM Graduate School"),
    SAHETI_HIGHER_EDUCATION("SAHETI School (Higher Education)"),
    LIMPOPO_ACADEMY_OF_AGRICULTURAL_ARTS("Limpopo Academy of Agricultural Arts");

    private final String displayName;

    Institution(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
