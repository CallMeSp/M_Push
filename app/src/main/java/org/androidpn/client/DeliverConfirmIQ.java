package org.androidpn.client;

import org.jivesoftware.smack.packet.IQ;

/**
 * Created by Administrator on 2017/3/24.
 */

public class DeliverConfirmIQ extends IQ {
    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String getChildElementXML() {
        StringBuilder buf = new StringBuilder();
        buf.append("<").append("notification").append(" xmlns=\"").append(
                "androidpn:iq:notification").append("\">");
        if (uuid != null) {
            buf.append("<uuid>").append(uuid).append("</uuid>");
        }
        buf.append("</").append("notification").append("> ");
        return buf.toString();
    }
}
