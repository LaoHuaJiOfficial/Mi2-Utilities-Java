package mi2u;

import arc.Core;
import arc.graphics.g2d.TextureRegion;

public class MI2UAssets {
    public static TextureRegion serverSync, ruleList, waveList, settingExpand, settingAll;

    public static void load() {
        serverSync = getSprite("server-sync");
        ruleList = getSprite("rule-list");
        waveList = getSprite("wave-list");
        settingExpand = getSprite("setting-expand");
        settingAll = getSprite("setting-all");
    }

    public static TextureRegion getSprite(String name) {
        return Core.atlas.find("mi2-utilities-java-" + name);
    }
}
