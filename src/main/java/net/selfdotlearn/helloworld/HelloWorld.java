package net.selfdotlearn.helloworld;

import io.javalin.Javalin;

import java.net.InetAddress;
import java.time.ZonedDateTime;

public class HelloWorld {
  public static void main(String[] args) {
    Javalin app = Javalin.create().start(7000);
    app.get("/", ctx -> ctx.result("Hello from '" + InetAddress.getLocalHost().getHostName() + "'"));
    app.get("/now", ctx -> ctx.result("⌚ " + ZonedDateTime.now()));
    app.get("/ping", ctx -> ctx.result("OK!"));
  }
}
