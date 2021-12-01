package program.swing.whatTodayEat;

import program.swing.whatTodayEat.buttonEnum.Distance;
import program.swing.whatTodayEat.buttonEnum.DistanceImage;
import program.swing.whatTodayEat.buttonEnum.EtcButton;
import program.swing.whatTodayEat.buttonEnum.FoodCategory;
import program.swing.whatTodayEat.buttonEnum.FoodCategoryImage;
import program.swing.whatTodayEat.buttonEnum.RandomButtonImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

public class View extends JFrame {
    private static final String FONT = "맑은 고딕";
    private static final String FRAME_TITLE = "What Eat Today";
    private static final int FONT_SIZE = 30;
    private static final int FRAME_WIDTH = 544;
    private static final int FRAME_HEIGHT = 600;

    private Controller controller = new Controller();

    public View() {
        buttonSetting();
        frameSetting();
    }

    private void buttonSetting() {
        Container contentPane = getContentPane();
        contentPane.setLayout(null);
        JRadioButton[] distanceButtons = new JRadioButton[Distance.values().length];
        ButtonGroup distanceGroup = new ButtonGroup();

        Icon distanceAllBasic = new ImageIcon(DistanceImage.ALL_BASIC.url());
        Icon distanceAllHover = new ImageIcon(DistanceImage.ALL_HOVER.url());
        Icon distanceAllSelected = new ImageIcon(DistanceImage.ALL_SELECTED.url());
        distanceButtons[Distance.All.index()] = new JRadioButton(Distance.All.value(), distanceAllBasic, true);
        distanceButtons[Distance.All.index()].setRolloverIcon(distanceAllHover);
        distanceButtons[Distance.All.index()].setSelectedIcon(distanceAllSelected);
        distanceButtons[Distance.All.index()].setLocation(Distance.All.getX(), Distance.All.getY());
        distanceButtons[Distance.All.index()].setSize(Distance.All.getWidth(), Distance.All.getHeight());
        distanceButtons[Distance.All.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[Distance.All.index()]);
        contentPane.add(distanceButtons[Distance.All.index()]);

        Icon threeHundBasic = new ImageIcon(DistanceImage.THREE_HUNDRED_BASIC.url());
        Icon threeHundHover = new ImageIcon(DistanceImage.THREE_HUNDRED_HOVER.url());
        Icon threeHundSelected = new ImageIcon(DistanceImage.THREE_HUNDRED_SELECTED.url());
        distanceButtons[Distance.THREE_HUNDRED.index()] = new JRadioButton(Distance.THREE_HUNDRED.value(), threeHundBasic);
        distanceButtons[Distance.THREE_HUNDRED.index()].setRolloverIcon(threeHundHover);
        distanceButtons[Distance.THREE_HUNDRED.index()].setSelectedIcon(threeHundSelected);
        distanceButtons[Distance.THREE_HUNDRED.index()].setLocation(Distance.THREE_HUNDRED.getX(), Distance.THREE_HUNDRED.getY());
        distanceButtons[Distance.THREE_HUNDRED.index()].setSize(Distance.THREE_HUNDRED.getWidth(), Distance.THREE_HUNDRED.getHeight());
        distanceButtons[Distance.THREE_HUNDRED.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[Distance.THREE_HUNDRED.index()]);
        contentPane.add(distanceButtons[Distance.THREE_HUNDRED.index()]);

        Icon fiveHundBasic = new ImageIcon(DistanceImage.FIVE_HUNDRED_BASIC.url());
        Icon fiveHundHover = new ImageIcon(DistanceImage.FIVE_HUNDRED_HOVER.url());
        Icon fiveHundSelected = new ImageIcon(DistanceImage.FIVE_HUNDRED_SELECTED.url());
        distanceButtons[Distance.FIVE_HUNDRED.index()] = new JRadioButton(Distance.FIVE_HUNDRED.value(), fiveHundBasic);
        distanceButtons[Distance.FIVE_HUNDRED.index()].setRolloverIcon(fiveHundHover);
        distanceButtons[Distance.FIVE_HUNDRED.index()].setSelectedIcon(fiveHundSelected);
        distanceButtons[Distance.FIVE_HUNDRED.index()].setLocation(Distance.FIVE_HUNDRED.getX(), Distance.FIVE_HUNDRED.getY());
        distanceButtons[Distance.FIVE_HUNDRED.index()].setSize(Distance.FIVE_HUNDRED.getWidth(), Distance.FIVE_HUNDRED.getHeight());
        distanceButtons[Distance.FIVE_HUNDRED.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[Distance.FIVE_HUNDRED.index()]);
        contentPane.add(distanceButtons[Distance.FIVE_HUNDRED.index()]);

        Icon oneKiloMBasic = new ImageIcon(DistanceImage.ONE_KILOMETER_BASIC.url());
        Icon oneKiloMHover = new ImageIcon(DistanceImage.ONE_KILOMETER_HOVER.url());
        Icon oneKiloMSelected = new ImageIcon(DistanceImage.ONE_KILOMETER_SELECTED.url());
        distanceButtons[Distance.ONE_KILOMETER.index()] = new JRadioButton(Distance.ONE_KILOMETER.value(), oneKiloMBasic);
        distanceButtons[Distance.ONE_KILOMETER.index()].setRolloverIcon(oneKiloMHover);
        distanceButtons[Distance.ONE_KILOMETER.index()].setSelectedIcon(oneKiloMSelected);
        distanceButtons[Distance.ONE_KILOMETER.index()].setLocation(Distance.ONE_KILOMETER.getX(), Distance.ONE_KILOMETER.getY());
        distanceButtons[Distance.ONE_KILOMETER.index()].setSize(Distance.ONE_KILOMETER.getWidth(), Distance.ONE_KILOMETER.getHeight());
        distanceButtons[Distance.ONE_KILOMETER.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        distanceGroup.add(distanceButtons[Distance.ONE_KILOMETER.index()]);
        contentPane.add(distanceButtons[Distance.ONE_KILOMETER.index()]);

        JRadioButton[] foodButtons = new JRadioButton[FoodCategory.values().length];
        ButtonGroup foodGroup = new ButtonGroup();

        Icon foodAllBasic = new ImageIcon(FoodCategoryImage.ALL_BASIC.url());
        Icon foodAllHover = new ImageIcon(FoodCategoryImage.ALL_HOVER.url());
        Icon foodAllSelected = new ImageIcon(FoodCategoryImage.ALL_SELECTED.url());
        foodButtons[FoodCategory.ALL.index()] = new JRadioButton(FoodCategory.ALL.value(), foodAllBasic, true);
        foodButtons[FoodCategory.ALL.index()].setRolloverIcon(foodAllHover);
        foodButtons[FoodCategory.ALL.index()].setSelectedIcon(foodAllSelected);
        foodButtons[FoodCategory.ALL.index()].setLocation(FoodCategory.ALL.getX(), FoodCategory.ALL.getY());
        foodButtons[FoodCategory.ALL.index()].setSize(FoodCategory.ALL.getWidth(), FoodCategory.ALL.getHeight());
        foodButtons[FoodCategory.ALL.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[FoodCategory.ALL.index()]);
        contentPane.add(foodButtons[FoodCategory.ALL.index()]);

        Icon foodKoreaBasic = new ImageIcon(FoodCategoryImage.KOREA_BASIC.url());
        Icon foodKoreaHover = new ImageIcon(FoodCategoryImage.KOREA_HOVER.url());
        Icon foodKoreaSelected = new ImageIcon(FoodCategoryImage.KOREA_SELECTED.url());
        foodButtons[FoodCategory.KOREA.index()] = new JRadioButton(FoodCategory.KOREA.value(), foodKoreaBasic);
        foodButtons[FoodCategory.KOREA.index()].setRolloverIcon(foodKoreaHover);
        foodButtons[FoodCategory.KOREA.index()].setSelectedIcon(foodKoreaSelected);
        foodButtons[FoodCategory.KOREA.index()].setLocation(FoodCategory.KOREA.getX(), FoodCategory.KOREA.getY());
        foodButtons[FoodCategory.KOREA.index()].setSize(FoodCategory.KOREA.getWidth(), FoodCategory.KOREA.getHeight());
        foodButtons[FoodCategory.KOREA.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[FoodCategory.KOREA.index()]);
        contentPane.add(foodButtons[FoodCategory.KOREA.index()]);

        Icon foodChinaBasic = new ImageIcon(FoodCategoryImage.CHINA_BASIC.url());
        Icon foodChinaHover = new ImageIcon(FoodCategoryImage.CHINA_HOVER.url());
        Icon foodChinaSelected = new ImageIcon(FoodCategoryImage.CHINA_SELECTED.url());
        foodButtons[FoodCategory.CHINA.index()] = new JRadioButton(FoodCategory.CHINA.value(), foodChinaBasic);
        foodButtons[FoodCategory.CHINA.index()].setRolloverIcon(foodChinaHover);
        foodButtons[FoodCategory.CHINA.index()].setSelectedIcon(foodChinaSelected);
        foodButtons[FoodCategory.CHINA.index()].setLocation(FoodCategory.CHINA.getX(), FoodCategory.CHINA.getY());
        foodButtons[FoodCategory.CHINA.index()].setSize(FoodCategory.CHINA.getWidth(), FoodCategory.CHINA.getHeight());
        foodButtons[FoodCategory.CHINA.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[FoodCategory.CHINA.index()]);
        contentPane.add(foodButtons[FoodCategory.CHINA.index()]);

        Icon foodJapanBasic = new ImageIcon(FoodCategoryImage.JAPAN_BASIC.url());
        Icon foodJapanHover = new ImageIcon(FoodCategoryImage.JAPAN_HOVER.url());
        Icon foodJapanSelected = new ImageIcon(FoodCategoryImage.JAPAN_SELECTED.url());
        foodButtons[FoodCategory.JAPAN.index()] = new JRadioButton(FoodCategory.JAPAN.value(), foodJapanBasic);
        foodButtons[FoodCategory.JAPAN.index()].setRolloverIcon(foodJapanHover);
        foodButtons[FoodCategory.JAPAN.index()].setSelectedIcon(foodJapanSelected);
        foodButtons[FoodCategory.JAPAN.index()].setLocation(FoodCategory.JAPAN.getX(), FoodCategory.JAPAN.getY());
        foodButtons[FoodCategory.JAPAN.index()].setSize(FoodCategory.JAPAN.getWidth(), FoodCategory.JAPAN.getHeight());
        foodButtons[FoodCategory.JAPAN.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[FoodCategory.JAPAN.index()]);
        contentPane.add(foodButtons[FoodCategory.JAPAN.index()]);

        Icon foodForeignBasic = new ImageIcon(FoodCategoryImage.FOREIGN_BASIC.url());
        Icon foodForeignHover = new ImageIcon(FoodCategoryImage.FOREIGN_HOVER.url());
        Icon foodForeignSelected = new ImageIcon(FoodCategoryImage.FOREIGN_SELECTED.url());
        foodButtons[FoodCategory.FOREIGN.index()] = new JRadioButton(FoodCategory.FOREIGN.value(), foodForeignBasic);
        foodButtons[FoodCategory.FOREIGN.index()].setRolloverIcon(foodForeignHover);
        foodButtons[FoodCategory.FOREIGN.index()].setSelectedIcon(foodForeignSelected);
        foodButtons[FoodCategory.FOREIGN.index()].setLocation(FoodCategory.FOREIGN.getX(), FoodCategory.FOREIGN.getY());
        foodButtons[FoodCategory.FOREIGN.index()].setSize(FoodCategory.FOREIGN.getWidth(), FoodCategory.FOREIGN.getHeight());
        foodButtons[FoodCategory.FOREIGN.index()].setCursor(new Cursor(Cursor.HAND_CURSOR));
        foodGroup.add(foodButtons[FoodCategory.FOREIGN.index()]);
        contentPane.add(foodButtons[FoodCategory.FOREIGN.index()]);

        JLabel jLabel = new JLabel("", SwingConstants.CENTER);
        jLabel.setFont(new Font(FONT, Font.BOLD, FONT_SIZE));
        jLabel.setLocation(EtcButton.JLABEL.getX(), EtcButton.JLABEL.getY());
        jLabel.setSize(EtcButton.JLABEL.getWidth(), EtcButton.JLABEL.getHeight());
        jLabel.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        contentPane.add(jLabel);

        Icon randomBasic = new ImageIcon(RandomButtonImage.BASIC.url());
        Icon randomHover = new ImageIcon(RandomButtonImage.HOVER.url());
        JButton randomBasicButton = new JButton(randomBasic);
        randomBasicButton.setRolloverIcon(randomHover);
        randomBasicButton.setLocation(EtcButton.RANDOM_BUTTON.getX(), EtcButton.RANDOM_BUTTON.getY());
        randomBasicButton.setSize(EtcButton.RANDOM_BUTTON.getWidth(), EtcButton.RANDOM_BUTTON.getHeight());
        randomBasicButton.setBorderPainted(false);
        randomBasicButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        contentPane.add(randomBasicButton);

        randomBasicButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                String selectedDistance = whatIsSelected(distanceGroup);
                String selectedFood = whatIsSelected(foodGroup);

                Restaurant restaurant = controller.getRestaurant(selectedDistance, selectedFood);

                jLabel.setText(restaurant.getName());
            }
        });
    }

    private void frameSetting() {
        setTitle(FRAME_TITLE);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
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
}
