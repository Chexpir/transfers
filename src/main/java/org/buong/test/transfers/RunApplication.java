package org.buong.test.transfers;

public final class RunApplication {

	public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }

}
