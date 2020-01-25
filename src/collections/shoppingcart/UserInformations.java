package collections.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class UserInformations {
    List<UserUI> userInfo = new ArrayList<>();

    private void addInfo(CartUI info) {
        userInfo.add(info);
    }

}
