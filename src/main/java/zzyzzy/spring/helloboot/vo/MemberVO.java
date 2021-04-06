package zzyzzy.spring.helloboot.vo;

public class MemberVO {

    protected String mno;
    protected String userid;
    protected String passwd;
    protected String name;
    protected String email;
    protected String regdate;

    public MemberVO() {
    }

    public MemberVO(String mno, String userid, String passwd, String name, String email, String regdate) {
        this.mno = mno;
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.email = email;
        this.regdate = regdate;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

}
