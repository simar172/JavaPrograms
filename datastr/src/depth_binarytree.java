
class lode {
     int val;
      lode left;
      lode right;
      lode() {}
      lode(int val) { this.val = val; }
      lode(int val, lode left, lode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class depth_binarytree {
	
	static int depth(lode root) {
		if(root==null) {
			return 0;
		}
		if(root.right==null && root.left==null) {
			return 1;
		}
		if(root.left==null) {
			return 1+depth(root.right);
		}
		else if(root.right==null) {
			return 1+depth(root.left);
		}
		int my=1+Math.max(depth(root.right),depth(root.left));
		return my;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
