package edu.pizaini.task1;

import java.util.Date;

public class Task1Run3 {
    /**
     * Tree
     * @param args
     */
    public static void main(String[] args) {
        Task1Run3 run3 = new Task1Run3();
        /**
         * Add data to a tree
         */
        Task1BinaryTree tree = run3.addData();

        /**
         * preOrder
         */
        tree.preOrder(tree.getRoot());

        /**
         * Post Order
         */
        tree.postOrder(tree.getRoot());
    }

    private Task1BinaryTree addData(){
        /**
         * Init data
         */
        Date today = new Date();
        Task1Buku buku1 = new Task1Buku("Judul 1", "Penerbit 1", today, 1);
        Task1Buku buku2 = new Task1Buku("Judul 2", "Penerbit 2", today, 12);
        Task1Buku buku3 = new Task1Buku("Judul 3", "Penerbit 3", today, 21);
        Task1Buku buku4 = new Task1Buku("Judul 4", "Penerbit 4", today, 31);
        Task1Buku buku5 = new Task1Buku("Judul 5", "Penerbit 5", today, 41);
        Task1Buku buku6 = new Task1Buku("Judul 6", "Penerbit 6", today, 6);
        Task1Buku buku7 = new Task1Buku("Judul 7", "Penerbit 7", today, 99);

        /**
         * Row 3
         */
        Task1Node node4 = new Task1Node(buku4, null, null);
        Task1Node node5 = new Task1Node(buku5, null, null);
        Task1Node node6 = new Task1Node(buku6, null, null);
        Task1Node node7 = new Task1Node(buku7, null, null);


        /**
         * Row 2
         */
        Task1Node node2 = new Task1Node(buku2, node4, node5);
        Task1Node node3 = new Task1Node(buku3, node6, node7);

        /**
         * Root element
         */
        Task1Node root = new Task1Node(buku1, node2, node3);

        Task1BinaryTree tree = new Task1BinaryTree(root);
        return tree;
    }
}
