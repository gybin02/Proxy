package com.jet.ui.activity.user.controller.inject;

import android.content.Context;

import java.io.Serializable;

/**
 * @author zhengxiaobin
 * @since 16/11/11
 */
public interface IInjectCallback extends Serializable {
    void call(Context context);
}
