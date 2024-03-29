/*
 *     (C) Copyright 2019, ForgetSky.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package com.forgetsky.wanandroid.modules.main.contract;

import com.forgetsky.wanandroid.base.presenter.IPresenter;
import com.forgetsky.wanandroid.base.view.IView;


/**
 *契约类用于管理接口
 * 管理的是CollectEventContract   接口
 *
 *
 */


public interface CollectEventContract {

    interface View extends IView {
        void showCollectSuccess(int position);
        void showCancelCollectSuccess(int position);
    }


    //CollectEventPresenter这个类去实现拱调用
    interface Presenter<V extends View> extends IPresenter<V> {

        void addCollectArticle(int postion, int id);
        void cancelCollectArticle(int postion, int id);

    }
}
