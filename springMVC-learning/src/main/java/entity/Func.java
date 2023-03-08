package entity;


public class Func {
    private String fImg;
    private String fName;
    private String fDec;

    public Func() {
    }

    public Func(String fImg, String fName, String fDec) {
        this.fImg = fImg;
        this.fName = fName;
        this.fDec = fDec;
    }

    public String getfImg() {
        return fImg;
    }

    public void setfImg(String fImg) {
        this.fImg = fImg;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getfDec() {
        return fDec;
    }

    public void setfDec(String fDec) {
        this.fDec = fDec;
    }
}
