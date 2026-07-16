public class ExpressionTree {


    public static void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // 2. Inorder Traversal untuk Notasi Infix (Kiri -> Root -> Kanan)
    public static void inorderTraversal(Node root) {
        if (root != null) {
            // Menambahkan kurung buka secara otomatis jika berupa operator (bukan daun)
            if (root.left != null && root.right != null) {
                System.out.print("( ");
            }
            
            inorderTraversal(root.left);
            System.out.print(root.value + " ");
            inorderTraversal(root.right);
            
            // Menambahkan kurung tutup
            if (root.left != null && root.right != null) {
                System.out.print(") ");
            }
        }
    }

    // 3. Postorder Traversal untuk Notasi Postfix (Kiri -> Kanan -> Root)
    public static void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

// Lanjutan dari class ExpressionTree di atas
    public static void main(String[] args) {
        
        // --- PROSES MEMBANGUN EXPRESSION TREE ---
        // Membuat Akar Utama (Operator Perkalian)
        Node root = new Node("*");

        // Subtree Kiri untuk ekspresi: (3 + 5)
        root.left = new Node("+");
        root.left.left = new Node("3");
        root.left.right = new Node("5");

        // Subtree Kanan untuk ekspresi: (8 - 2)
        root.right = new Node("-");
        root.right.left = new Node("8");
        root.right.right = new Node("2");


        // --- PROSES EKSEKUSI DAN OUTPUT ---
        System.out.print("Prefix  : ");
        preorderTraversal(root);
        System.out.println();

        System.out.print("Infix   : ");
        inorderTraversal(root);
        System.out.println();

        System.out.print("Postfix : ");
        postorderTraversal(root);
        System.out.println();
    }
} // Akhir dari class ExpressionTree