package me.levitate.plugintemplate;

import lombok.Getter;
import me.levitate.quill.api.QuillAPI;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
public final class PluginTemplate extends JavaPlugin {
    private QuillAPI quill;

    @Override
    public void onEnable() {
        quill = QuillAPI.builder()
                .plugin(this)
                .build();
    }
}
