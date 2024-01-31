import java.util.Scanner;
public class linsearch {
    public static int  menu(String menues[], String key){
        for (int i = 0; i < menues.length; i++) {
            if (menues[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String menues[]={"noodles", "maggi","bread pakoda","chai","coffee","momos","prantha"};
        Scanner myobj = new Scanner(System.in);
        String key ;
        System.out.println("pls enter the dish you want to eat");
        key = myobj.nextLine();
        int  index = menu(menues,key);
        if (index == -1) {
            System.out.println("coudn't find the key ");
        } else {
            System.out.println("yes find the key");
        }
    }
}







