import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calender;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    String time;
    String day;


    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock App");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free", Font.PLAIN,35));
        dayLabel.setForeground(new Color(0x00FF00));
        //dayLabel.setBackground(Color.black);
        dayLabel.setOpaque(true);




        this.add(timeLabel);
        this.add(dayLabel);
        setVisible(true);

        setTime();

    }

    public void setTime() {
        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
