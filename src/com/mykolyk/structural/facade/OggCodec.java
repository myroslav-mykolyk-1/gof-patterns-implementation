package com.mykolyk.structural.facade;

class OggCodec implements Codec {
    @Override
    public String getType() {
        return "ogg";
    }
}
