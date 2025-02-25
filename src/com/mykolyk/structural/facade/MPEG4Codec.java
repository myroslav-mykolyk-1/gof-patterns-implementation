package com.mykolyk.structural.facade;

class MPEG4Codec implements Codec {
    @Override
    public String getType() {
        return "mp4";
    }
}
