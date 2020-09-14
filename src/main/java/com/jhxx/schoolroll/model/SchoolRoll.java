/*@Time : 2020/9/11 16:13
 *@Author : 韦佗
 *@File : model.java
 *@Software : IntelliJ IDEA
 */
package com.jhxx.schoolroll.model;
import java.util.Date;

public class SchoolRoll{
    private String idNumber;//身份证号
    private String schoolNumber;//学校标识码
    private String name;//学生姓名
    private Integer sex;//学生性别。1表示男，2表示女，0表示保密
    private Date birthDate;//出生日期
    private String  birthPlaceCode;//出生地行政区划代码
    private String  nativePlace;//籍贯
    private String nation;//民族
    private String nationality;//国籍
    private Integer idCardType;//身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private Boolean foreignOrTheMainland;//港澳台侨外
    private Integer health;//健康状况。1为良好，2为较差，3为残疾
    private Integer politics;//政治面貌。1为群众，2为党员
    private String category;//户口性质
    private String domicilePlace;//户口所在地行政区划
    private String classNumber;//班号
    private Date admissionDate;//入学年月
    private Integer theEntranceWay;//入学方式。1为本地户籍入学，2为借读入学，3为考试入学
    private Integer studyingWay;//就读方式。1为寄宿，2为走读
    private String presentAddress;//现住址
    private String mailingAddress;//通信地址
    private String familyAddress;//家庭住址
    private String  phoneNumber;//联系电话
    private String  postalCode;//邮政编码
    private Boolean onlyChild;//是否独生子女
    private Boolean preschoolEducation;//是否受过学前教育
    private Boolean leftoverChildren;//是否留守儿童
    private Boolean amountSought;//是否申请资助
    private Boolean publicSubsidies;//是否享受一补
    private Boolean orphan;//是否孤儿
    private Boolean martyr;//是否烈士或优抚子女
    private String distanceFromSchool;//上下学距离
    private String commuting;//上下学方式
    private Boolean needTakeTheSchoolBus;//是否需要乘坐校车
    private String formerName;//曾用名
    private Date idCardOverdueTime;//身份证有效期
    private Integer bloodType;//血型。1为a型，2为b型，3为o型，4为ab型，5为未知
    private String specialty;//特长
    private String studentStatusNumber;//学籍辅号
    private String classStudentId;//班内学号
    private String studentsSource;//学生来源
    private String email;//电子邮箱
    private String businessPage;//主页地址
    private Integer disabilityTypes;//残疾类型。1为无，2为听力残疾，3为肢体残疾，4为智力残疾，5为精神残疾
    private Boolean governmentBuyDegree;//是否为政府购买学位
    private Boolean learningInRegularClassroom;//随班就读
    private String nameOfFamilyMember1;//成员1姓名
    private Integer memberRelationship1;//成员1关系。1为父子，2为母子，3为姐妹，4为兄弟，5祖父，6祖母
    private String membershipStatement1;//成员1关系说明
    private String memberPresentAddress1;//成员1现住址
    private String memberDomicilePlace1;//成员1户口所在地行政区划
    private String memberNumberPhoneNumber1;//成员1联系电话
    private Boolean memberWhetherGuardian1;//成员1是否监护人;
    private Integer memberIdCardType1;//成员1身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private String MemberIdNumber1;//成员1身份证件号
    private String MemberNation1;//成员1民族
    private String MemberWorkUniT1;//成员1工作单位
    private String MemberPost1;//成员1职务
    private String nameOfFamilyMember2;//成员2姓名
    private Integer memberRelationship2;//成员2关系。1为父子，2为母子，3为姐妹，4为兄弟，5祖父，6祖母
    private String membershipStatement2;//成员2关系说明
    private String memberPresentAddress2;//成员2现住址
    private String memberDomicilePlace2;//成员2户口所在地行政区划
    private String memberNumberPhoneNumber2;//成员2联系电话
    private Boolean memberWhetherGuardian2;//成员2是否监护人;
    private Integer memberIdCardType2;//成员2身份证类型。1为中华人民共和国居民身份证，2为海外护照
    private String memberIdNumber2;//成员2身份证件号
    private String memberNation2;//成员2民族
    private String memberWorkUniT2;//成员2工作单位
    private String memberPost2;//成员2职务
    private Boolean trailingChildren;//是否进城务工子女

    public Boolean getTrailingChildren() {
        return trailingChildren;
    }

    public void setTrailingChildren(Boolean trailingChildren) {
        this.trailingChildren = trailingChildren;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(Integer idCardType) {
        this.idCardType = idCardType;
    }

    public Boolean getForeignOrTheMainland() {
        return foreignOrTheMainland;
    }

    public void setForeignOrTheMainland(Boolean foreignOrTheMainland) {
        this.foreignOrTheMainland = foreignOrTheMainland;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(String domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Integer getTheEntranceWay() {
        return theEntranceWay;
    }

    public void setTheEntranceWay(Integer theEntranceWay) {
        this.theEntranceWay = theEntranceWay;
    }

    public Integer getStudyingWay() {
        return studyingWay;
    }

    public void setStudyingWay(Integer studyingWay) {
        this.studyingWay = studyingWay;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getFamilyAddress() {
        return familyAddress;
    }

    public void setFamilyAddress(String familyAddress) {
        this.familyAddress = familyAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Boolean getOnlyChild() {
        return onlyChild;
    }

    public void setOnlyChild(Boolean onlyChild) {
        this.onlyChild = onlyChild;
    }

    public Boolean getPreschoolEducation() {
        return preschoolEducation;
    }

    public void setPreschoolEducation(Boolean preschoolEducation) {
        this.preschoolEducation = preschoolEducation;
    }

    public Boolean getLeftoverChildren() {
        return leftoverChildren;
    }

    public void setLeftoverChildren(Boolean leftoverChildren) {
        this.leftoverChildren = leftoverChildren;
    }

    public Boolean getAmountSought() {
        return amountSought;
    }

    public void setAmountSought(Boolean amountSought) {
        this.amountSought = amountSought;
    }

    public Boolean getPublicSubsidies() {
        return publicSubsidies;
    }

    public void setPublicSubsidies(Boolean publicSubsidies) {
        this.publicSubsidies = publicSubsidies;
    }

    public Boolean getOrphan() {
        return orphan;
    }

    public void setOrphan(Boolean orphan) {
        this.orphan = orphan;
    }

    public Boolean getMartyr() {
        return martyr;
    }

    public void setMartyr(Boolean martyr) {
        this.martyr = martyr;
    }

    public String getDistanceFromSchool() {
        return distanceFromSchool;
    }

    public void setDistanceFromSchool(String distanceFromSchool) {
        this.distanceFromSchool = distanceFromSchool;
    }

    public String getCommuting() {
        return commuting;
    }

    public void setCommuting(String commuting) {
        this.commuting = commuting;
    }

    public Boolean getNeedTakeTheSchoolBus() {
        return needTakeTheSchoolBus;
    }

    public void setNeedTakeTheSchoolBus(Boolean needTakeTheSchoolBus) {
        this.needTakeTheSchoolBus = needTakeTheSchoolBus;
    }

    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public Date getIdCardOverdueTime() {
        return idCardOverdueTime;
    }

    public void setIdCardOverdueTime(Date idCardOverdueTime) {
        this.idCardOverdueTime = idCardOverdueTime;
    }

    public Integer getBloodType() {
        return bloodType;
    }

    public void setBloodType(Integer bloodType) {
        this.bloodType = bloodType;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getStudentStatusNumber() {
        return studentStatusNumber;
    }

    public void setStudentStatusNumber(String studentStatusNumber) {
        this.studentStatusNumber = studentStatusNumber;
    }

    public String getClassStudentId() {
        return classStudentId;
    }

    public void setClassStudentId(String classStudentId) {
        this.classStudentId = classStudentId;
    }

    public String getStudentsSource() {
        return studentsSource;
    }

    public void setStudentsSource(String studentsSource) {
        this.studentsSource = studentsSource;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBusinessPage() {
        return businessPage;
    }

    public void setBusinessPage(String businessPage) {
        this.businessPage = businessPage;
    }

    public Integer getDisabilityTypes() {
        return disabilityTypes;
    }

    public void setDisabilityTypes(Integer disabilityTypes) {
        this.disabilityTypes = disabilityTypes;
    }

    public Boolean getGovernmentBuyDegree() {
        return governmentBuyDegree;
    }

    public void setGovernmentBuyDegree(Boolean governmentBuyDegree) {
        this.governmentBuyDegree = governmentBuyDegree;
    }

    public Boolean getLearningInRegularClassroom() {
        return learningInRegularClassroom;
    }

    public void setLearningInRegularClassroom(Boolean learningInRegularClassroom) {
        this.learningInRegularClassroom = learningInRegularClassroom;
    }

    public String getNameOfFamilyMember1() {
        return nameOfFamilyMember1;
    }

    public void setNameOfFamilyMember1(String nameOfFamilyMember1) {
        this.nameOfFamilyMember1 = nameOfFamilyMember1;
    }

    public Integer getMemberRelationship1() {
        return memberRelationship1;
    }

    public void setMemberRelationship1(Integer memberRelationship1) {
        this.memberRelationship1 = memberRelationship1;
    }

    public String getMembershipStatement1() {
        return membershipStatement1;
    }

    public void setMembershipStatement1(String membershipStatement1) {
        this.membershipStatement1 = membershipStatement1;
    }

    public String getMemberPresentAddress1() {
        return memberPresentAddress1;
    }

    public void setMemberPresentAddress1(String memberPresentAddress1) {
        this.memberPresentAddress1 = memberPresentAddress1;
    }

    public String getMemberDomicilePlace1() {
        return memberDomicilePlace1;
    }

    public void setMemberDomicilePlace1(String memberDomicilePlace1) {
        this.memberDomicilePlace1 = memberDomicilePlace1;
    }

    public String getMemberNumberPhoneNumber1() {
        return memberNumberPhoneNumber1;
    }

    public void setMemberNumberPhoneNumber1(String memberNumberPhoneNumber1) {
        this.memberNumberPhoneNumber1 = memberNumberPhoneNumber1;
    }

    public Boolean getMemberWhetherGuardian1() {
        return memberWhetherGuardian1;
    }

    public void setMemberWhetherGuardian1(Boolean memberWhetherGuardian1) {
        this.memberWhetherGuardian1 = memberWhetherGuardian1;
    }

    public Integer getMemberIdCardType1() {
        return memberIdCardType1;
    }

    public void setMemberIdCardType1(Integer memberIdCardType1) {
        this.memberIdCardType1 = memberIdCardType1;
    }

    public String getMemberIdNumber1() {
        return MemberIdNumber1;
    }

    public void setMemberIdNumber1(String memberIdNumber1) {
        MemberIdNumber1 = memberIdNumber1;
    }

    public String getMemberNation1() {
        return MemberNation1;
    }

    public void setMemberNation1(String memberNation1) {
        MemberNation1 = memberNation1;
    }

    public String getMemberWorkUniT1() {
        return MemberWorkUniT1;
    }

    public void setMemberWorkUniT1(String memberWorkUniT1) {
        MemberWorkUniT1 = memberWorkUniT1;
    }

    public String getMemberPost1() {
        return MemberPost1;
    }

    public void setMemberPost1(String memberPost1) {
        MemberPost1 = memberPost1;
    }

    public String getNameOfFamilyMember2() {
        return nameOfFamilyMember2;
    }

    public void setNameOfFamilyMember2(String nameOfFamilyMember2) {
        this.nameOfFamilyMember2 = nameOfFamilyMember2;
    }

    public Integer getMemberRelationship2() {
        return memberRelationship2;
    }

    public void setMemberRelationship2(Integer memberRelationship2) {
        this.memberRelationship2 = memberRelationship2;
    }

    public String getMembershipStatement2() {
        return membershipStatement2;
    }

    public void setMembershipStatement2(String membershipStatement2) {
        this.membershipStatement2 = membershipStatement2;
    }

    public String getMemberPresentAddress2() {
        return memberPresentAddress2;
    }

    public void setMemberPresentAddress2(String memberPresentAddress2) {
        this.memberPresentAddress2 = memberPresentAddress2;
    }

    public String getMemberDomicilePlace2() {
        return memberDomicilePlace2;
    }

    public void setMemberDomicilePlace2(String memberDomicilePlace2) {
        this.memberDomicilePlace2 = memberDomicilePlace2;
    }

    public String getMemberNumberPhoneNumber2() {
        return memberNumberPhoneNumber2;
    }

    public void setMemberNumberPhoneNumber2(String memberNumberPhoneNumber2) {
        this.memberNumberPhoneNumber2 = memberNumberPhoneNumber2;
    }

    public Boolean getMemberWhetherGuardian2() {
        return memberWhetherGuardian2;
    }

    public void setMemberWhetherGuardian2(Boolean memberWhetherGuardian2) {
        this.memberWhetherGuardian2 = memberWhetherGuardian2;
    }

    public Integer getMemberIdCardType2() {
        return memberIdCardType2;
    }

    public void setMemberIdCardType2(Integer memberIdCardType2) {
        this.memberIdCardType2 = memberIdCardType2;
    }

    public String getMemberIdNumber2() {
        return memberIdNumber2;
    }

    public void setMemberIdNumber2(String memberIdNumber2) {
        this.memberIdNumber2 = memberIdNumber2;
    }

    public String getMemberNation2() {
        return memberNation2;
    }

    public void setMemberNation2(String memberNation2) {
        this.memberNation2 = memberNation2;
    }

    public String getMemberWorkUniT2() {
        return memberWorkUniT2;
    }

    public void setMemberWorkUniT2(String memberWorkUniT2) {
        this.memberWorkUniT2 = memberWorkUniT2;
    }

    public String getMemberPost2() {
        return memberPost2;
    }

    public void setMemberPost2(String memberPost2) {
        this.memberPost2 = memberPost2;
    }
}
