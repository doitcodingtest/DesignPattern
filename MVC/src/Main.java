public class Main {
    public static void main(String[] args) {
        // DB에서 가져온 데이터라고 가정
        UserModel model = new UserModel(1, "하루코딩", "브론즈");
        UserView view = new UserView();
        // 컨트롤러 생성시 모델과 뷰를 매개변수로 추가
        UserController controller = new UserController(model, view);

        controller.updateView();
        controller.setUserGrade("골드");
        controller.updateView();
    }
}


