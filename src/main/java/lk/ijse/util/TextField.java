package lk.ijse.util;

public enum TextField {
    ID,NIC,FNAME,LNAME,ADDRESS,MOBILE,EMAIL;

    private String style;

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
