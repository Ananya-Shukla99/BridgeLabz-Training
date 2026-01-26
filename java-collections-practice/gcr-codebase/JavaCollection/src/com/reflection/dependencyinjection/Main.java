package com.reflection.dependencyinjection;

public class Main {
    public static void main(String[] args) throws Exception {

        Client client = new Client();

        DIContainer.injectDependencies(client);

        client.doWork();
    }
}
