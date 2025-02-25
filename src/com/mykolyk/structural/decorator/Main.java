package com.mykolyk.structural.decorator;

public class Main {
    public static void main(String[] args) {
        String filePath = "test.txt";
        DataSource fileDataSource = new FileDataSource(filePath);
        DataSource encryptedDataSource = new EncryptionDecorator(fileDataSource);
        DataSource compressedEncryptedDataSource = new CompressionDecorator(encryptedDataSource);
        compressedEncryptedDataSource.writeData("Hello, this is a secret message!");
        String result = compressedEncryptedDataSource.readData();
        System.out.println("Result after decompress & decrypt: " + result);
    }
}
