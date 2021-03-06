package com.nvquang.retrofitokhttpdemo.screen.searchuser;

import com.nvquang.retrofitokhttpdemo.data.model.User;
import com.nvquang.retrofitokhttpdemo.screen.BasePresenter;

import java.util.List;

/**
 * Created by quangnv on 16/08/2018
 */

public class UsersContract {

    /**
     * View
     */
    interface View {

        void showUsers(List<User> users);
    }

    /**
     * Presenter
     */
    interface Presenter extends BasePresenter<View> {

        void searchUsers(String q);
    }
}
