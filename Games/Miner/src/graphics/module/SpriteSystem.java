package graphics.module;
//Система загрузки и хранения спрайтов для LWJGL

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SpriteSystem {
    //Загружает и хранит все доступные в игре текстуры

    enum Sprite{
        ZERO("0"),ONE("1"),TWO("2"),THREE("3"),FOUR("4"),FIVE("5"),
        SIX("6"),SEVEN("7"),EIGHT("8"),SPACE("space"),MINE("mine"),FLAG("flag"),
        BROKEN_FLAG("broken_flag"),EXPLOSION("explosion");

        private Texture texture;

        Sprite(String textureName){
            try{
                this.texture=TextureLoader.getTexture("PNG",new FileInputStream(new File("res/"+textureName+".png")));
            }catch (IOException e){e.printStackTrace();}
        }
        public Texture getTexture(){
            return this.texture;
        }
    }

    //Хранит в себе ссылки на все доступные в игре текстуры с ключом, равным изображённой на текстуре цифре
    public static final Sprite[] spriteByNumber={
            Sprite.ZERO,
            Sprite.ONE,
            Sprite.TWO,
            Sprite.THREE,
            Sprite.FOUR,
            Sprite.FIVE,
            Sprite.SIX,
            Sprite.SEVEN,
            Sprite.EIGHT
    };
}
