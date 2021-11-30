package program.swing.whatTodayEat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

public class View extends JFrame {
    private Controller controller = new Controller();

    public View() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        JRadioButton[] distanceButtons = new JRadioButton[4];
        ButtonGroup distanceGroup = new ButtonGroup();

        Icon distanceAllBasic = new ImageIcon("image/basic_all_btn.jpg");
        Icon distanceAllHover = new ImageIcon("image/hover_all_btn.jpg");
        Icon distanceAllSelected = new ImageIcon("image/selected_all_btn.jpg");
        distanceButtons[0] = new JRadioButton(Distance.All.value(), distanceAllBasic, true);
        distanceButtons[0].setRolloverIcon(distanceAllHover); // 마우스 올리기
        distanceButtons[0].setSelectedIcon(distanceAllSelected); // 마우스 올리기
        distanceButtons[0].setLocation(20, 31);
        distanceButtons[0].setSize(106, 40);
        distanceButtons[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[0]);
        contentPane.add(distanceButtons[0]);

        Icon threeHundBasic = new ImageIcon("image/basic_300_btn.jpg");
        Icon threeHundHover = new ImageIcon("image/hover_300_btn.jpg");
        Icon threeHundSelected = new ImageIcon("image/selected_300_btn.jpg");
        distanceButtons[1] = new JRadioButton(Distance.THREE_HUNDRED.value(), threeHundBasic);
        distanceButtons[1].setRolloverIcon(threeHundHover); // 마우스 올리기
        distanceButtons[1].setSelectedIcon(threeHundSelected); // 마우스 올리기
        distanceButtons[1].setLocation(146, 31);
        distanceButtons[1].setSize(106, 40);
        distanceButtons[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[1]);
        contentPane.add(distanceButtons[1]);

        Icon fiveHundBasic = new ImageIcon("image/basic_500_btn.jpg");
        Icon fiveHundHover = new ImageIcon("image/hover_500_btn.jpg");
        Icon fiveHundSelected = new ImageIcon("image/selected_500_btn.jpg");
        distanceButtons[2] = new JRadioButton(Distance.FIVE_HUNDRED.value(), fiveHundBasic);
        distanceButtons[2].setRolloverIcon(fiveHundHover); // 마우스 올리기
        distanceButtons[2].setSelectedIcon(fiveHundSelected); // 마우스 올리기
        distanceButtons[2].setLocation(272, 31);
        distanceButtons[2].setSize(106, 40);
        distanceButtons[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[2]);
        contentPane.add(distanceButtons[2]);

        Icon oneKiloMBasic = new ImageIcon("image/basic_1km_btn.jpg");
        Icon oneKiloMHover = new ImageIcon("image/hover_1km_btn.jpg");
        Icon oneKiloMSelected = new ImageIcon("image/selected_1km_btn.jpg");
        distanceButtons[3] = new JRadioButton(Distance.ONE_KILOMETER.value(), oneKiloMBasic);
        distanceButtons[3].setRolloverIcon(oneKiloMHover); // 마우스 올리기
        distanceButtons[3].setSelectedIcon(oneKiloMSelected); // 마우스 올리기
        distanceButtons[3].setLocation(398, 31);
        distanceButtons[3].setSize(106, 40);
        distanceButtons[3].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[3]);
        contentPane.add(distanceButtons[3]);

        JRadioButton[] foodButtons = new JRadioButton[5];
        ButtonGroup foodGroup = new ButtonGroup();

        Icon foodAllBasic = new ImageIcon("image/food_basic_all_btn.jpg");
        Icon foodAllHover = new ImageIcon("image/food_hover_all_btn.jpg");
        Icon foodAllSelected = new ImageIcon("image/food_selected_all_btn.jpg");
        foodButtons[0] = new JRadioButton(FoodCategory.ALL.value(), foodAllBasic, true);
        foodButtons[0].setRolloverIcon(foodAllHover); // 마우스 올리기
        foodButtons[0].setSelectedIcon(foodAllSelected); // 마우스 올리기
        foodButtons[0].setLocation(20, 100);
        foodButtons[0].setSize(84, 40);
        foodButtons[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[0]);
        contentPane.add(foodButtons[0]);

        Icon foodKoreaBasic = new ImageIcon("image/food_basic_korea_btn.jpg");
        Icon foodKoreaHover = new ImageIcon("image/food_hover_korea_btn.jpg");
        Icon foodKoreaSelected = new ImageIcon("image/food_selected_korea_btn.jpg");
        foodButtons[1] = new JRadioButton(FoodCategory.KOREA.value(), foodKoreaBasic);
        foodButtons[1].setRolloverIcon(foodKoreaHover); // 마우스 올리기
        foodButtons[1].setSelectedIcon(foodKoreaSelected); // 마우스 올리기
        foodButtons[1].setLocation(120, 100);
        foodButtons[1].setSize(84, 40);
        foodButtons[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[1]);
        contentPane.add(foodButtons[1]);

        Icon foodChinaBasic = new ImageIcon("image/food_basic_china_btn.jpg");
        Icon foodChinaHover = new ImageIcon("image/food_hover_china_btn.jpg");
        Icon foodChinaSelected = new ImageIcon("image/food_selected_china_btn.jpg");
        foodButtons[2] = new JRadioButton(FoodCategory.CHINA.value(), foodChinaBasic);
        foodButtons[2].setRolloverIcon(foodChinaHover); // 마우스 올리기
        foodButtons[2].setSelectedIcon(foodChinaSelected); // 마우스 올리기
        foodButtons[2].setLocation(220, 100);
        foodButtons[2].setSize(84, 40);
        foodButtons[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[2]);
        contentPane.add(foodButtons[2]);

        Icon foodJapanBasic = new ImageIcon("image/food_basic_japan_btn.jpg");
        Icon foodJapanHover = new ImageIcon("image/food_hover_japan_btn.jpg");
        Icon foodJapanSelected = new ImageIcon("image/food_selected_japan_btn.jpg");
        foodButtons[3] = new JRadioButton(FoodCategory.JAPAN.value(), foodJapanBasic);
        foodButtons[3].setRolloverIcon(foodJapanHover); // 마우스 올리기
        foodButtons[3].setSelectedIcon(foodJapanSelected); // 마우스 올리기
        foodButtons[3].setLocation(320, 100);
        foodButtons[3].setSize(84, 40);
        foodButtons[3].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[3]);
        contentPane.add(foodButtons[3]);

        Icon foodForeignBasic = new ImageIcon("image/food_basic_foreign_btn.jpg");
        Icon foodForeignHover = new ImageIcon("image/food_hover_foreign_btn.jpg");
        Icon foodForeignSelected = new ImageIcon("image/food_selected_foreign_btn.jpg");
        foodButtons[4] = new JRadioButton(FoodCategory.FOREIGN.value(), foodForeignBasic);
        foodButtons[4].setRolloverIcon(foodForeignHover); // 마우스 올리기
        foodButtons[4].setSelectedIcon(foodForeignSelected); // 마우스 올리기
        foodButtons[4].setLocation(420, 100);
        foodButtons[4].setSize(84, 40);
        foodButtons[4].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[4]);
        contentPane.add(foodButtons[4]);

        JLabel jLabel = new JLabel("", SwingConstants.CENTER);
        jLabel.setFont(new Font("맑은 고딕", Font.BOLD, 50));
        jLabel.setLocation(20, 166);
        jLabel.setSize(484, 252);
        jLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(jLabel);

        Icon randomBasic = new ImageIcon("image/basic_random_btn.jpg");
        Icon randomHover = new ImageIcon("image/hover_random_btn.jpg");
        JButton randomBasicButton = new JButton(randomBasic);
        randomBasicButton.setRolloverIcon(randomHover);
        randomBasicButton.setLocation(20, 444);
        randomBasicButton.setSize(486, 90);
        randomBasicButton.setBorderPainted(false);
        randomBasicButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contentPane.add(randomBasicButton);

        randomBasicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                String selectedDistance = whatIsSelected(distanceGroup);
                String selectedFood = whatIsSelected(foodGroup);

                System.out.println(selectedDistance + " " + selectedFood);

                Restaurant restaurant = controller.getRestaurant(selectedDistance, selectedFood);

                jLabel.setText(restaurant.getName());
            }
        });

        setTitle("What eat Today");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(544, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private String whatIsSelected(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements(); ) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        new View();
    }
}
