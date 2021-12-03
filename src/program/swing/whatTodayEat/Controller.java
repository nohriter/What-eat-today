package program.swing.whatTodayEat;

public class Controller {
    private Model model = new Model();

    public ResponseDTO getRestaurant(RequestDTO requestDTO) {
        return model.getRestaurant(requestDTO);
    }
}
