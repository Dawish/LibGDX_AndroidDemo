package com.danxx.gdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import javax.microedition.khronos.opengles.GL10;

/**
 * @Description:
 * @Author: Danxingxi
 * @CreateDate: 2016/12/7 19:20
 */
public class IAppListener implements ApplicationListener {

    /**
     * 舞台
     */
    Stage stage;
    /**
     * 演员
     */
    Image image;
    /**
     * 纹理，演员容器
     */
    Texture texture;

    /**
     * 画笔
     */
    SpriteBatch batch;


   @Override
    public void create() {
        stage = new Stage();
        texture = new Texture(Gdx.files.internal("data/test.png"));

        batch = new SpriteBatch();

//        image = new Image(texture);
//        stage.addActor(image);
//        Gdx.input.setInputProcessor(stage);//用stage来处理输入事件
    }

    @Override
    public void resize(int i, int i1) {

    }

    /**
     * 每一帧都会调用
     */
    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);     //设置背景颜色
        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); //清屏

       batch.begin();

       batch.draw(texture,0,0);

       batch.end();



//        stage.act();
//        stage.draw();
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
