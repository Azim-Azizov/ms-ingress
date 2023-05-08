package prototype.test;

import prototype;

public class Test {
    public static void main(String[] args) {
        var lib = new Lib("System", "root");
        var libClone = lib.copy();
    }
}