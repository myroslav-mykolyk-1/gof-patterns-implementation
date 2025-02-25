package com.mykolyk.structural.decorator;

import java.io.ByteArrayOutputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

class CompressionDecorator extends DataSourceDecorator {
    CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String compressed = compress(data);
        super.writeData(compressed);
    }

    @Override
    public String readData() {
        String compressed = super.readData();
        return decompress(compressed);
    }

    private String compress(String data) {
        byte[] input = data.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(input);
        deflater.finish();
        byte[] buffer = new byte[1024];
        while (!deflater.finished()) {
            int count = deflater.deflate(buffer);
            byteArrayOutputStream.write(buffer, 0, count);
        }
        deflater.end();
        return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    }

    private String decompress(String data) {
        byte[] input = Base64.getDecoder().decode(data);
        Inflater inflater = new Inflater();
        inflater.setInput(input);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        try {
            while (!inflater.finished()) {
                int count = inflater.inflate(buffer);
                byteArrayOutputStream.write(buffer, 0, count);
            }
            inflater.end();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }
}
