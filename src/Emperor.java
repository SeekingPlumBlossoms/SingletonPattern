import java.util.ArrayList;
import java.util.Random;

public class Emperor {

    private  static  int maxNumOfEmperor=2;
    private  static ArrayList<String> nameList=new ArrayList<String>();
    private static  ArrayList<Emperor> emperorArrayList=new ArrayList<Emperor>();
    private static  int countNumOfEmperor =0;
    static {
        for (int i= 0;i<maxNumOfEmperor;i++){
            emperorArrayList.add(new Emperor("皇"+(i+1)+"帝"));
        }
    }

    private  Emperor (String name){
            nameList.add(name);
    }
    public static Emperor getInstance(){
        Random random=new Random();
        countNumOfEmperor=random.nextInt(maxNumOfEmperor);
        return emperorArrayList.get(countNumOfEmperor);
    }
    public static void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
