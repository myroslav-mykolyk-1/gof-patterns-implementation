package com.mykolyk.structural.decorator;

interface DataSource {
    void writeData(String data);

    String readData();
}
