package com.seasword.web.wechat;

import org.sword.wechat4j.WechatSupport;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/4/10.
 */
public class DemoApp  extends WechatSupport {
    public DemoApp(HttpServletRequest request) {
        super(request);
    }

    @Override
    protected void onText() {
        String fromUserName = this.wechatRequest.getFromUserName();
        String content = this.wechatRequest.getContent();
        content = "Hi,"+fromUserName+"."+content;
        responseText(content);
    }

    @Override
    protected void onImage() {

    }

    @Override
    protected void onVoice() {

    }

    @Override
    protected void onVideo() {

    }

    @Override
    protected void onShortVideo() {

    }

    @Override
    protected void onLocation() {

    }

    @Override
    protected void onLink() {

    }

    @Override
    protected void onUnknown() {

    }

    @Override
    protected void click() {

    }

    @Override
    protected void subscribe() {

    }

    @Override
    protected void unSubscribe() {

    }

    @Override
    protected void scan() {

    }

    @Override
    protected void location() {

    }

    @Override
    protected void view() {

    }

    @Override
    protected void templateMsgCallback() {

    }

    @Override
    protected void scanCodePush() {

    }

    @Override
    protected void scanCodeWaitMsg() {

    }

    @Override
    protected void picSysPhoto() {

    }

    @Override
    protected void picPhotoOrAlbum() {

    }

    @Override
    protected void picWeixin() {

    }

    @Override
    protected void locationSelect() {

    }

    @Override
    protected void kfCreateSession() {

    }

    @Override
    protected void kfCloseSession() {

    }

    @Override
    protected void kfSwitchSession() {

    }
}
