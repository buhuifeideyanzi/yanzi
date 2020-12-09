import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_list=new ArrayList<>();//添加一个List类型面板
    int array2d[][]={  //设置一个二维数组
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    int cnt=0;
    int cell=128;  //设置图片的宽度和高度
    //构造方法
    public App() {     //添加for循环，循环9个元素和图片
        for (int i = 0; i <=8; i++) {
            label_list.add(new JLabel());//添加元素
            //图片引用地址，String.valueof(i)把值转换为String类型
            java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(i)+".png");
            label_list.get(i).setIcon(new ImageIcon(imgURL));
        }
//          双重for循环，可以设置x，y坐标，还可以添加mypanel元素。
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                //设置列为 X*128坐标，行为 Y*128坐标
                label_list.get(cnt).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(cnt));  //循环添加多个组键
                cnt++;
            }
        }

    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,384,512);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
