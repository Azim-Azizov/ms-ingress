package test.singleton;

import singleton;

class Test {
    public static void main(String[] args) {
        ApiClient apiClient = ApiClient.getInstance();
        System.out.println(apiClient);
        apiClient.sendAction("get:/users/me");
        apiClient.sendAction("post:/channels?name=Singleton&type=public");
        apiClient.sendAction("post:/message/Singleton?text=Hello, Ingress");
        System.out.println(apiClient);
        ApiClient apiClient1 = ApiClient.getInstance();
        System.out.println(apiClient1);
    }
}