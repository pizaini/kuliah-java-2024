package edu.pizaini.task1;

public class Task1Node {
    private Task1Buku data;

    private Task1Node left;

    private Task1Node right;

    public Task1Node(Task1Buku data, Task1Node left, Task1Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Task1Buku getData() {
        return data;
    }

    public void setData(Task1Buku data) {
        this.data = data;
    }

    public Task1Node getLeft() {
        return left;
    }

    public void setLeft(Task1Node left) {
        this.left = left;
    }

    public Task1Node getRight() {
        return right;
    }

    public void setRight(Task1Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Task1Node{" +
                "data=" + data.toString() +
                '}';
    }
}
