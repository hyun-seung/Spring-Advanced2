package org.work.network.tcp.autoclosable;

// try-with-resources 를 쓰기 위해서는 AutoCloseable 을 상속 받아야함
public class ResourceV2 implements AutoCloseable {

    private String name;

    public ResourceV2(String name) {
        this.name = name;
    }

    public void call( ){
        System.out.println(name + " call");
    }

    public void callEx() throws CallException {
        System.out.println(name + " callEx");
        throw new CallException(name + " ex");
    }

    @Override
    public void close() throws CloseException {
        System.out.println(name + " close");
        throw new CloseException(name + " closeEx");
    }
}
