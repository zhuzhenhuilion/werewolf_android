package com.zinglabs.zwerewolf.entity;

/**
 * @user wangtonghe
 * @date 2017/7/24
 * @email wthfeng@126.com
 */

public class RequestBody {

    public RequestBody(short serviceId, short commandId, int fromId, int roomId, int content) {
        this.serviceId = serviceId;
        this.commandId = commandId;
        this.fromId = fromId;
        this.roomId = roomId;
        this.content = content;
    }

    public RequestBody(short serviceId, short commandId, int fromId, int roomId, int content, int bout) {
        this.serviceId = serviceId;
        this.commandId = commandId;
        this.fromId = fromId;
        this.roomId = roomId;
        this.content = content;
        this.bout = bout;
    }

    public RequestBody(short serviceId, short commandId, int fromId, int content) {
        this.serviceId = serviceId;
        this.commandId = commandId;
        this.fromId = fromId;
        this.content = content;
    }

    private short serviceId;

    private short commandId;

    private int fromId;

    private int roomId;

    private int content;

    private int bout ;

    public int getBout() {
        return bout;
    }

    public void setBout(int bout) {
        this.bout = bout;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public short getServiceId() {
        return serviceId;
    }

    public void setServiceId(short serviceId) {
        this.serviceId = serviceId;
    }

    public short getCommandId() {
        return commandId;
    }

    public void setCommandId(short commandId) {
        this.commandId = commandId;
    }
}
