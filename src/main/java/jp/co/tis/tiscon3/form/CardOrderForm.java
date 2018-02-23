package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="必須項目ですので、ご入力またはご選択ください。")
    @Size(max = 60,message="文字数がオーバーしています。60文字以内で入力してください。")
    private String kanjiName;

    @NotBlank(message="必須項目ですので、ご入力またはご選択ください。")
    @Size(max = 90,message="文字数がオーバーしています。90文字以内で入力してください。")
    @Pattern(regexp = "^[ァ-ヶー 　]*$",message="お名前をカタカナで入力してください。")
    private String kanaName;
    @NotBlank(message="必須項目ですので、ご入力またはご選択ください。")

    @Size(max = 120,message="文字数がオーバーしています。120文字以内で入力してください。")
    @Pattern(regexp = "^[a-zA-Z 　]*$",message="お名前を半角ローマ字で入力してください。")
    private String alphabetName;

    @NotBlank(message="必須項目ですので、ご入力またはご選択ください。")
    @Size(max = 10,message="文字数がオーバーしています。10文字以内で入力してください。")
    @Pattern(regexp = "\\d{4}/\\d{1,2}/\\d{1,2}$",message="入力文字または形式が間違っています。半角数字とスラッシュを使用してご記入ください。")
    private String dateOfBirth;

    @NotBlank(message="必須項目ですので、ご選択ください。")
    @Size(max = 6,message="文字数がオーバーしています。6文字以内で入力してください。")
    private String gender;

    @NotBlank(message="必須項目ですので、ご入力ください。")
    @Size(max = 8,message="文字数がオーバーしています。8文字以内で入力してください。")
    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}$",message="郵便番号を半角数字とハイフン(-)で入力してください。")
    private String zipCode;

    @NotBlank(message="必須項目ですので、ご入力ください。")
    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String address;

    @NotBlank(message="必須項目ですので、ご入力ください。")
    @Size(max = 13,message="文字数がオーバーしています。13文字以内で入力してください。")
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$",message="自宅電話番号を半角数字とハイフン（-）で入力してください。")
    private String homePhoneNumber;

    @Size(max = 13,message="文字数がオーバーしています。13文字以内で入力してください。")
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$",message="携帯電話番号を半角数字とハイフン(-)で入力してください。")
    private String mobilePhoneNumber;

    @NotBlank(message="必須項目ですので、ご入力ください。使用できる文字は半角英数字です。")
    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    @Email
    private String emailAddress;

    @NotBlank(message="必須項目ですので、ご選択ください。")
    @Size(max = 20,message="文字数がオーバーしています。20文字以内で入力してください。")
    private String spouse;

    @NotBlank(message="必須項目ですので、ご入力ください。使用できる文字は半角数字です。")
    @Size(max = 20,message="文字数がオーバーしています。20文字以内で入力してください。")
    private String houseClassification;

    @NotBlank(message="必須項目ですので、ご入力ください。使用できる文字は半角数字です。")
    @Size(max = 6,message="文字数がオーバーしています。6文字以内で入力してください。")
    @Pattern(regexp = "[0-9]*",message="ローンなどの借入額を半角数字で入力してください。")
    private String debt;

    @NotBlank(message="必須項目ですので、ご入力またはご選択ください。")
    @Size(max = 120,message="文字数がオーバーしています。120文字以内で入力してください。")
    private String job;

    @NotBlank(message="必須項目ですので、ご入力ください。使用できる文字は半角数字です。")
    @Size(max = 6,message="文字数がオーバーしています。6文字以内で入力してください。")
    @Pattern(regexp = "[0-9]*",message="昨年の所得を数字で入力してください。")
    private String income;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String employerName;

    @Size(max = 8,message="文字数がオーバーしています。8文字以内で入力してください。")
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$",message="郵便番号を半角数字とハイフン(-)で入力してください。")
    private String employerZipCode;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String employerAddress;

    @Size(max = 13,message="文字数がオーバーしています。13文字以内で入力してください。")
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$",message="勤務先の電話番号を半角数字とハイフンで入力してください。")
    private String employerPhoneNumber;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String industryType;

    @Size(max = 6,message="文字数がオーバーしています。6文字以内で入力してください。")
    @Pattern(regexp = "[0-9]*",message="貯金額を選択してください。")
    private String capital;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    @Pattern(regexp = "[0-9]*",message="お勤め先の規模を選択してください。")
    private String companySize;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String position;

    @Size(max = 255,message="文字数がオーバーしています。255文字以内で入力してください。")
    private String department;

    @Size(max = 6,message="文字数がオーバーしています。6文字以内で入力してください。")
    @Pattern(regexp = "[0-9]*",message="勤続年数を半角数字で入力してください。")
    private String employeeLength;

}
