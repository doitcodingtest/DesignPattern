public class UserController {
    private UserModel model;
    private UserView view;
    // 중재자 역할을 위해 모델과 뷰를 멤버변수로 가지고 있습니다.
    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserName(String name) {
        model.setName(name);
    }

    public void setUserGrade(String grade) {
        model.setGrade(grade);
    }

    public void updateView() { //모델이 수정되면 연관 뷰도 수정되도록 컨트롤러에서 제어 합니다.
        view.displayUserInfo(model.getId(), model.getName(), model.getGrade());
    }
}
