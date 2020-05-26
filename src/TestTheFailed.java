
public class TestTheFailed {

    public static void  Failed(String [] args){

        BTree<Integer> generatedTree = new BTree<Integer>(2);
        generatedTree.insert(70);
        generatedTree.insert(13);
        generatedTree.insert(63);
        System.out.println(generatedTree.toString());
        generatedTree.insert(73);
        System.out.println(generatedTree.toString());
        generatedTree.insert(49);
        System.out.println(generatedTree.toString());
        generatedTree.insert(11);
        System.out.println(generatedTree.toString());
        generatedTree.insert(98);
        System.out.println(generatedTree.toString());
        generatedTree.delete(13);
        generatedTree.delete(49);
        System.out.println(generatedTree.toString());

        BTree<Integer> generatedTree1 = new BTree<Integer>(2);
        generatedTree1.insert(35);
        generatedTree1.insert(31);
        generatedTree1.insert(58);
        generatedTree1.insert(16);
        generatedTree1.insert(61);
        generatedTree1.insert(25);
        generatedTree1.insert(47);
        generatedTree1.insert(30);
        generatedTree1.insert(54);
        generatedTree1.insert(92);
        generatedTree1.insert(53);
        generatedTree1.insert(94);
        generatedTree1.insert(20);
        System.out.println(generatedTree1.toString());
        generatedTree1.delete(54);
        System.out.println(generatedTree1.toString());
    }
}
