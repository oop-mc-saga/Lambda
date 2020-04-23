package arraysSample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author tadaki
 */
public class ArraysSample {

    final private int n;
    private final Integer array[];

    public ArraysSample(int n) {
        this.n = n;
        array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
    }

    /**
     * 配列からリストへ
     */
    public void convertList() {
        System.out.println("---- 配列からリストへ -----------");
        List<Integer> list = Arrays.asList(array);
        //要素を一つ変更
        int m = n / 2;
        System.out.println(" リストの真ん中の値を0に ");
        System.out.println("配列側も変更になることの確認");
        list.set(m, 0);
        for (int i = 0; i < n; i++) {//配列側も変更になることの確認
            int x = array[i];
            int y = list.get(i);
            System.out.println(i + ": " + x + " " + y);
        }
        //エラーになる
        // list.add(1);
    }

    /**
     * 要素の探索
     * @param key 
     */
    public void search(int key) {
        System.out.println("---- 要素の探索 ------");
        System.out.println("探索する要素:"+key);
        int k = Arrays.binarySearch(array, key,
                (a, b) -> {
                    return a - b;
                });
        if (k < 0) {
            System.out.println("Not found");
        } else {
            System.out.println(array[k] + " at " + k);
        }
    }

    /**
     * 配列コピー
     * @param m
     * @return 
     */
    public Integer[] newArray(int m) {
        System.out.println("---- 配列の複写 -------");
        Integer array2[] = Arrays.copyOf(array, m * n);
        System.out.println("length of b is " + array2.length);
        System.out.println("後ろにランダムな値を追加");
        for (int i = n; i < m * n; i++) {
            array2[i] = (int) (100 * Math.random());
        }
        return array2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10;
        int key = n / 2;
        ArraysSample sys = new ArraysSample(n);
        sys.convertList();
        sys.search(n / 2);
        sys.search((n - 2) * (n - 2));
        Integer array2[] = sys.newArray(2);
        //比較方法を指定した整列
        Arrays.sort(array2,
                (a, b) -> {
                    return a - b;
                });
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
    }

}
