package did_career_certification.issuer.dto;

import did_career_certification.issuer.enums.AcademicStatus;
import did_career_certification.issuer.enums.College;
import did_career_certification.issuer.enums.Degree;
import did_career_certification.issuer.enums.Major;

public record CredentialSubject (String name, College college, Major major, Degree degree, AcademicStatus academicStatus) {

}