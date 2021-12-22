package codingbot.kms.dto;

import java.sql.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ConvenienceDTO {

	private int numConvenience; //글번호
	
	private String categoryConvenience; //분류
	@NotEmpty
	@Length (max=15)
	private String nameConvenience; //시설명	
	@NotEmpty
	@Length (max=15)
	private String useTimeConvenience; //이용시간
	@NotEmpty
	@Pattern(regexp="(?=.*[0-9]).{5,}")
	@Length (max=12)
	private String phoneNumConvenience; //전화번호
	@NotEmpty
	@Length (max=70)
	private String addressConvenience; //주소
	private String imgConvenience; //이미지이름
	private int readcount; //조회수
	private Date regdate; //등록일
	private MultipartFile imgFile;//실제이미지
	private String content; //답변내용
	private int answerNum;//답변 원글 번호
	private int answerLev;//답변깊이
	private int answerSeq;//답변번호
	private String answerName;//답변작성자
	private String answerPass;//답변비밀번호
	
	public int getNumConvenience() {
		return numConvenience;
	}
	public void setNumConvenience(int numConvenience) {
		this.numConvenience = numConvenience;
	}
	public String getCategoryConvenience() {
		return categoryConvenience;
	}
	public void setCategoryConvenience(String categoryConvenience) {
		this.categoryConvenience = categoryConvenience;
	}
	public String getNameConvenience() {
		return nameConvenience;
	}
	public void setNameConvenience(String nameConvenience) {
		this.nameConvenience = nameConvenience;
	}
	public String getUseTimeConvenience() {
		return useTimeConvenience;
	}
	public void setUseTimeConvenience(String useTimeConvenience) {
		this.useTimeConvenience = useTimeConvenience;
	}
	public String getPhoneNumConvenience() {
		return phoneNumConvenience;
	}
	public void setPhoneNumConvenience(String phoneNumConvenience) {
		this.phoneNumConvenience = phoneNumConvenience;
	}
	public String getAddressConvenience() {
		return addressConvenience;
	}
	public void setAddressConvenience(String addressConvenience) {
		this.addressConvenience = addressConvenience;
	}
	public String getImgConvenience() {
		return imgConvenience;
	}
	public void setImgConvenience(String imgConvenience) {
		this.imgConvenience = imgConvenience;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public MultipartFile getImgFile() {
		return imgFile;
	}
	public void setImgFile(MultipartFile imgFile) {
		this.imgFile = imgFile;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAnswerNum() {
		return answerNum;
	}
	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}
	public int getAnswerLev() {
		return answerLev;
	}
	public void setAnswerLev(int answerLev) {
		this.answerLev = answerLev;
	}
	public int getAnswerSeq() {
		return answerSeq;
	}
	public void setAnswerSeq(int answerSeq) {
		this.answerSeq = answerSeq;
	}
	public String getAnswerName() {
		return answerName;
	}
	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}
	public String getAnswerPass() {
		return answerPass;
	}
	public void setAnswerPass(String answerPass) {
		this.answerPass = answerPass;
	}
	@Override
	public String toString() {
		return "ConvenienceDTO [numConvenience=" + numConvenience + ", categoryConvenience=" + categoryConvenience
				+ ", nameConvenience=" + nameConvenience + ", useTimeConvenience=" + useTimeConvenience
				+ ", phoneNumConvenience=" + phoneNumConvenience + ", addressConvenience=" + addressConvenience
				+ ", imgConvenience=" + imgConvenience + ", readcount=" + readcount + ", regdate=" + regdate
				+ ", imgFile=" + imgFile + ", content=" + content + ", answerNum=" + answerNum + ", answerLev="
				+ answerLev + ", answerSeq=" + answerSeq + ", answerName=" + answerName + ", answerPass=" + answerPass
				+ "]";
	}
}
