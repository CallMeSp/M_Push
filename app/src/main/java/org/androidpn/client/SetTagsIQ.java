package org.androidpn.client;

import org.jivesoftware.smack.packet.IQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/3/24.
 */

public class SetTagsIQ extends IQ {

    private String username;

    private List<String> tagList=new ArrayList<String>();

    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    @Override

    public String getChildElementXML() {
        StringBuilder buf = new StringBuilder();
        buf.append("<").append("settags").append(" xmlns=\"").append(
                "androidpn:iq:settags").append("\">");
        if (username != null) {
            buf.append("<username>").append(username).append("</username>");
        }
        if (tagList!=null&&!tagList.isEmpty()){
            buf.append("<tags>");
            boolean needSeperate=false;
            for (String tag:tagList){
                if (needSeperate){
                    buf.append(",");
                }
                buf.append(tag);
                needSeperate=true;
            }
            buf.append("</tags>");
        }
        buf.append("</").append("settags").append("> ");
        return buf.toString();
    }
    void et(){
        Scanner sc = new Scanner(System.in);
        String x=sc.nextLine();
        String[] ss=x.split(" ");
        int[] realnum=new int[10];
        int[] copy=realnum.clone();
    }

}
